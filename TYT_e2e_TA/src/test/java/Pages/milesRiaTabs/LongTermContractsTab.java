package Pages.milesRiaTabs;

import Components.quotesMR.VehicleMRComponent;
import Pages.ReusableViewElements;
import org.openqa.selenium.WebDriver;

public class LongTermContractsTab extends ReusableViewElements {

    public VehicleMRComponent getVehicleMRComponent(){
        return new VehicleMRComponent(getDriver());
    }
    public LongTermContractsTab(WebDriver driver) {
        super(driver);
    }
}
