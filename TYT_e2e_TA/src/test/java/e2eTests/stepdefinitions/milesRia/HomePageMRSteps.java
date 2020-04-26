package e2eTests.stepdefinitions.milesRia;

import Pages.dealerHome.MilesRiaHomePage;
import net.thucydides.core.annotations.Step;

public class HomePageMRSteps {

    MilesRiaHomePage milesRiaHomePage;

    @Step("The dealer select quotes in quick access")
    public void selectQuotesInQuickAccess(String menuName) {
        milesRiaHomePage.getMilesRiaTopHeaderComponent().setQuickAccessMenu(menuName);
    }

    @Step("The dealer search the quoteId: {0}")
    public void searchQuote(String quoteId) {
        milesRiaHomePage.getMilesRiaTopHeaderComponent().searchQuote(quoteId);
    }
}
