package Utils.constance;

public enum TabName {
    QUOTE("Quote"),
    LONG_TERM_CONTRACTS("LTC");

    public String getTabName() {
        return tabName;
    }

    private final String tabName;

    TabName(String tabName) {
        this.tabName = tabName;
    }
}
