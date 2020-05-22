package Utils.constance;

public enum CountryIP {

    ITALY_IP("https://10.7.25.20:10143/milesria/"),
    FRANCE_IP("http://10.7.25.10:9480/milesria/");



    private String milesRiaIP;

    CountryIP(String milesRiaIP) {
        this.milesRiaIP = milesRiaIP;
    }

    public String getMilesRiaIP() {
        return milesRiaIP;
    }
}
