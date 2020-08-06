package Utils.xRayImporter;

import Utils.xRayImporter.curlUtil.FileExtensionName;
import Utils.xRayImporter.curlUtil.XRayRestApiCall;
import org.json.JSONArray;
import org.json.JSONObject;

import java.io.File;
import java.util.ArrayList;
import java.util.List;

public class XrayRequestManager {

    private String testKey;
    private XRayRestApiCall xRayRestApiCall = new XRayRestApiCall();

    public void xRayTestStepsImporter(SerenityJSonReportObject serenityJSonReportObject) throws Exception {

        JSONObject testStepObject = new JSONObject();
        int count = 0; //TODO remove
        for (TestSteps item : serenityJSonReportObject.getTestSteps().get(0).getChildren()) {
//            if (count == 4) break;
//             System.out.println(count);
            JSONArray attachment = new JSONArray();
            testStepObject.put("result", "done");
            testStepObject.put("step", item.getDescription());
            testStepObject.put("attachments", attachment);
            testStepObject.put("data", ""); // TODO check if it is necessary to have step data
            testKey = serenityJSonReportObject.getCoreIssues().get(0); // TODO What happens if i have more than one Jira Issue; (I propose one Issue pro Test)
//            count++;

// TODO remove
//             Files.write(Paths.get("C:\\Users\\frtchambo\\Desktop\\xray\\jsonFile.json"), testStepObject.toString().getBytes());
        }
    }

    public void xRayUpdateStatusOfTestStep(JSONObject testRunInfoFromJira, SerenityJSonReportObject serenityJSonReportObject) {

    }

    public void methodProvisoire (SerenityJSonReportObject serenityJSonReportObject){
        this.testKey = serenityJSonReportObject.getCoreIssues().get(0).replace("\"", "");
        JSONObject testRunInfoFromJira = xRayRestApiCall.getTestRunInfoFromJira(this.testKey);
        String testExecKey = testRunInfoFromJira.getString("testExecKey").replace("\"", "");
    }

//    /**
//     * This method reimport the test step into the test-execution if the test-steps are modify after
//     * the creation of the test-execution. The test will be removed then added to take the update
//     */
//    public void xRayUpdateTestExecutions(String testExecutionKey, ArrayList<String> testExKeysToUpdate){
//        xRayRestApiCall.updateTestExecution(testExecutionKey, testExKeysToUpdate);
//
//     }

    public void updateTestExec(SerenityJSonReportObject serenityJSonReportObject) {
        this.testKey = serenityJSonReportObject.getCoreIssues().get(0).replace("\"", "");
        JSONObject testRunInfoFromJira = xRayRestApiCall.getTestRunInfoFromJira(this.testKey);
        String testExecKey = testRunInfoFromJira.getString("testExecKey").replace("\"", "");
//
//        xRayRestApiCall.updateTestExecution(testExecKey, this.testKey);
        //Update TestStatus
        xRayUpdateStatusOfTestStep(testRunInfoFromJira, serenityJSonReportObject);
    }

    public static void main(String[] args) throws Exception {

        //read serenity report object
        ReportObjectBuilder reportObjectBuilder = new ReportObjectBuilder();
        ReportsReader reportsReader = new ReportsReader();
        List<String> filesPath = reportsReader.loadReportsFiles(FileExtensionName.json.name());

//        List<String> filesPath = reportsReader.loadReportsFiles(FileExtensionName.xml.name());
        ArrayList<SerenityJSonReportObject> serenityJSonReportObjects = reportObjectBuilder.loadJsonObject(filesPath);
        //generate json object for the Xray Api call
        XrayRequestManager xrayRequestManager = new XrayRequestManager();

        //step 1


        //Set the new TestExc Status
//        xrayRequestManager.xRayUpdateTestExecutions("WEB-38001", serenityJSonReportObject.getCoreIssues());

        for (SerenityJSonReportObject report: serenityJSonReportObjects) {
//            xrayRequestManager.xRayTestStepsImporter(report); // the Step importer should be start only the first time
            xrayRequestManager.methodProvisoire(report);
            xrayRequestManager.updateTestExec(report);

//            xrayRequestManager.xRayRestApiCall.importJunitXMLReport("WEB-38019", filesPath.get(0));
//            WEB-38019
        }




    }


}
