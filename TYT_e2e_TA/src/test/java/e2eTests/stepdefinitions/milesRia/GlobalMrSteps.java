package e2eTests.stepdefinitions.milesRia;

import Pages.milesRiaTabs.TopBarTabs;
import net.thucydides.core.annotations.Step;

public class GlobalMrSteps {

    TopBarTabs topBarTabs;


    @Step("The dealer click on save")
    public void clickOnSaved() {
        topBarTabs.clickOnSaved();
    }

    @Step("The dealer click on validate")
    public void clickOnValidate() {
        topBarTabs.clickOnValidate();
    }

    @Step("The dealer click on approve")
    public void clickOnApprove() {
        topBarTabs.clickOnApprove();
    }

    @Step("The dealer click on new invoice")
    public void clickOnNewInvoice() {
        topBarTabs.clickOnNewInvoice();
    }

}
