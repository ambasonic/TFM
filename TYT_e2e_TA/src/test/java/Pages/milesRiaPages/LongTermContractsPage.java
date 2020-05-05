package Pages.milesRiaPages;

import Components.header.TopBarComponent;
import Components.quotesMR.VehicleMRComponent;
import Components.quotesMR.VehicleUsagesMRComponent;
import Pages.ReusableViewElements;
import Pages.milesRiaTabs.TopBarTabs;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class LongTermContractsPage extends ReusableViewElements {

    private final By Calculate = By.xpath("//img[contains(@src,'https://10.7.25.20:10143/milesria/resource/skins/MRI/images/Sofico/16/" +
            "calculate.png?sv=0c361dca65211eee9a7833a6d278d85771a04349')]");
    private final String ActionIcon = "//img[contains(@src,'https://10.7.25.20:10143/milesria/resource/skins/MRI/images/Sofico/16/" +
            "action.png?sv=0c361dca65211eee9a7833a6d278d85771a04349')]";

    public VehicleMRComponent getVehicleMRComponent(){
        return new VehicleMRComponent(getDriver());
    }
    public TopBarTabs getTopBarTabs(){
        return new TopBarTabs(getDriver());
    }
    public LongTermContractsPage(WebDriver driver) {
        super(driver);
    }
    public VehicleUsagesMRComponent getVehicleUsagesMRComponent(){
        return new VehicleUsagesMRComponent(getDriver());
    }
    public void clickOnCalculate() {
        waitABit(1000);
        element(Calculate).click();
        int size = findAll(ActionIcon).size();
        waitABit(7000);
        findAll(ActionIcon).get(2).click();

    }
}
