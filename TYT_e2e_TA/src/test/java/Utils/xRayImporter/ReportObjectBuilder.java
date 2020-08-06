package Utils.xRayImporter;

import javax.json.*;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

public class ReportObjectBuilder {

    private JsonObject jsonObject;


    public ArrayList<SerenityJSonReportObject> loadJsonObject(List<String> filesPath) {

        ArrayList<SerenityJSonReportObject> reportObjects = new ArrayList<>();


        for (String path: filesPath) {
            SerenityJSonReportObject serenityJSonReportObject = new SerenityJSonReportObject();
            File fileName = new File(path);

            JsonObject jsonObject = getJsonObject(fileName);
            String testResult = jsonObject.getString("result");
            // Not needs to add pending test
            if (testResult.equalsIgnoreCase("pending")) {
                break;
            }
            //fill core issue f not null
            JsonArray coreIssues = jsonObject.getJsonArray("coreIssues");
            if(coreIssues == null){
                break;
            }
            //fill core Issue i
            for (JsonValue item : coreIssues) {
                serenityJSonReportObject.getCoreIssues().add(item.toString().replace("\"", ""));
            };


            //fill the name
            serenityJSonReportObject.setName(jsonObject.getString("name"));
            //fill the component name
            String testCaseName = jsonObject.getString("testCaseName");
            String[] split = testCaseName.split("[.]");
            serenityJSonReportObject.setComponentName(split[split.length - 2]);
            //fill the title
            serenityJSonReportObject.setTitle(jsonObject.getString("title"));
            //fill the steps
            TestSteps testSteps = new TestSteps();
            JsonObject testStepsValue = jsonObject.getJsonArray("testSteps").getJsonObject(0);
            //        the first step is not a step but the title, please ignore de first ones
            testSteps.setDescription("");
            // fill the main Step
            serenityJSonReportObject.getTestSteps().add(testSteps);
            JsonArray children = testStepsValue.getJsonArray("children");
            for (int i = 0; i < children.size(); i++) {
                fillTestStepChildren(serenityJSonReportObject, children, i);
                for (Map.Entry<String, JsonValue> entries : children.getJsonObject(i).entrySet()) {
                    if (entries.getKey().equals("children")) {
                        JsonArray subChildren = children.getJsonObject(i).getJsonArray("children");
                        for (int j = 0; j < subChildren.size(); j++) {
                            fillTestStepChildren(serenityJSonReportObject, subChildren, j);
                        }
                    }
                }
            }
            //fill tags TODO
            JsonArray tags = jsonObject.getJsonArray("tags");
            // fill Test result
            fillTestStatus(jsonObject, serenityJSonReportObject);
            //create a list of reportObject
            reportObjects.add(serenityJSonReportObject);
        }
        return reportObjects;
    }

    private void fillTestStatus(JsonObject jsonObject, SerenityJSonReportObject serenityJSonReportObject) {
        String testResult = jsonObject.getString("result");
        switch (testResult.toLowerCase()) {
            case "success":
                serenityJSonReportObject.setResult(ResultStatus.PASS.name());
                break;
            case "failure":
                serenityJSonReportObject.setResult(ResultStatus.FAIL.name());
                break;
            case "skipped":
                serenityJSonReportObject.setResult(ResultStatus.TODO.name());
                break;
        }
    }

    private void fillTestStepChildren(SerenityJSonReportObject serenityJSonReportObject, JsonArray children, int i) {
        TestSteps childTestSteps = new TestSteps();
        childTestSteps.setDescription(children.getJsonObject(i).getString("description"));
        String childResult = children.getJsonObject(i).getString("result");
        switch (childResult.toLowerCase()) {
            case "success":
                childTestSteps.setResult(ResultStatus.PASS);
                break;
            case "failure":
                childTestSteps.setResult(ResultStatus.FAIL);
                break;
            case "skipped":
                childTestSteps.setResult(ResultStatus.TODO);
                break;
        }
        serenityJSonReportObject.getTestSteps().get(0).getChildren().
            add(childTestSteps);
    }

    public static void main(String[] args) throws Exception {

    }

    public JsonObject getJsonObject(File fileName) {
        InputStream is;
        try {
            is = new FileInputStream(fileName);
            // Create JsonReader from Json.
            JsonReader reader = Json.createReader(is);
            // Get the JsonObject structure from JsonReader.
            jsonObject = reader.readObject();
            reader.close();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
        return jsonObject;
    }
}
