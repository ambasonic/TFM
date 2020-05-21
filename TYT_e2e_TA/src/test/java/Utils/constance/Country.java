package Utils.constance;

public enum Country {
    ITALY("https://10.7.25.20:10143/milesria/","https://10.7.25.20:9943/TFMIT_TST/user/login.xhtml"),
    FRANCE("http://10.7.25.10:9480/milesria/","http://10.7.25.10:8080/TFMFR_TST/user/login.xhtml");



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
