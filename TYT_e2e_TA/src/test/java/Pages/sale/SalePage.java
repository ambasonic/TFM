package Pages.sale;

import Components.header.TopBarComponent;
import Components.sale.FinancesServicesComponent;
import Components.sale.*;
import Pages.ReusableViewElements;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

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
}
