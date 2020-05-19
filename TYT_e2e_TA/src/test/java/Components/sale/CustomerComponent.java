package Components.sale;

import Pages.ReusableViewElements;
import net.serenitybdd.core.pages.WebElementFacade;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import java.util.List;

public class CustomerComponent extends ReusableViewElements {

private final String searchButton = "quote:j_idt934";
private final String organizationMenuButton = "//div[@id='prospectdata:prospectlegalEntityGroup']/div/span";
private final String organization = "//button[@id='prospectdata:prospectlistTable:0:j_idt114']/span[2]";
private final By MODIFY_CUSTOMER_NEW = By.id("quote:j_idt932");
private final By PROSPECT_DATA_TABLE = By.id("prospectdata:prospectlistTable_data");

    public CustomerComponent(WebDriver driver) {
        super(driver);
    }

    public void searchCustomerByName(String customerName) {
        element(By.id("quote:prospectname")).sendKeys(customerName);
        element(By.id(searchButton)).click();
        waitABit(4000);

    }

    public void switchToOrganizationSearch(){
        getDriver().switchTo().frame(0);
        element(By.xpath(organizationMenuButton)).click();
        waitABit(5000);
    }

    public void selectOrganization(){
        waitABit(1000);
        List<WebElementFacade> anchor = element(PROSPECT_DATA_TABLE).thenFindAll(By.tagName("tr"));
        anchor.get(0).findElement(By.tagName("button")).click();
        waitABit(500);
    }

    public void acceptProspectAgreement() {
        waitABit(2000);
        element(By.xpath("//*[@id='quote:j_idt3748:0:j_idt3749']/div[2]")).click();
        element(By.xpath("//*[@id='quote:j_idt3748:1:j_idt3749']/div[2]")).click();
        waitABit(1000);
        element(By.xpath(" //*[@id='quote:save-confirmButton']")).click();

        waitABit(1000);
    }

    public void clickOnNewCustomer() {
        waitABit(1000);
        element(MODIFY_CUSTOMER_NEW).click();
        waitABit(2000);
    }
}

