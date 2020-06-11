package Pages.sale;

import Components.header.TopBarComponent;
import Components.sale.FinancesServicesComponent;
import Components.sale.*;
import Pages.ReusableViewElements;
import net.serenitybdd.core.pages.WebElementFacade;
import org.openqa.selenium.*;
import org.openqa.selenium.interactions.Actions;

import java.awt.*;
import java.awt.event.KeyEvent;

public class SalePage extends ReusableViewElements {

    private final By PRINT_DOCUMENT = By.id("stips:printbtn");

    public VehicleComponent getVehicleComponent() { return new VehicleComponent(getDriver()); }
    public OptionsComponent getOptionsComponent(){
        return new OptionsComponent(getDriver());
    }
    public CustomerComponent getCustomerComponent(){ return new CustomerComponent(getDriver()); }
    public ProductComponent getProductComponent(){ return new ProductComponent(getDriver()); }
    public QuotationSearchComponent getQuotationSearchComponent() { return new QuotationSearchComponent(getDriver()); }
    public FinancesServicesComponent getFinancesServicesComponent(){ return new FinancesServicesComponent(getDriver()); }
    public TopBarComponent getTopBarComponent(){return new TopBarComponent(getDriver()); }


    public SalePage(WebDriver driver) {
        super(driver);
    }


    public void printDocument() {
        element(PRINT_DOCUMENT).click();
        waitABit(1000);
    }

    public void clickOnOptionTab() {
        element(By.id("quote:j_idt642:j_idt649")).click();
        waitABit(4000);
    }

    public void clickOnFinanceTab() {
        element(By.id("quote:j_idt529:j_idt536")).click();
        waitABit(4000);
    }

    public void scrollDownForCreditRequest() {
        waitABit(3000);
        try {
            Robot robot = new Robot();
            robot.keyPress(KeyEvent.VK_CONTROL);
            robot.keyPress(KeyEvent.VK_MINUS);
            robot.keyRelease(KeyEvent.VK_CONTROL);
            robot.keyRelease(KeyEvent.VK_MINUS);
            robot.delay(1000);
            robot.keyPress(KeyEvent.VK_CONTROL);
            robot.keyPress(KeyEvent.VK_MINUS);
            robot.keyRelease(KeyEvent.VK_CONTROL);
            robot.keyRelease(KeyEvent.VK_MINUS);
            robot.delay(1000);
            robot.keyPress(KeyEvent.VK_CONTROL);
            robot.keyPress(KeyEvent.VK_ADD);
            robot.keyRelease(KeyEvent.VK_CONTROL);
            robot.keyRelease(KeyEvent.VK_ADD);
            robot.delay(1000);
            robot.keyPress(KeyEvent.VK_CONTROL);
            robot.keyPress(KeyEvent.VK_ADD);
            robot.keyRelease(KeyEvent.VK_CONTROL);
            robot.keyRelease(KeyEvent.VK_ADD);
            robot.delay(1000);
        } catch (AWTException e) {
            e.printStackTrace();
        }
        scrollToPosition(0, 500);
    }
}
