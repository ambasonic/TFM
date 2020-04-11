package e2eTests.navigationSteps;

import Pages.home.HomePage;
import net.thucydides.core.annotations.Step;

import static org.assertj.core.api.Assertions.assertThat;

public class NavigateTo {

    HomePage homePage;

    @Step("Open the MilesWeb Dealer home page")
    public void milesWebHomePage(String url, String homePageTitle){
        homePage.OpenURL(url);
//        assertThat(homePage.getHomePageTitle().equalsIgnoreCase(homePageTitle)); TODO connection slow
//        TODO set fluentwait
    }
}
