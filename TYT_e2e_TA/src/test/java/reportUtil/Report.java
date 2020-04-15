package reportUtil;

public class Report {


    private String testScenario;
    private String totalPrice;
    private String optionPrice;

    public Report(String testScenario, String totalPrice, String optionPrice) {
        this.testScenario = testScenario;
        this.totalPrice = totalPrice;
        this.optionPrice = optionPrice;
    }

    public void setTestScenario(String testScenario) {
        this.testScenario = testScenario;
    }

    public void setTotalPrice(String totalPrice) {
        this.totalPrice = totalPrice;
    }

    public void setOptionPrice(String optionPrice) {
        this.optionPrice = optionPrice;
    }

    public String getTestScenario() {
        return testScenario;
    }

    public String getTotalPrice() {
        return totalPrice;
    }

    public String getOptionPrice() {
        return optionPrice;
    }
}
