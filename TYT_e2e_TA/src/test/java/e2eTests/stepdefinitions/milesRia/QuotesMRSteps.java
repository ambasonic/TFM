package e2eTests.stepdefinitions.milesRia;

import Pages.milesRiaTabs.QuotesTab;
import net.thucydides.core.annotations.Step;

import static org.hamcrest.Matchers.is;
import static org.junit.Assert.assertThat;

public class QuotesMRSteps {

    QuotesTab quotesTab;

    @Step("The dealer click on Credit Scores")
    public void selectCreditScore() {
        String selectedElement = quotesTab.getCreditScoreMRComponent().selectCreditScore();
        assertThat(selectedElement ,is("Credit Scores"));
    }

    @Step("The dealer set the status to {0}")
    public void setStatus(String status) {
        quotesTab.getCreditScoreMRComponent().setStatus(status);
    }

    @Step("The dealer set the decision to {0}")
    public void setDecision(String decision) {
        quotesTab.getCreditScoreMRComponent().setDecision(decision);
    }

    @Step("The dealer click on contract")
    public void clickOnContract() {
        quotesTab.getCreditScoreMRComponent().clickOnContract();
    }

    @Step("The dealer select the resulting contract")
    public void selectResultingContracts() {
       quotesTab.getResultingContractMRComponent().selectContract();
    }
}
