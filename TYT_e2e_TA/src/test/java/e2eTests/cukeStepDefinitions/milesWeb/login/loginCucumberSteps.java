package e2eTests.cukeStepDefinitions.milesWeb.login;


import Pages.home.HomePage;
import e2eTests.stepdefinitions.LoginSteps;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import net.thucydides.core.annotations.Steps;
import utils.UserPropertiesManager;

import static Utils.constance.Country.*;

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

    @Given("The dealer open the MilesRia backoffice {string}")
    public void openMilesRiaBackofficeItaly(String country) {
        switch (country.toUpperCase()){

            case "ITALY": homePage.OpenURL(ITALY.getMilesRiaURL());
                break;
            case "FRANCE": homePage.OpenURL(FRANCE.getMilesRiaURL());
                break;
            default:
                throw new IllegalStateException("Unexpected value: " + country.toUpperCase());
        }

    }

    @And("he login in MilesRia")
    public void heLoginInMilesRia() {
        loginSteps.setUsernameMilesRia(UserPropertiesManager.getUserProperty().getProperty("user.username"));
        loginSteps.setPasswordMilesRia(UserPropertiesManager.getUserProperty().getProperty("user.password"));
        loginSteps.clickOnLogonButtonMilesRia();
    }
}
