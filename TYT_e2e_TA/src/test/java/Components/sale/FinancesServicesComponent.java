package Components.sale;

import Pages.ReusableViewElements;
import net.serenitybdd.core.pages.WebElementFacade;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.FindBy;

public class FinancesServicesComponent extends ReusableViewElements {

    private final String Delivery_Menu = "quote:retailfinance:dcc";
    private final String Delivery_Method = "quote:retailfinance:dcc_";
    private final String Relief_Vehicle_Field = "quote:retailfinance:lsc:1:pcs";
    private final String Relief_Vehicle_Yes_Choice = "quote:retailfinance:lsc:1:pcs_1";
    private final String Relief_Vehicle_No_Choice = "quote:retailfinance:lsc:1:pcs_0";
    private final String Tires_Vehicle_Field = "quote:retailfinance:lsc:3:pcs";
    private final String Tires_Type = "quote:retailfinance:lsc:3:pcs_";
    private final String Tires_Number_Input_Field = "quote:retailfinance:lsc:3:qr:1:qinputs";
    private final String Calculate_Button = "quote:retailfinanceSummary:update";
    private final String Save_Quote = "quote:retailfinanceSummary:save";


    @FindBy(id="quote:retailfinance:months")
    WebElementFacade durationFieldElement;

    @FindBy(id="quote:retailfinance:kms")
    WebElementFacade distanceFieldElement;

    public FinancesServicesComponent(WebDriver driver) {
        super(driver);
    }

    public void setDuration(int duration){
        durationFieldElement.clear();
        durationFieldElement.sendKeys(String.valueOf(duration));
    }

    public void setDistance(int distance){
        distanceFieldElement.clear();
        distanceFieldElement.sendKeys(String.valueOf(distance));
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
            element(By.id(Relief_Vehicle_Yes_Choice)).click();
        } else {
            element(By.id(Relief_Vehicle_No_Choice)).click();
        }
        waitABit(2000);
    }

    //TODO find a way to check the Tires name
    public void selectTires(int tiresIndex, String tiresName){
        element(By.id(Tires_Vehicle_Field)).click();
        element(By.id(Tires_Type+tiresIndex)).click();
    }

    public void setTiresNumber(int tiresNumber){
        element(By.id(Tires_Number_Input_Field)).sendKeys(String.valueOf(tiresNumber));
    }

    public void quoteCalculation(){
        element(By.id(Calculate_Button)).click();
        waitABit(4000);
    }

    public void saveQuote(){
        element(By.id(Save_Quote)).click();
    }
}
