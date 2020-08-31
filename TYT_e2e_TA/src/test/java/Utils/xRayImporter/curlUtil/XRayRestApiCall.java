package Utils.xRayImporter.curlUtil;

import Utils.xRayImporter.ResultStatus;
import Utils.xRayImporter.SerenityJSonReportObject;
import Utils.xRayImporter.TestSteps;
import org.jetbrains.annotations.NotNull;
import org.json.JSONArray;
import org.json.JSONObject;

import java.io.*;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;
import java.security.Permission;
import java.util.ArrayList;
import java.util.Base64;

import static java.nio.charset.StandardCharsets.UTF_8;

public class XRayRestApiCall {



    public void exportCucumberResult(){
        HttpURLConnection connection = null;
        JSONObject jsonObjectFromResponse = null;
        try {
            //store necessary query information
            URL jiraURL = new URL("https://toyotafleet.atlassian.net/rest/raven/1.0/import/execution/cucumber");
            String filePath = "target/cucumber.json";
            connection = processJiraConnection(jiraURL, filePath);
            BufferedReader in = new BufferedReader(new InputStreamReader(connection.getInputStream(), "UTF-8"));

            //put the json response in a JsonObject
            jsonObjectFromResponse = createJsonObjectFromResponse(in);
        } catch (MalformedURLException e) {
            System.err.println("MalformedURLException: " + e.getMessage());
        } catch (IOException e) {
            System.err.println("IOException: " + e.getMessage());
        }
    }

    private void UpdateTestExecution(String operation, String testExecutionKey, String testKey) {
        JSONObject testToUpdateObject = new JSONObject();
        JSONArray testToAdd = new JSONArray();
        JSONArray testToRemove = new JSONArray();
        switch (operation) {
            case "delete":
                testToRemove.put(testKey);
                break;
            case "add":
                testToAdd.put(testKey);
                break;
        }
        testToUpdateObject.put("add", testToAdd);
        testToUpdateObject.put("remove", testToRemove);
        try {
            URL jiraURL = new URL("https://int-statl-03.eventim.net/rest/raven/1.0/api/testexec/" + testExecutionKey + "/test");
            HttpURLConnection httpURLConnection = processJiraConnection(jiraURL, RestOperation.POST, testToUpdateObject.toString());
            new BufferedReader(new InputStreamReader(httpURLConnection.getInputStream(), "UTF-8"));
        } catch (MalformedURLException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    // method to call the resource from the API

    /**
     * This method get the test run Info from Jira and save the testRunID and the steps ID
     *
     * @param testKey key of the test.
     */
    public JSONObject getTestRunInfoFromJira(String testKey) {
        HttpURLConnection connection = null;
        JSONObject jsonObjectFromResponse = null;
        try {
            //store necessary query information
            URL jiraURL = new URL("https://toyotafleet.atlassian.net/rest/raven/1.0/import/execution/cucumber" + testKey + "/testruns");
            connection = processJiraConnection(jiraURL, RestOperation.GET);
            BufferedReader in = new BufferedReader(new InputStreamReader(connection.getInputStream(), "UTF-8"));

            //put the json response in a JsonObject
            jsonObjectFromResponse = createJsonObjectFromResponse(in);
        } catch (MalformedURLException e) {
            System.err.println("MalformedURLException: " + e.getMessage());
        } catch (IOException e) {
            System.err.println("IOException: " + e.getMessage());
        }
        return jsonObjectFromResponse;
    }



    private JSONObject createJsonObjectFromResponse(BufferedReader in) throws IOException {
        String inLine = in.readLine();
        JSONObject jsonObject = null;
        //sometime the response start with '{' no need to remove the '[',']' chars
        if (inLine.startsWith("[")) {
            // the JsonObject need that the string begin with '{' we need to remove this chars: '[', ']'
            // at the beginning and end of the response
            String inLine2 = inLine.substring(1, inLine.length() - 1);
            jsonObject = new JSONObject(inLine2);
        }
        return jsonObject;
    }

    @NotNull
    private HttpURLConnection processJiraConnection(URL jiraURL, RestOperation restOperation) throws IOException {
        return processJiraConnection(jiraURL, restOperation, "");
    }

    private HttpURLConnection processJiraConnection(URL jiraURL, String filePath) throws IOException {
        HttpURLConnection connection;

        // creates a unique boundary based on time stamp
        String login = "tfred@live.de:PdnYdN4XqxvFHLX"; //TODO make it as parameter
        final byte[] authBytes = login.getBytes(UTF_8);
        String encoded = Base64.getEncoder().withoutPadding().encodeToString(authBytes);

        connection = (HttpURLConnection) jiraURL.openConnection();
        connection.setRequestProperty("Connection", "Keep-Alive");
        connection.setRequestProperty("Content-Type", "multipart/form-data");
        connection.setRequestProperty("Authorization", "Basic " + encoded);
        connection.setRequestMethod(RestOperation.POST.name());
        connection.setUseCaches(false);
        connection.setDoOutput(true);
        connection.setDoInput(true);

        OutputStream outputStream = connection.getOutputStream();
        PrintWriter writer = new PrintWriter(new OutputStreamWriter(outputStream, UTF_8),
            true);
        connection.connect();
        Permission  permission = connection.getPermission();
        // send data if necessary

//        InputStream inputStream = connection.getInputStream();
//        BufferedInputStream reader = new BufferedInputStream(inputStream);

        FileInputStream inputStream = new FileInputStream(filePath);
        System.out.println(filePath);

        byte[] buffer = new byte[4096];
        int bytesRead = -1;
        DataOutputStream wr = new DataOutputStream(outputStream);

        while ((bytesRead = inputStream.read(buffer)) != -1) {
           wr.write(buffer, 0, bytesRead);
           wr.flush();
        }


        wr.close();
        inputStream.close();
        return connection;
    }
    @NotNull
    private HttpURLConnection processJiraConnection(URL jiraURL, RestOperation restOperation, String data) throws IOException {
        HttpURLConnection connection;
        String login = "tfred@live.de:PdnYdN4XqxvFHLX"; //TODO make it as parameter
        final byte[] authBytes = login.getBytes(UTF_8);
        String encoded = Base64.getEncoder().withoutPadding().encodeToString(authBytes);
        byte[] dataBytes = data.getBytes("UTF-8");

        //establish connection and request properties
        connection = (HttpURLConnection) jiraURL.openConnection();
        connection.setRequestMethod(restOperation.name());
        connection.setRequestProperty("Accept", "*/*");
        connection.setRequestProperty("Content-Type", "application/json");
        connection.setRequestProperty("Authorization", "Basic " + encoded);
        connection.setUseCaches(false);
        connection.setDoOutput(true);
        connection.setDoInput(true);

        connection.connect();
        // send data if necessary
        if (!data.equals("")) {
            DataOutputStream wr = new DataOutputStream(connection.getOutputStream());
            wr.write(dataBytes);
            wr.flush();
            wr.close();
        }
        return connection;
    }


    public static void main(String[] args) throws Exception {


        // do the Xray Api call
        XRayRestApiCall xRayRestApiCall = new XRayRestApiCall();
        xRayRestApiCall.exportCucumberResult();
    }
}
