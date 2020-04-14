package Components.header;

import Pages.ReusableViewElements;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class TopBarComponent extends ReusableViewElements {

    private final String Top_Bar_Menu = "topbar-menu-button";
    private final String Burger_Menu = "menu-button";
    private final String SaleButton = "j_idt53_0";
    private final String Pending_Quotations = "j_idt53_0_0";
    private final String Profile_Button = "Profile";
    private final String Logout_Button = "//span[contains(.,'Log out')]";

    public TopBarComponent(WebDriver driver) {
        super(driver);
    }

    public void clickOnTheBurgerMenu() {
        element(net.serenitybdd.core.annotations.findby.By.id(Burger_Menu)).click();
    }

    public void clickOnSale() {
        element(net.serenitybdd.core.annotations.findby.By.id(SaleButton)).click();
    }

    public void clickOnPendingQuotations() {
        element(net.serenitybdd.core.annotations.findby.By.id(Pending_Quotations)).click();
    }

    public void openTopBar(){
        element(By.id(Top_Bar_Menu)).click();
    }

    public void clickOnProfile(){
        element(By.linkText(Profile_Button)).click();
    }

    public void clickOnLogOut(){
        element(By.xpath(Logout_Button)).click();
    }
}
