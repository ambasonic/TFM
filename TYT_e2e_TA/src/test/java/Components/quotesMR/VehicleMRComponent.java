package Components.quotesMR;

import Pages.ReusableViewElements;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class VehicleMRComponent extends ReusableViewElements {
    public VehicleMRComponent(WebDriver driver) {
        super(driver);
    }

    private final String vehicleImg = "//img[contains(@src,'https://10.7.25.20:10143/milesria/resource/skins/MRI/images/Sofico/16/order.png?sv=0c361dca65211eee9a7833a6d278d85771a04349')]";

    public void clickOnVehicle() {
        waitABit(5000);
        findAll(vehicleImg).get(2).click();
        waitABit(5000);
    }
}
