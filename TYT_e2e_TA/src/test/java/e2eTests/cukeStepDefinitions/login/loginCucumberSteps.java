package e2eTests.cukeStepDefinitions.login;


import Pages.home.HomePage;
import e2eTests.navigationSteps.NavigateTo;
import e2eTests.stepdefinitions.LoginSteps;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import net.thucydides.core.annotations.Steps;
import utils.UserPropertiesManager;

public class loginCucumberSteps {

    @Steps
    LoginSteps loginSteps;

    HomePage homePage;


    @Given("The dealer open the MilesWeb portal Dealer home page")
    public void theDealerOpenTheMilesWebPortalDealerHomePage() {
        homePage.open(); //TODO this method used the default url please refactor it
    }

    @And("he login")
    public void doLogin() {
        loginSteps.setUsername(UserPropertiesManager.getUserProperty().getProperty("user.username"));
        loginSteps.setPassword(UserPropertiesManager.getUserProperty().getProperty("user.password"));
        loginSteps.clickOnLoginButton();
    }
}
