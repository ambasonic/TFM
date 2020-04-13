package reportUtil;

public enum CellName {

    ACTUAL_RESULT("  Actual result  "),
    EXPECTED_RESULT("  Expected result  "),
    OPTION_ACCESSORIES("Option/Accessories"),
    DISCOUNTED_PRICE("Discounted price"),
    LEASE_PRICE("Lease Price"),
    SERVICES("Services");


    private final String description;

    CellName(String description) {
        this.description = description;
    }

    public String getDescription() {
        return description;
    }
}
