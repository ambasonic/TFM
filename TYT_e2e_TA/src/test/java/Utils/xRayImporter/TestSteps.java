package Utils.xRayImporter;

import java.util.ArrayList;

public class TestSteps {

    private String description;
    private int duration;
    private ResultStatus result;
    private ArrayList<TestSteps> children = new ArrayList<>();

    public String getDescription() {
        return description;
    }

    public int getDuration() {
        return duration;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public void setDuration(int duration) {
        this.duration = duration;
    }

    public ArrayList<TestSteps> getChildren() {
        return children;
    }

    public void setChildren(ArrayList<TestSteps> children) {
        this.children = children;
    }

    public void setResult(ResultStatus result) {
        this.result = result;
    }

    public ResultStatus getResult() {
        return result;
    }

    @Override
    public String toString() {
        return "TestSteps{" +
            ",\n            description='" + description + '\'' +
            ",\n            duration=" + duration +
            ",\n            result=" + result +
            ",\n            children=" + children +
            '}';
    }

}
