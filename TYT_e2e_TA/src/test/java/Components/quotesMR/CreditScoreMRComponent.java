package Components.quotesMR;

import Pages.ReusableViewElements;
import Utils.CurrentProperties;
import org.openqa.selenium.*;
import org.openqa.selenium.interactions.Actions;


public class CreditScoreMRComponent extends ReusableViewElements {

    private final By creditScore = By.id("id_menu_1_valueCell4");
    private final By statusTextField = By.name("A3211");
    private final By decisionTextField = By.name("A3214");
    private final By contract = By.xpath("//img[contains(@src,'"+ currentProperties.getCurrentCountryIP() +"milesria/resource/skins/MRI/images/Sofico/24/status_end.png?')]");

    public CreditScoreMRComponent(WebDriver driver) {
        super(driver);
    }

    public String selectCreditScore() {
        waitABit(2000);
        element(creditScore).click();
        waitABit(5000);
        return element(creditScore).getText();
    }

    public void setStatus(String status) {
        //TODO Refactor possible endless loop
        Boolean staleElement = true;
        while(staleElement){
            try{
                element(statusTextField).clear();
                waitABit(500);
                element(statusTextField).sendKeys(status);
                element(statusTextField).sendKeys(Keys.ENTER);
                staleElement = false;

            } catch(StaleElementReferenceException e){
                staleElement = true;
            }
        }
    }

    public void setDecision(String decision) {
        Boolean staleElement = true;
        while(staleElement){
            try{
                element(decisionTextField).clear();
                element(decisionTextField).sendKeys(decision);
                element(decisionTextField).sendKeys(Keys.ENTER);
                staleElement = false;

            } catch(StaleElementReferenceException e){
                staleElement = true;
            }
        }
    }

    public void clickOnContract() {
        waitABit(1000);
        element(By.name("R1305")).click();
        waitABit(2000);
        element(contract).click();
        waitABit(7000);
    }
}
