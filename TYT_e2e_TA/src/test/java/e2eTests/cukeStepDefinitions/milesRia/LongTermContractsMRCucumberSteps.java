package e2eTests.cukeStepDefinitions.milesRia;

import Utils.generatedTestData.TestDataGenerator;
import Utils.generatedTestData.VinGeneratorUtils;
import e2eTests.stepdefinitions.milesRia.LongTermContractsMRSteps;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.thucydides.core.annotations.Steps;

public class LongTermContractsMRCucumberSteps extends TestDataGenerator {

    @Steps
    LongTermContractsMRSteps longTermContractsMRSteps;

    @Then("he can see the generated long term contract")
    public void heCanSeeTheGeneratedLongTermContract() {
    }

    @And("he create a vehicle Order")
    public void create_Vehicle_Order() {
        longTermContractsMRSteps.clickOnVehicle();
    }
    @And("he click on the vehicle order link")
    public void click_On_Vehicle_Order_Link() {
        longTermContractsMRSteps.clickOnVehicleOrderByLink();
    }

    @When("he open the long term contract")
    public void heOpenTheLongTermContract() {
        longTermContractsMRSteps.openMRTab( ); //TODO refactor creer un context Italy des le d?but des Tests
    }

    @Then("he select the vehicle usage")
    public void heSelectTheVehicleUsage() {
        longTermContractsMRSteps.clickOnVehicleUsages();
    }

    @And("he registered the vehicle plates")
    public void heRegisteredTheVehiclePlates() {
        longTermContractsMRSteps.clickOnRegistrationAndDocuments();
        longTermContractsMRSteps.setVINNr(VinGeneratorUtils.getRandomVin());
        longTermContractsMRSteps.registeredLicencePlate(getLicenceNumberFrance());
        longTermContractsMRSteps.setRegistrationDate(getActualDate());
    }

    @And("he open the vehicle")
    public void heOpenTheVehicle() {
        longTermContractsMRSteps.openVehicle();
    }

    @And("he calculate")
    public void heCalculate() {
        longTermContractsMRSteps.clickOnCalculate();
    }

    @And("he select the {string} as delivery")
    public void heSelectTheExpressDeliveryAsDelivery(String delivery) {
        longTermContractsMRSteps.clickOnDelivery();
        longTermContractsMRSteps.selectTheDelivery(delivery); //TODO IMPLEMENT
    }

    @And("he set the distance")
    public void heSetTheDistance() {
        longTermContractsMRSteps.setDistance(getDistance(1));
    }

    @Then("he deliver")
    public void heDeliver() {
        longTermContractsMRSteps.clickOnDeliver();
    }

    @Then("he opens the workflow and he selects the contract initiation")
    public void heOpensTheWorkflowAndHeSelectsTheContractInitiation() {
        longTermContractsMRSteps.clickOnContractInitiation();
    }
    @Then("he opens the workflow and he selects the contract Activation")
    public void heOpensTheWorkflowAndHeSelectsTheContractActivation() {
        longTermContractsMRSteps.clickOnContractInitiation();
    }


    @And("he reevaluates the contract and close the tab")
    public void heReevaluatesTheContractAndCloseTheTab() {
        longTermContractsMRSteps.reevaluatesContractAndCloseTheTab();
    }

    @And("he checks the status {string}")
    public void heChecksTheStatus(String status) {
        longTermContractsMRSteps.checkTheStatus(status);

    }
}
