package Components.quotesMR;

import Pages.ReusableViewElements;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.StaleElementReferenceException;
import org.openqa.selenium.WebDriver;

public class ResultingContractMRComponent extends ReusableViewElements {

    private final By resultingContract = By.xpath("//div[@id='id_menu_1_valueCell8']/div");
    private final By resultingContractFR = By.xpath("//div[@id='id_menu_3_valueCell8']/div");
//    private final By contractId = By.xpath("/html/body/div[3]/div/div[2]/div[4]/div[2]/div[1]/div[2]/div/div[4]/div/div/div/div/div/div[3]/div/div[2]/div/table/tbody/tr/td[1]/div/a");
    private final By contractId = By.cssSelector("a.silkClickableLink");
    public ResultingContractMRComponent(WebDriver driver) {
        super(driver);
    }

    public void selectContract() {
        waitABit(2000);
//        if(currentProperties.getCurrentCountry().equalsIgnoreCase("france")){
//            scrollToElement(element(resultingContractFR));
//            element(resultingContractFR).click();
//        }if(currentProperties.getCurrentCountry().equalsIgnoreCase("italy")){
//            scrollToElement(element(resultingContract));
//            element(resultingContract).click();
//        }
        scrollToElement(element(resultingContract));
        element(resultingContract).click();
        waitABit(5000);
        element(contractId).click();
        waitABit(5000);
    }
}
