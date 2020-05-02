package Pages.milesRiaTabs;

import Pages.ReusableViewElements;
import net.serenitybdd.core.pages.WebElementFacade;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindAll;

import java.util.List;


public class TopBarTabs extends ReusableViewElements {

    private final String SAVE = "//img[contains(@src,'https://10.7.25.20:10143/milesria/resource/skins/MRI/images/Sofico/24/save.png" +
            "?sv=0c361dca65211eee9a7833a6d278d85771a04349')]";
    private final String NEXT_BUTTONS = "//img[contains(@src,'https://10.7.25.20:10143/milesria/resource/skins/MRI/images/Sofico/24/status_next.png?sv=0c361dca65211eee9a7833a6d278d85771a04349')]";
    private final String NEW_INVOICE = "//img[contains(@src,'https://10.7.25.20:10143/milesria/resource/skins/MRI/images/Sofico/16/invoice.png" +
            "?sv=0c361dca65211eee9a7833a6d278d85771a04349')]";

    private final List<WebElementFacade> getAllNextButton = findAll(NEXT_BUTTONS);

    public TopBarTabs(WebDriver driver) {
        super(driver);
    }

    public void clickOnSaved() {
        element(SAVE).click();
    }

    public void clickOnValidate(){
        waitABit(2000);
        getAllNextButton.get(0).click();
    }

    public void clickOnApprove() {
        getAllNextButton.get(1).click();
        waitABit(10000);
    }

    public void clickOnNewInvoice(){
        element(NEW_INVOICE).click();
    }
}
