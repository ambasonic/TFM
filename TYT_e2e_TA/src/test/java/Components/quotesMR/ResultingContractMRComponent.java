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
    private final By stipulation = By.xpath("//div[@id='id_menu_2_valueCell14']/div");
    private final By activate = By.xpath("//img[contains(@src,'http://10.7.25.10:9480/milesria/resource/skins/MRI/images/Sofico/16/status_next.png')]");
    private final By general = By.xpath("//div[@id='id_menu_2_valueCell0']/div");
    //    general id="id_menu_5_valueCell0"

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
        scrollToElement(element(financial));
        element(financial).click();
        waitABit(750);
    }
    public void openStipulation(){
        scrollToElement(element(stipulation));
        element(stipulation).click();
        waitABit(3000);
    }

    public void selectAllStipulation(){
        element(By.className("checkboxPartial")).click();
        waitABit(5000);
    }

    public void backToGeneral() {
        scrollToElement(element(general));
        element(general).click();
        waitABit(1000);
    }

    public void activateStipulation() {
       findAll(activate).get(0).click();
        waitABit(3000);
    }
}
