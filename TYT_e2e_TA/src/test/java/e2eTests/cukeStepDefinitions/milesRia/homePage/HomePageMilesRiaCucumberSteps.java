package e2eTests.cukeStepDefinitions.milesRia.homePage;

import e2eTests.stepdefinitions.milesRia.HomePageMilesRiaSteps;
import io.cucumber.java.en.And;
import net.thucydides.core.annotations.Steps;

import static Utils.MenuName.QUOTES;

public class HomePageMilesRiaCucumberSteps {

    @Steps
    HomePageMilesRiaSteps homePageMilesRiaSteps;


    @And("he search a quote {string}")
    public void heSearchAQuoteQuoteID(String quoteId) {
        homePageMilesRiaSteps.selectQuotesInQuickAccess(QUOTES.name());
        homePageMilesRiaSteps.searchQuote(quoteId);
    }
}
