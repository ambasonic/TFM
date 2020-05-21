package Components.sale;

import Pages.ReusableViewElements;
import net.serenitybdd.core.pages.WebElementFacade;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import java.util.List;
import java.util.stream.Collectors;

import static org.hamcrest.Matchers.is;
import static org.junit.Assert.assertThat;
import static org.junit.Assert.fail;


public class FinancesServicesComponent extends ReusableViewElements {

    private final String Delivery_Menu = "quote:retailfinance:dcc";
    private final String Delivery_Method = "quote:retailfinance:dcc_";
    private final String Relief_Vehicle_Field = "quote:retailfinance:lsc:1:pcs";
    private final By Relief_Vehicle_Yes_Choice = By.id("quote:retailfinance:lsc:1:pcs_1");
    private final By Relief_Vehicle_No_Choice = By.id("quote:retailfinance:lsc:1:pcs_0");
    private final String Tires_Vehicle_Field = "quote:retailfinance:lsc:3:pcs";
    private final String Tires_Type = "quote:retailfinance:lsc:3:pcs_";
    private final String Tires_Number_Input_Field = "quote:retailfinance:lsc:3:qr:1:qinputs";
    private final String Calculate_Button = "quote:retailfinanceSummary:update";
    private final String Save_Quote = "quote:retailfinanceSummary:save";
    private final String TotalPrice_Value = "quote:retailfinanceSummary:pricewithfuelexclvat";
    private final By DOWN_PAYMENT = By.id("quote:retailfinanceSummary:upfront");
    private final By DURATION  = By.id("quote:retailfinance:months");
    private final By DISTANCE  = By.id("quote:retailfinance:kms");
    private final By INSURANCE_LABEL = By.id("quote:retailfinance:lsc:8:pcs_label");
    private final By FUEL_CARD_ENI_LABEL = By.id("quote:retailfinance:lsc:8:pcs");
    private final By FUEL_CARD_ENI_YES = By.id("quote:retailfinance:lsc:8:pcs_0");
    private final By FUEL_CARD_EDENRED_LABEL = By.id("quote:retailfinance:lsc:11:pcs");
    private final By FUEL_CARD_EDENRED_YES = By.id("quote:retailfinance:lsc:11:pcs_0");
    private final By INSURANCE_TYPE1 = By.id("quote:retailfinance:lsc:8:pcs_0");
    private final By INSURANCE_TYPE2 = By.id("quote:retailfinance:lsc:8:pcs_1");
    private final By VAT_LEASE_PRICE = By.id("quote:retailfinanceSummary:leasepricevat");
    private final By VAT_SERVICE_PRICE = By.id("quote:retailfinanceSummary:servicesleasepricevat");
    private final By VAT_TOTAL_PRICE = By.id("quote:retailfinanceSummary:pricewithfuel");
    private final By SELECTIONS_TABLE = By.id("quote:selopt:tbody_element");


    public FinancesServicesComponent(WebDriver driver) {
        super(driver);
    }

    public void setDuration(int duration){
        waitABit(1000);
        element(DURATION).clear();
        element(DURATION).sendKeys(String.valueOf(duration));
    }

    public void setDistance(int distance){
        waitABit(500);
        element(DISTANCE).clear();
        element(DISTANCE).sendKeys(String.valueOf(distance));
    }

    //TODO find a way to check the payment name
    public void selectPaymentMethod(int paymentIndex, String paymentName) {
        element(By.id(Delivery_Menu)).click();
        element(By.id(Delivery_Method +paymentIndex)).click();
    }

    /**
     *
     * @param choice 1 for true 0 for false
     */
    public void setReliefVehicle(boolean choice){
        element(By.id(Relief_Vehicle_Field)).click();
        if(choice){
            element(Relief_Vehicle_Yes_Choice).click();
        } else {
            element(Relief_Vehicle_No_Choice).click();
        }
        waitABit(2000);
    }

    //TODO find a way to check the Tires name
    public void selectTires(int tiresIndex, String tiresName){
        element(By.id(Tires_Vehicle_Field)).click();
        element(By.id(Tires_Type+tiresIndex)).click();
    }

    public void setTiresNumber(int tiresNumber){
        element(By.id(Tires_Number_Input_Field)).clear();
        element(By.id(Tires_Number_Input_Field)).sendKeys(String.valueOf(tiresNumber));
    }

    public void quoteCalculation(){
        element(By.id(Calculate_Button)).click();
        waitABit(4000);
    }

    public void saveQuote(){
        element(By.id(Save_Quote)).click();
        waitABit(3000);
    }

    public String getTotalPrice(){
        String totalPrice = element(By.id(TotalPrice_Value)).getText();
        return totalPrice;
    }

    public void setDownPayment(String payment) {
        waitABit(1000);
        element(DOWN_PAYMENT).sendKeys(payment);
    }

    public void setInsuranceType(String insuranceType){
        waitABit(1000);
        element(INSURANCE_LABEL).click();
        switch (insuranceType){
            case "Anti-Theft Lojack Abbonamento >34": element(INSURANCE_TYPE2).click();
                break;
            case "Anti-Theft Lojack Abbonamento <=34": element(INSURANCE_TYPE1).click();
                break;
            default: fail("Unknown insurance type: "+insuranceType);
        }
        waitABit(500);
    }

    public void checkLeasePrice(String leasePrice) {
        waitABit(500);
        String price = element(VAT_LEASE_PRICE).getText();
        assertThat(price, is(leasePrice));
    }

    public void checkServicePrice(String servicePrice) {
        waitABit(500);
//        replace("?","\u20ac")
        String price = element(VAT_SERVICE_PRICE).getText();
        assertThat(price, is(servicePrice));
    }

    public void checkTotalPrice(String totalPrice) {
        waitABit(500);
        String price = element(VAT_TOTAL_PRICE).getText();
        assertThat(price, is(totalPrice));
        waitABit(500);
    }

    public void checkAccessoriesPrice(String accPrice) {
        String price= element("#quote\\:selopt\\:tbody_element > tr:nth-child(5) > td:nth-child(3) > span").getText();
        assertThat(price, is(accPrice));
    }

    public void checkOptionPrice(String optionPrice) {
        String price = element("#quote\\:selopt\\:tbody_element > tr:nth-child(3) > td:nth-child(3) > span").getText();
        assertThat(price, is(optionPrice));
    }

    public void checkPackPrice(String packPrice) {
        String price = element("#quote\\:selopt\\:tbody_element > tr:nth-child(4) > td:nth-child(3)").getText();
        assertThat(price, is(packPrice));
    }

    public void acceptFuelCardEni(String choice) {
        waitABit(500);
        element(FUEL_CARD_ENI_LABEL).click();
        switch (choice.toLowerCase()){
            case "yes": element(FUEL_CARD_ENI_YES).click();
                break;
            case "no":
                break;
            default: fail("Unknown choice: "+choice+ " choice should be yes or no");
        }
    }

    public void acceptFuelCardEdenRed(String choice) {
        waitABit(500);
        element(FUEL_CARD_EDENRED_LABEL).click();
        switch (choice.toLowerCase()){
            case "yes": element(FUEL_CARD_EDENRED_YES).click();
                break;
            case "no":
                break;
            default: fail("Unknown choice: "+choice+ " choice should be yes or no");
        }
    }

    public void checkP(String optionPrice) { //TODO Remove
        String price = element("#quote\\:selopt\\:tbody_element > tr:nth-child(7) > td:nth-child(3) > span").getText();
        assertThat(price, is(optionPrice));
    }

    public void checkPrice(String optionName, String expectedVATPrice) {
        List<WebElementFacade> anchors = element(SELECTIONS_TABLE).thenFindAll(By.tagName("tr"))
                .stream()
                .filter(a -> a.find(By.className("optionNameColumn")).getText().equalsIgnoreCase(optionName))
                .collect(Collectors.toList());
        String price = anchors.get(0).thenFindAll(By.className("optionPriceColumn")).get(1).getText();
        assertThat(price, is(expectedVATPrice));

    }
}
