package e2eTests.stepdefinitions.milesRia;

import Pages.milesRiaTabs.PurchaseInvoicesTab;
import net.thucydides.core.annotations.Step;

public class PurchaseInvoicesSteps {

    PurchaseInvoicesTab purchaseInvoicesTab;

    @Step("The dealer set the invoice number to: {0}")
    public void setInvoiceNumber(String invoiceNumber) {
        purchaseInvoicesTab.getPurchaseInvoiceMRComponent().setInvoiceNumber(invoiceNumber);
    }

    @Step("The dealer click on Validate")
    public void processValidate() {
        purchaseInvoicesTab.getPurchaseInvoiceMRComponent().processValidate();
    }
}
