package Components.quotesMR;

import Pages.ReusableViewElements;
import net.serenitybdd.core.pages.WebElementFacade;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.interactions.Actions;

import java.awt.*;
import java.awt.event.KeyEvent;
import java.util.List;

public class VehicleUsagesMRComponent extends ReusableViewElements {
    public VehicleUsagesMRComponent(WebDriver driver) {
        super(driver);
    }

    private final By VehicleUsages = By.xpath("//div[@id='id_menu_5_valueCell6']/div");
//    private final By VehicleUsages = By.xpath("//div[@id='id_menu_3_valueCell6']/div");
    private final By Registration_And_Documents = By.xpath("//div[@id='id_menu_5_valueCell7']/div");
//    private final By Registration_And_Documents = By.xpath("//div[@id='id_menu_3_valueCell7']/div");
    private final String ADD_LICENCE_PLATE = "//img[contains(@src,'https://10.7.25.20:10143/milesria/resource/skins/MRI/images/Sofico/16/add.png?" +
            "sv=0c361dca65211eee9a7833a6d278d85771a04349')]";
    private final By VinNumber = By.name("A917");
    public void clickOnVehicleUsages() {
        waitABit(3000);
        scrollToElement(element(VehicleUsages));
        element(VehicleUsages).click();
    }

    public void clickOnRegistrationAndDocuments() {
        waitABit(2000);
        element(Registration_And_Documents).click();
        waitABit(1000);
    }

    public void registeredLicencePlate(String licenceNumber){
        Actions actions = new Actions(getDriver());
        List<WebElementFacade> all = findAll(ADD_LICENCE_PLATE);
        all.get(6).click();
//        all.get(4).click();
        waitABit(2000);
        actions.sendKeys(Keys.TAB).build().perform();
        waitABit(1000);
        actions.sendKeys(Keys.TAB).build().perform();
        waitABit(1000);
        actions.sendKeys(licenceNumber).build().perform();
        waitABit(1000);
        actions.sendKeys(Keys.TAB).build().perform();
    }

    public void setRegistrationDate(String futureDate) {
        Actions actions = new Actions(getDriver());
        waitABit(1000);
        actions.sendKeys(futureDate).build().perform();
        waitABit(1000); //TODO Refactor
        actions.sendKeys(Keys.TAB).build().perform();
        waitABit(2000);
    }

    public void setVINNr(String vinNr) {
        waitABit(1000);
        sendKeysAfterStaleness(VinNumber, false, vinNr);
        waitABit(1000);
    }
}
