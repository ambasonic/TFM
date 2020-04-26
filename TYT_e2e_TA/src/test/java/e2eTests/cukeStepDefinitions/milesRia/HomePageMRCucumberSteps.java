package e2eTests.cukeStepDefinitions.milesRia;

import e2eTests.stepdefinitions.milesRia.HomePageMRSteps;
import io.cucumber.java.en.Given;
import net.thucydides.core.annotations.Steps;

import static Utils.constance.MenuName.QUOTES;

public class HomePageMRCucumberSteps {

    @Steps
    HomePageMRSteps homePageMRSteps;


    @Given("he search a quote {string}")
    public void he_search_a_quote(String quoteId) {
        homePageMRSteps.selectQuotesInQuickAccess(QUOTES.getName());
        homePageMRSteps.searchQuote(quoteId);
    }
}
