package e2eTests.stepdefinitions.milesRia;

import Pages.milesRiaTabs.LongTermContractsTab;
import net.thucydides.core.annotations.Step;

public class LongTermContractsMRSteps {

    LongTermContractsTab longTermContractsTab;

    @Step("The dealer click on vehicle")
    public void clickOnVehicle() {
        longTermContractsTab.getVehicleMRComponent().clickOnVehicle();
    }
}
