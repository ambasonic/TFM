package Components.customer;

import Pages.ReusableViewElements;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class IndividualComponent extends ReusableViewElements {


    private final By STREET_NAME = By.id("quote:prospectdetail:prospectView:main:prvtAddress:address");
    private final By STREET_NUMBER = By.id("quote:prospectdetail:prospectView:main:prvtAddress:houseNumber");
    private final By ZIP_CODE = By.id("quote:prospectdetail:prospectView:main:prvtAddress:postalCode");
    private final By PHONE_NUMBER = By.id ("quote:prospectdetail:prospectView:main:prvtAddress:phoneNrs:0:typedPhone_localNr");
    private final By CITY = By.id("quote:prospectdetail:prospectView:main:prvtAddress:city");
    private final By country = By.id ("prospectdetail:prospectView:main:bpPrimaryAddress:country_label");
    private final By saveBtn = By.id("prospectdetail:saveButton");
    private final By TITLE = By.id("quote:prospectdetail:prospectView:main:common_contact_prvt_label");
    private final By TITLE_Dr = By.id("quote:prospectdetail:prospectView:main:common_contact_prvt_1");
    private final By SURNAME = By.id("quote:prospectdetail:prospectView:main:contact_lname_prvt");
    private final By LAST_NAME = By.id("quote:prospectdetail:prospectView:main:contact_fname_prvt");
    private final By Email = By.id("quote:prospectdetail:prospectView:main:contactemail_prvt");

    public IndividualComponent(WebDriver driver) {
        super(driver);
    }



    public void setStreetName(String street_Name){
        element(STREET_NAME).sendKeys(street_Name);
        waitABit(2000);
    }

    public void setStreetNumber(String number){
        element(STREET_NUMBER).sendKeys(number);
        waitABit(2000);
    }

    public void setZipCode(String zip_code){
        element(ZIP_CODE).sendKeys(zip_code);
        waitABit(2000);
    }

    public void setCity (String theCity){
        element(CITY).sendKeys(theCity);
        waitABit(2000);
    }

    public void setPhoneNumber(String phone_Number){
        element(PHONE_NUMBER).sendKeys(phone_Number);
        waitABit(2000);
    }

    public void save() {
        element(saveBtn).click();
    }

    public void setTitle(String title) {

        element(TITLE).click();
        waitABit(500);
        switch (title){
            case "Dr" : element(TITLE_Dr).click();
                break;
            default:
        }
        waitABit(1000);
    }

    public void setSurname(String surname) {
        element(SURNAME).sendKeys(surname);
        waitABit(1000);
    }

    public void setName(String firstName) {
        element(LAST_NAME).sendKeys(firstName);
        waitABit(1000);
    }

    public void setEmail(String email) {
        element(Email).sendKeys(email);
        waitABit(1000);
    }
}
