package e2eTests.cukeStepDefinitions.milesRia;

import Utils.DateUtilsMR;
import Utils.constance.Country;
import e2eTests.stepdefinitions.milesRia.LongTermContractsMRSteps;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.thucydides.core.annotations.Steps;

public class LongTermContractsMRCucumberSteps {

    @Steps
    LongTermContractsMRSteps longTermContractsMRSteps;

    @Then("he can see the generated long term contract")
    public void heCanSeeTheGeneratedLongTermContract() {
    }

    @And("he create a vehicle Order")
    public void create_Vehicle_Order() {
        longTermContractsMRSteps.clickOnVehicle();
    }

    @When("he open the long term contract")
    public void heOpenTheLongTermContract() {
        longTermContractsMRSteps.openMRTab(Country.ITALY.getMilesRiaURL(), 2); //TODO refactor creer un context Italy des le d?but des Tests
    }

    @Then("he select the vehicle usage")
    public void heSelectTheVehicleUsage() {
        longTermContractsMRSteps.clickOnVehicleUsages();
    }

    @And("he registered the vehicle plates")
    public void heRegisteredTheVehiclePlates() {
        longTermContractsMRSteps.clickOnRegistrationAndDocuments();
        longTermContractsMRSteps.registeredLicencePlate();
        longTermContractsMRSteps.setRegistrationDate(DateUtilsMR.getFutureDate(0));
    }

    @And("he set the chassis number {string}")
    public void heSetTheChassisNumberVinNr(String vinNr) {
        longTermContractsMRSteps.setVINNr(vinNr);
    }

    @And("he open the vehicle")
    public void heOpenTheVehicle() {
        longTermContractsMRSteps.openVehicle();
    }

    @And("he calculate")
    public void heCalculate() {
        longTermContractsMRSteps.clickOnCalculate();
    }
}
