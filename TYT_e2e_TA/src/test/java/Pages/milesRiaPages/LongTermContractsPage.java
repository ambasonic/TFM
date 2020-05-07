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
    private final String OK = "//img[contains(@src,'https://10.7.25.20:10143/milesria/resource/skins/MRI/images/Sofico/16/ok.png?sv=0c361dca65211eee9a7833a6d278d85771a04349')]";
    private final By DiSTANCE = By.name("A1339");
    private final String DELIVER = "//img[contains(@src,'https://10.7.25.20:10143/milesria/resource/skins/MRI/images/Sofico/16/action.png?sv=0c361dca65211eee9a7833a6d278d85771a04349')]";

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
        waitABit(3000);
        element(Calculate).click();
    }

    public void selectTheDelivery(String delivery) { //TODO implement de delivery choice the default is Express
    }

    public void clickOnDelivery() {
        waitABit(7000);
        findAll(ActionIcon).get(2).click();
        waitABit(1000);
        element(OK).click();
        waitABit(1000);
    }

    public void setDistance(String distance) {
        waitABit(2000);
        sendKeysAfterStaleness(DiSTANCE, false, distance);
    }

    public void clickOnDeliver(){
        waitABit(5000);
        int size = findAll(DELIVER).size();
        findAll(DELIVER).get(7).click();
        waitABit(1000);
    }
}
