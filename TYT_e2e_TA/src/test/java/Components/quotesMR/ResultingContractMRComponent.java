package Components.quotesMR;

import Pages.ReusableViewElements;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.StaleElementReferenceException;
import org.openqa.selenium.WebDriver;

public class ResultingContractMRComponent extends ReusableViewElements {

    private final By resultingContract = By.xpath("//div[@id='id_menu_1_valueCell8']/div");
    private final By contractId = By.cssSelector("a.silkClickableLink");
    private final By financial = By.xpath("//div[@id='id_menu_2_valueCell5']/div");
    private final By stipulation = By.xpath("//div[@id='id_menu_2_valueCell13']/div");
    private final By CA_Stipulation = By.xpath("//div[@id='id_menu_2_valueCell3']/div");
    private final By activate = By.xpath("//img[contains(@src,'http://10.7.25.10:9480/milesria/resource/skins/MRI/images/Sofico/16/status_next.png')]");
    private final By general = By.xpath("//div[@id='id_menu_2_valueCell0']/div");


    public ResultingContractMRComponent(WebDriver driver) {
        super(driver);
    }

    public void selectContract() {
        waitABit(3500);
        scrollToElement(element(resultingContract));
        element(resultingContract).click();
        waitABit(5000);
        element(contractId).click();
        waitABit(5000);
    }

    public void openFinancial(){
        waitABit(1500);
        if(currentProperties.getCurrentCountry().equalsIgnoreCase("france")){
            By financialFr = By.xpath("//div[@id='id_menu_3_valueCell5']/div");
            scrollToElement(element(financialFr));
            element(financialFr).click();
            waitABit(750);
            return;
        }
        scrollToElement(element(financial));
        element(financial).click();
        waitABit(750);
    }
    public void openStipulation(){
        By stipulationsFR = By.xpath("//div[@id='id_menu_3_valueCell14']/div");
        if(currentProperties.getCurrentCountry().equalsIgnoreCase("france")){
            scrollToElement(element(stipulationsFR));
            element(stipulationsFR).click();
            waitABit(3000);
            return;
        }
        scrollToElement(element(stipulation));
        element(stipulation).click();
        waitABit(3000);
    }

    public void openCAStipulation(){
        element(CA_Stipulation).click();
        waitABit(3000);
    }

    public void selectAllStipulation(){
        element(By.className("checkboxPartial")).click();
        waitABit(5000);
    }

    public void backToGeneral() {
        waitABit(1500);
        scrollToElement(element(general));
        element(general).click();
        waitABit(1000);
    }

    public void clickOnLTCGeneral(){
        By general = By.xpath("//div[@id='id_menu_3_valueCell0']/div");
        waitABit(1500);
        scrollToElement(element(general));
        element(general).click();
        waitABit(1000);
    }

    public void activateStipulation() {
       findAll(activate).get(0).click();
        waitABit(3000);
    }
}
