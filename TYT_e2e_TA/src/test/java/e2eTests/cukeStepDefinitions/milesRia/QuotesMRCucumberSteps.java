package e2eTests.cukeStepDefinitions.milesRia;

import e2eTests.stepdefinitions.milesRia.QuotesMRSteps;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.thucydides.core.annotations.Steps;

public class QuotesMRCucumberSteps {

    @Steps
    QuotesMRSteps quotesMRSteps;

    @When("he selects the credit score")
    public void he_selects_the_credit_score() {
        quotesMRSteps.selectCreditScore();
    }

    @And("he set the status to {string} and the decision to {string}")
    public void set_Status_And_Decision(String status, String decision) {
        quotesMRSteps.setStatus(status);
        quotesMRSteps.setDecision(decision);
    }

    @Then("he generate the contract")
    public void generateContract() {
        quotesMRSteps.clickOnContract();
    }

    @When("he selects the resulting contract")
    public void selectResultingContracts() {
        quotesMRSteps.selectResultingContracts();
    }

    @When("he selects stipulation")
    public void selectsStipulation() {
        quotesMRSteps.selectStipulation();
    }

    @And("he activates the selected stipulation")
    public void selectedStipulationActivation() {
        quotesMRSteps.activateStipulation();
    }
}
