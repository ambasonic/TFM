package Utils;

public class CurrentProperties {

    private String currentCountry;

    public CurrentProperties(String currentCountry) {
        this.currentCountry = currentCountry;
    }

    public void setCurrentCountry(String currentCountry) {
        this.currentCountry = currentCountry;
    }

    public String getCurrentCountry() {
        return currentCountry;
    }
}
