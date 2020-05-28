package Components.sale;

import Pages.ReusableViewElements;
import net.serenitybdd.core.pages.WebElementFacade;
import net.thucydides.core.webdriver.exceptions.ElementShouldBeEnabledException;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import java.util.List;

public class CustomerComponent extends ReusableViewElements {

    private final String searchButtonIT = "quote:j_idt934";
    private final String searchButtonFR = "quote:j_idt947";
    private final String organizationMenuButton = "//div[@id='prospectdata:prospectlegalEntityGroup']/div/span";
    private final String organization = "//button[@id='prospectdata:prospectlistTable:0:j_idt114']/span[2]";
    private final By MODIFY_CUSTOMER_NEW = By.id("quote:j_idt932");
    private final By MODIFY_CUSTOMER_NEW_FR = By.id("quote:j_idt945");
    private final By PROSPECT_DATA_TABLE = By.id("prospectdata:prospectlistTable_data");
    private final By PROSPECT_NAME = By.id("quote:prospectname");
//    ex GDPR "//*[contains(text(),'Geo-Localization')]";
    private final String GDPR_start = "//*[contains(text(),'";
    private final String GDPR_end = "')]";

    public CustomerComponent(WebDriver driver) {
        super(driver);
    }

    public void searchCustomerByName(String customerName) {
        element(PROSPECT_NAME).sendKeys(customerName);
        if (currentProperties.getCurrentCountry().equalsIgnoreCase("france")){
            element(By.id(searchButtonFR)).click();
        } else if (currentProperties.getCurrentCountry().equalsIgnoreCase("italy")){
            element(By.id(searchButtonIT)).click();
        }
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

    public void acceptProspectAgreement(String ... agreements) {
        waitABit(1000);
        if(currentProperties.getCurrentCountry().equalsIgnoreCase("france")){
            element(By.xpath(" //*[@id='quote:save-confirmButton']")).click();
        }else if(currentProperties.getCurrentCountry().equalsIgnoreCase("italy")){
            waitABit(1000);
            for (String item: agreements) {
                findAll(GDPR_start +item+GDPR_end).get(0).click();
            }
        }
        waitABit(2000);
//
        try {
            element(By.xpath("//*[@id='quote:save-confirmButton']")).click();
        } catch (ElementShouldBeEnabledException e){
            element(By.id("prospectdetail:submit-confirmButton")).click();
        }
        waitABit(1000);
    }

    public void clickOnNewCustomer() {
        if(currentProperties.getCurrentCountry().equalsIgnoreCase("france")){
            waitABit(1000);
            element(MODIFY_CUSTOMER_NEW_FR).click();
            waitABit(2000);
        }else {
            waitABit(1000);
            element(MODIFY_CUSTOMER_NEW).click();
            waitABit(2000);
        }

    }
}

