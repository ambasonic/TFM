package Components.quotesMR;

import Pages.ReusableViewElements;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.StaleElementReferenceException;
import org.openqa.selenium.WebDriver;

public class VehicleOrderInfComponent extends ReusableViewElements {
    public VehicleOrderInfComponent(WebDriver driver) {
        super(driver);
    }

    private final By RequestedDeliveryDate = By.name("A2727");
    private final By EstimatedDeliveryDate = By.name("A1066");
    private final By ActualDeliveryDate = By.name("A1338");
    private final By Supplier = By.name("R692");
    private final By VehicleOrder = By.name("A1370");

    public void setRequestDeliveryDate() {
        setSupplier();
        sendKeysAfterStaleness(RequestedDeliveryDate, false,"27/04/2020" );
        setEstimatedDeliveryDate();
        setActualDeliveryDate();

    }

    public void setEstimatedDeliveryDate() {
        sendKeysAfterStaleness(EstimatedDeliveryDate, false,"27/04/2020" );
    }

    public void setActualDeliveryDate() {
        sendKeysAfterStaleness(ActualDeliveryDate, false,"27/04/2020" );
        waitABit(10000);
    }

    public void setSupplier() {
        sendKeysAfterStaleness(VehicleOrder, false,Keys.TAB );
        element(Supplier).click();
        element(Supplier).sendKeys("A.Corvi");
        element(Supplier).sendKeys(Keys.ENTER);
    }


}
