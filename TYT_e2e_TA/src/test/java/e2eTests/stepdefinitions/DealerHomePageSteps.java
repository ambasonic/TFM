package e2eTests.stepdefinitions;

import Pages.dealerHome.DealerHomePage;
import net.thucydides.core.annotations.Step;

public class DealerHomePageSteps {

    DealerHomePage dealerHomePage;

    @Step("The dealer select a new quotation")
    public void selectNewQuotation() {
        dealerHomePage.getQuotationComponent().selectNewQuotation();
    }
}
