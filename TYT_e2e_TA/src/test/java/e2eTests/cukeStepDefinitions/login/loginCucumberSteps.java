package e2eTests.cukeStepDefinitions.login;


import e2eTests.navigationSteps.NavigateTo;
import e2eTests.stepdefinitions.LoginSteps;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;
import net.thucydides.core.annotations.Steps;

public class loginCucumberSteps {

    @Steps
    NavigateTo navigateTo;

    @Steps
    LoginSteps loginSteps;

    @Given("The dealer open the MilesWeb portal Dealer home page {string}")
    public void the_dealer_open_the_MilesWeb_portal_Dealer_home_page(String url) {
        //TODO use a different step to check the home title
        navigateTo.milesWebHomePage(url, "MilesWeb portale Dealer");
    }

    @When("he login with the username as {string} and the pwd {string}")
    public void he_login_with_the_username_as_and_the_pwd(String username, String pwd) {
        loginSteps.setUsername(username);
        loginSteps.setPassword(pwd);
        loginSteps.clickOnLoginButton();
    }
}
