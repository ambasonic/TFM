package Pages.milesRiaPages;

import Components.quotesMR.CreditScoreMRComponent;
import Components.quotesMR.ResultingContractMRComponent;
import Pages.ReusableViewElements;
import Utils.CurrentProperties;
import net.serenitybdd.core.pages.WebElementFacade;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import java.util.List;
import java.util.stream.Collectors;

public class QuotesPage extends ReusableViewElements {
    public QuotesPage(WebDriver driver) {
        super(driver);
    }

    private final By submenu_down = By.xpath("//img[contains(@src,'"+currentProperties.getCurrentCountryIP()+"milesria/resource/skins/MRI/images/Menu/submenu_down.png')]");
    private final String NEXT_BUTTONS = "//img[contains(@src,'"+currentProperties.getCurrentCountryIP()+"milesria/resource/skins/MRI/images/Sofico/24/status_next.png?')]";

    public CreditScoreMRComponent getCreditScoreMRComponent (){
        return new CreditScoreMRComponent(getDriver());
    }
    public ResultingContractMRComponent getResultingContractMRComponent(){
        return new ResultingContractMRComponent(getDriver());
    }

    public void clickOnCopy() {
        waitABit(1500);

        if(currentProperties.getCurrentCountry().equalsIgnoreCase("italy")){
            findAll(submenu_down).get(0).click();
        } else {
            findAll(submenu_down).get(1).click();
        }
    }

    public void selectNewRequest(){
        waitABit(1500);
        if(currentProperties.getCurrentCountry().equalsIgnoreCase("italy")){
            findAll(By.xpath("//tbody/tr[4]/td[2]/div")).get(2).click();
        }else {
            findAll(By.xpath("//tbody/tr[5]/td[2]/div")).get(1).click();
        }
        clickOnValidate();
        clickOnApprove();
    }
    private void clickOnValidate(){
        waitABit(4000);
        List<WebElementFacade> getAllNextButton = findAll(NEXT_BUTTONS);
        getAllNextButton.get(0).click();
    }

    private void clickOnApprove() {
        waitABit(3000);
        List<WebElementFacade> getAllNextButton = findAll(NEXT_BUTTONS);
        getAllNextButton.get(0).click();
        waitABit(2000);
    }

    public void selectsCreditApplication() {
        List<WebElementFacade> silkClickableLink = findAll(By.className("silkClickableLink"));
        silkClickableLink.get(0).click();
    }
}
