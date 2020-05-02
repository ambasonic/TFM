package e2eTests.stepdefinitions.milesRia;

import Pages.milesRiaTabs.LongTermContractsTab;
import net.thucydides.core.annotations.Step;

public class LongTermContractsMRSteps {

    LongTermContractsTab longTermContractsTab;

    @Step("The dealer click on vehicle")
    public void clickOnVehicle() {
        longTermContractsTab.getVehicleMRComponent().clickOnVehicle();
    }

    @Step("The dealer go to the Long terms contract tab")
    public void OpenLTCTab() {
        longTermContractsTab.open("https://10.7.25.20:10143/milesria/#tab_2"); //TODO refactor
        String s = "";
    }
}
