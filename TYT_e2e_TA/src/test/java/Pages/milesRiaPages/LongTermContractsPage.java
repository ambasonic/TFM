package Pages.milesRiaPages;

import Components.header.TopBarComponent;
import Components.quotesMR.VehicleMRComponent;
import Components.quotesMR.VehicleUsagesMRComponent;
import Pages.ReusableViewElements;
import Pages.milesRiaTabs.TopBarTabs;
import org.openqa.selenium.WebDriver;

public class LongTermContractsPage extends ReusableViewElements {

    public VehicleMRComponent getVehicleMRComponent(){
        return new VehicleMRComponent(getDriver());
    }
    public VehicleUsagesMRComponent getVehicleUsagesMRComponent(){
        return new VehicleUsagesMRComponent(getDriver());
    }

    public TopBarTabs getTopBarTabs(){
        return new TopBarTabs(getDriver());
    }
    public LongTermContractsPage(WebDriver driver) {
        super(driver);
    }
}
