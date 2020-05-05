package Components.customer;

import Pages.ReusableViewElements;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

public class OrganizationComponent extends ReusableViewElements {
    private final By streetName = By.id("prospectdetail:prospectView:main:bpPrimaryAddress:address");
    private final By streetNumber = By.id("prospectdetail:prospectView:main:bpPrimaryAddress:houseNumber");
    private final By zipCode = By.id("prospectdetail:prospectView:main:bpPrimaryAddress:postalCode");
    private final By phoneNumber = By.id ("prospectdetail:prospectView:main:bpPrimaryAddress:phoneNrs:0:typedPhone_localNr");
    private final By city = By.id("prospectdetail:prospectView:main:bpPrimaryAddress:city");
    private final By country = By.id ("prospectdetail:prospectView:main:bpPrimaryAddress:country_label");
    private final By company = By.id("prospectdetail:prospectView:main:primaryAddress:name");
    private final String legaly_entity = "prospectdetail:prospectView:main:legalentity_";
    private final By saveBtn = By.id("prospectdetail:saveButton");

    public OrganizationComponent(WebDriver driver) {
        super(driver);
    }

    public void setLegaly_entity(String legal_entity) {
        Select dropdown = new Select(getDriver().
                findElement(By.className("ui-selectonemenu-trigger")));
        dropdown.selectByVisibleText(legal_entity);
        //element(By.id(legaly_entity+position)).click();
    }

    public void verifiedSelectedEntity (String name, int position){
        WebElement elt = element(By.id(legaly_entity+position));
        Assert.assertEquals("there are not equals", elt.getText(), name);
    }


    public void setCompany(String company_Name){
        element(company).sendKeys(company_Name);
       JavascriptExecutor jse = (JavascriptExecutor)getDriver();
        jse.executeScript("scroll(0, 300);");
    }

    public void setStreetName(String street_Name){
       //scrollToElement(element(streetName));
        element(streetName).sendKeys(street_Name);
        waitABit(2000);
    }

    public void setStreetNumber(String number){
        element(streetNumber).sendKeys(number);
        waitABit(2000);
    }

    public void setZipCode(String zip_code){
        element(zipCode).sendKeys(zip_code);
        waitABit(2000);
    }

    public void setCity (String theCity){
        element(city).sendKeys(theCity);
        waitABit(2000);
    }

    public void setPhoneNumber(String phone_Number){
        element(phoneNumber).sendKeys(phone_Number);
        waitABit(2000);
    }

    public void setCountry(String theCountry){
        element(country).sendKeys(theCountry);
        waitABit(2000);
    }

    public void save() {
        element(saveBtn).click();
    }
}
