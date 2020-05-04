package e2eTests.stepdefinitions.milesRia;

import Pages.home.HomePage;
import Pages.milesRiaPages.LongTermContractsPage;
import net.thucydides.core.annotations.Step;

public class LongTermContractsMRSteps {

    LongTermContractsPage longTermContractsPage;
    HomePage homePage;

    @Step("The dealer click on vehicle")
    public void clickOnVehicle() {
        longTermContractsPage.getVehicleMRComponent().clickOnVehicle();
    }

    @Step("The dealer go to the Long terms contract tab")
    public void openMRTab(String countryUrl, int tabIndex) {
        homePage.openURL(countryUrl+"#tab_"+tabIndex);
    }

    @Step("The dealer Open the vehicle")
    public void openVehicle() {
        longTermContractsPage.getTopBarTabs().clickOnOpenVehicle();
    }

    @Step("The dealer open the vehicle usage menu")
    public void clickOnVehicleUsages() {
        longTermContractsPage.getVehicleUsagesMRComponent().clickOnVehicleUsages();
    }

    @Step("The dealer open the registration document")
    public void clickOnRegistrationAndDocuments() {
        longTermContractsPage.getVehicleUsagesMRComponent().clickOnRegistrationAndDocuments();
    }

    @Step("The dealer set the registration number")
    public void registeredLicencePlate() {
        longTermContractsPage.getVehicleUsagesMRComponent().registeredLicencePlate("");
    }

    @Step("The dealer set the registration date")
    public void setRegistrationDate(String futureDate) {
        longTermContractsPage.getVehicleUsagesMRComponent().setRegistrationDate(futureDate);
    }
}
