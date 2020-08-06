package Utils.xRayImporter;

import java.util.ArrayList;

public class SerenityJSonReportObject {

    private String name;
    private String id;
    private String componentName;
    private ArrayList< TestSteps > testSteps = new ArrayList <> ();
    private String title;
    private ArrayList < String > coreIssues = new ArrayList <> ();
    ArrayList <Tag> tags = new ArrayList <> ();
    DataTable DataTableObject;
    private String result;


    // Getter Methods

    public String getName() {
        return name;
    }

    public String getId() {
        return id;
    }

    public String getComponentName() {
        return componentName;
    }


    public String getTitle() {
        return title;
    }

    public DataTable getDataTable() {
        return DataTableObject;
    }
    public String getResult() {
        return result;
    }
    public ArrayList<String> getCoreIssues() {
        return coreIssues;
    }


    // Setter Methods

    public void setName(String name) {
        this.name = name;
    }

    public void setId(String id) {
        this.id = id;
    }

    public void setComponentName(String componentName) {
        this.componentName = componentName;
    }


    public void setTitle(String title) {
        this.title = title;
    }

    public void setDataTable(DataTable dataTableObject) {
        this.DataTableObject = dataTableObject;
    }

    public void setResult(String result) {
        this.result = result;
    }


    public ArrayList<TestSteps> getTestSteps() {
        return testSteps;
    }

    public void setTestSteps(ArrayList<TestSteps> testSteps) {
        this.testSteps = testSteps;
    }

    @Override
    public String toString() {
        return "SerenityJSonReportObject{" +
            "  \n       name='" + name + '\'' +
            ", \n       id='" + id + '\'' +
            ", \n       componentName='" + componentName + '\'' +
            ", \n       testSteps=" + testSteps +
            ", \n       title='" + title + '\'' +
            ", \n       coreIssues=" + coreIssues +
            ", \n       tags=" + tags +
            ", \n       DataTableObject=" + DataTableObject +
            ", \n       result='" + result + '\'' +
            '}';
    }
}

