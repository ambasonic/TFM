package e2eTests.stepdefinitions.milesRia;

import Pages.milesRiaPages.QuotesPage;
import net.thucydides.core.annotations.Step;

import static org.hamcrest.Matchers.is;
import static org.junit.Assert.assertThat;

public class QuotesMRSteps {

    QuotesPage quotesPage;

    @Step("The dealer click on Credit Scores")
    public void selectCreditScore() {
        String selectedElement = quotesPage.getCreditScoreMRComponent().selectCreditScore();
        assertThat(selectedElement ,is("Credit Scores"));
    }

    @Step("The dealer set the status to {0}")
    public void setStatus(String status) {
        quotesPage.getCreditScoreMRComponent().setStatus(status);
    }

    @Step("The dealer set the decision to {0}")
    public void setDecision(String decision) {
        quotesPage.getCreditScoreMRComponent().setDecision(decision);
    }

    @Step("The dealer click on contract")
    public void clickOnContract() {
        quotesPage.getCreditScoreMRComponent().clickOnContract();
    }

    @Step("The dealer select the resulting contract")
    public void selectResultingContracts() {
       quotesPage.getResultingContractMRComponent().selectContract();
    }

    @Step()
    public void selectStipulation() {
        openFinancial();
        quotesPage.getResultingContractMRComponent().openStipulation();
        quotesPage.getResultingContractMRComponent().selectAllStipulation();
    }

    @Step()
    public void openFinancial(){
        quotesPage.getResultingContractMRComponent().openFinancial();
    }

    @Step()
    public void activateStipulation() {
        quotesPage.getResultingContractMRComponent().activateStipulation();
        clickOnGeneral();
    }

    @Step()
    public void clickOnGeneral() {
        quotesPage.getResultingContractMRComponent().backToGeneral();
    }

    @Step()
    public void clickOnCopy() {
        quotesPage.clickOnCopy();
    }

    @Step()
    public void clickOnNewRequest() {
        quotesPage.selectNewRequest();
    }

    public void getQuoteId() {
        quotesPage.getQuoteID();
    }

    public void closeBrowser() {
        quotesPage.closeBrowser();
    }
}
