package Components.customer;

import Pages.ReusableViewElements;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class OrganizationComponent extends ReusableViewElements {
    private final By streetName = By.id("prospectdetail:prospectView:main:primaryAddress:address");
    private final By streetNumber = By.id("prospectdetail:prospectView:main:primaryAddress:houseNumber");
    private final By zipCode = By.id("prospectdetail:prospectView:main:primaryAddress:postalCode");
    private final By phoneNumber = By.id ("prospectdetail:prospectView:main:primaryAddress:houseNumber");
    private final By city = By.id("prospectdetail:prospectView:main:primaryAddress:city");
    private final By country = By.id ("prospectdetail:prospectView:main:primaryAddress:country_label");
    private final By company = By.id("prospectdetail:prospectView:main:primaryAddress:name");

    public OrganizationComponent(WebDriver driver) {
        super(driver);
    }

    public void setCompany(String company_Name){
        element(company).sendKeys(company_Name);
    }

    public void setStreetName(String street_Name){
        element(streetName).sendKeys(street_Name);
    }

    public void setStreetNumber(String number){
        element(streetNumber).sendKeys(number);
    }

    public void setZipCode(String code){
        element(zipCode).sendKeys(code);
    }

    public void setCity (String theCity){
        element(city).sendKeys(theCity);
    }

    public void setPhoneNumber(String phone_Number){
        element(phoneNumber).sendKeys(phone_Number);
    }

    public void setCountry(String theCountry){
        element(country).sendKeys(theCountry);
    }

}
