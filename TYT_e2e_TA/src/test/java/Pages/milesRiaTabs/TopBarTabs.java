package Pages.milesRiaTabs;

import Pages.ReusableViewElements;
import net.serenitybdd.core.pages.WebElementFacade;
import org.openqa.selenium.*;
import org.openqa.selenium.support.FindAll;

import java.util.List;


public class TopBarTabs extends ReusableViewElements {

    private final String SAVE = "//img[contains(@src,'"+currentProperties.getCurrentCountryIP()+"milesria/resource/skins/MRI/images/Sofico/24/save.png')]";
    private final String NEXT_BUTTONS = "//img[contains(@src,'"+currentProperties.getCurrentCountryIP()+"milesria/resource/skins/MRI/images/Sofico/24/status_next.png?')]";
    private final String NEW_INVOICE = "//img[contains(@src,'"+currentProperties.getCurrentCountryIP()+"milesria/resource/skins/MRI/images/Sofico/16/invoice.png')]";
    private String OPEN_VEHICLE = "//img[contains(@src,'"+currentProperties.getCurrentCountryIP()+"milesria/resource/skins/MRI/images/Sofico/24/vehicle.png')]";

    public TopBarTabs(WebDriver driver) {
        super(driver);
    }

    public void clickOnOpenVehicle(){
        element(OPEN_VEHICLE).click();
        waitABit(1000);
    }

    public void clickOnSaved() {
        waitABit(2000);
        try {
            element(SAVE).click();
        }catch(ElementNotInteractableException enie){
            findAll(SAVE).get(1).click();
            waitABit(1000);
        }
    }

    public void clickOnValidate(){
        waitABit(4000);
        List<WebElementFacade> getAllNextButton = findAll(NEXT_BUTTONS);
        getAllNextButton.get(0).click();
    }

    public void clickOnApprove() {
        waitABit(2000);
        List<WebElementFacade> getAllNextButton = findAll(NEXT_BUTTONS);
        getAllNextButton.get(1).click();
        waitABit(10000);
    }

    public void clickOnNewInvoice(){
        waitABit(1000);
        element(NEW_INVOICE).click();
    }
}
