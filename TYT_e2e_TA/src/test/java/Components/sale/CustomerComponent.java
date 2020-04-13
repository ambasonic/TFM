package Components.sale;

import Pages.ReusableViewElements;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class CustomerComponent extends ReusableViewElements {

private final String searchButton = "quote:j_idt934";
private final String organizationMenuButton = "//div[@id='prospectdata:prospectlegalEntityGroup']/div/span";
private final String organization = "//button[@id='prospectdata:prospectlistTable:0:j_idt114']/span[2]";

    public CustomerComponent(WebDriver driver) {
        super(driver);
    }

    public void clickOnSearch() {
        element(By.id("quote:prospectname")).sendKeys("ANNA PAGANO");
        element(By.id(searchButton)).click();
        waitABit(4000);

    }

    public void switchToOrganizationSearch(){
        getDriver().switchTo().frame(0);
        element(By.xpath(organizationMenuButton)).click();
        waitABit(5000);
    }

    public void selectOrganization(){
        element(By.xpath(organization)).click();
    }

    public void acceptAndConfirmConditions() {
        waitABit(2000);
        element(By.xpath("//*[@id='quote:j_idt3748:0:j_idt3749']/div[2]")).click();
        element(By.xpath("//*[@id='quote:j_idt3748:1:j_idt3749']/div[2]")).click();
        waitABit(1000);
        element(By.xpath(" //*[@id='quote:save-confirmButton']")).click();

        waitABit(1000);
    }
}

