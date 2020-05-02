package e2eTests.cukeStepDefinitions.milesRia;

import e2eTests.stepdefinitions.milesRia.PurchaseInvoicesSteps;
import io.cucumber.java.en.And;
import net.thucydides.core.annotations.Steps;

public class PurchaseInvoicesCucumberSteps {

    @Steps
    PurchaseInvoicesSteps purchaseInvoicesSteps;

    @And("he set the invoice number")
    public void heSetTheInvoiceNumber() {
        purchaseInvoicesSteps.setInvoiceNumber("552FB33"); //TODO generate INvoice number
    }

    @And("he validate the process")
    public void heValidateTheProcess() {
        purchaseInvoicesSteps.processValidate();
    }
}
