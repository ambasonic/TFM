package Utils.constance;

public enum Country {
    ITALY("https://10.7.25.20:10143/milesria/",""),
    FRANCE("http://10.7.25.10:9480/milesria/","");



    private String milesRiaURL;
    private String milesWebURL;

    Country(String milesRiaURL, String milesWebURL) {
        this.milesRiaURL = milesRiaURL;
        this.milesWebURL = milesWebURL;
    }

    public String getMilesWebURL() {
        return milesWebURL;
    }

    public String getMilesRiaURL() {
        return milesRiaURL;
    }
}
