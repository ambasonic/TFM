package Pages.sale;

import Components.sale.OptionsComponent;
import Components.sale.VehicleComponent;
import Pages.ReusableViewElements;
import net.thucydides.core.annotations.Step;
import org.openqa.selenium.WebDriver;

public class SalePage extends ReusableViewElements {

    public VehicleComponent getVehicleComponent() {
        return new VehicleComponent(getDriver());
    }
    public OptionsComponent getOptionsComponent(){
        return new OptionsComponent(getDriver());
    }

    public SalePage(WebDriver driver) {
        super(driver);
    }
}
