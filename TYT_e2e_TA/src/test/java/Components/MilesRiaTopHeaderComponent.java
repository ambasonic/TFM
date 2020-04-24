package Components;

import Pages.ReusableViewElements;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;


public class MilesRiaTopHeaderComponent extends ReusableViewElements {
    public MilesRiaTopHeaderComponent(WebDriver driver) {
        super(driver);
    }

    private final By quickNavigation = By.id("sofid_id_quicknavigation_field");

    public void setQuickAccessMenu(String menuName) {
        waitABit(3000);
        element(quickNavigation).sendKeys(menuName, Keys.ENTER);
        element(By.cssSelector("tr:nth-child(1) > .cell:nth-child(3) > div")).click();
    }

    public void searchQuote(String quoteId) {
        element(quickNavigation).sendKeys(quoteId, Keys.ENTER);
        waitABit(3000);
    }
}
