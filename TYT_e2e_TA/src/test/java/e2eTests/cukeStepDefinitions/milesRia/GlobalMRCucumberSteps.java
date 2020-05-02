package e2eTests.cukeStepDefinitions.milesRia;

import e2eTests.stepdefinitions.milesRia.GlobalMrSteps;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import net.thucydides.core.annotations.Steps;

public class GlobalMRCucumberSteps {

    @Steps
    GlobalMrSteps globalMrSteps;


    @Then("he saved")
    public void heSaved() {
        globalMrSteps.clickOnSaved();
    }

    @And("he validate")
    public void heValidate() {
        globalMrSteps.clickOnValidate();
    }

    @And("he approve")
    public void heApprove() {
        globalMrSteps.clickOnApprove();
    }

    @And("he create an invoice from the vehicle order")
    public void heCreateAnInvoiceFromTheVehicleOrder() {
        globalMrSteps.clickOnNewInvoice();
    }
}
