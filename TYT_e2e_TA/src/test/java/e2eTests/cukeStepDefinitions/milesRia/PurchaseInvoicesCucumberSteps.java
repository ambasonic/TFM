package e2eTests.cukeStepDefinitions.milesRia;

import Utils.generatedTestData.TestDataGenerator;
import e2eTests.stepdefinitions.milesRia.PurchaseInvoicesSteps;
import io.cucumber.java.en.And;
import net.thucydides.core.annotations.Steps;

public class PurchaseInvoicesCucumberSteps extends TestDataGenerator {

    @Steps
    PurchaseInvoicesSteps purchaseInvoicesSteps;

    @And("he set the invoice number")
    public void heSetTheInvoiceNumber() {
        purchaseInvoicesSteps.setInvoiceNumber(getInvoiceNumber(8));
    }

    @And("he validate the process")
    public void heValidateTheProcess() {
        purchaseInvoicesSteps.processValidate();
    }
}
