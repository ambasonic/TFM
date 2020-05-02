package e2eTests.cukeStepDefinitions.milesRia;

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
        longTermContractsMRSteps.OpenLTCTab();
    }
}
