package Components.quotesMR;

import Pages.ReusableViewElements;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class VehicleMRComponent extends ReusableViewElements {
    public VehicleMRComponent(WebDriver driver) {
        super(driver);
    }

    private final By vehicleID =  By.xpath("//div[3]/div/div/div/div[2]/div/div[4]/div/div[2]/div/div/div/div/div/table/tbody/tr/td");

    public void clickOnVehicle() {
        waitABit(4000);
        element(vehicleID).click();
        waitABit(5000);
    }
}
