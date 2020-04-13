package Pages.sale;

import Components.sale.FinancesServicesComponent;
import Components.sale.*;
import Pages.ReusableViewElements;
import net.serenitybdd.core.annotations.findby.By;
import org.openqa.selenium.WebDriver;

public class SalePage extends ReusableViewElements {

    private final String Burger_Menu = "menu-button";
    private final String SaleButton = "j_idt53_0";
    private final String Pending_Quotations = "j_idt53_0_0";

    public VehicleComponent getVehicleComponent() { return new VehicleComponent(getDriver()); }
    public OptionsComponent getOptionsComponent(){
        return new OptionsComponent(getDriver());
    }
    public CustomerComponent getCustomerComponent(){ return new CustomerComponent(getDriver()); }
    public ProductComponent getProductComponent(){ return new ProductComponent(getDriver()); }
    public QuotationSearchComponent getQuotationSearchComponent() { return new QuotationSearchComponent(getDriver()); }
    public FinancesServicesComponent getFinancesServicesComponent(){ return new FinancesServicesComponent(getDriver()); }


    public SalePage(WebDriver driver) {
        super(driver);
    }

    public void clickOnTheBurgerMenu() {
        element(By.id(Burger_Menu)).click();
    }

    public void clickOnSale() {
        element(By.id(SaleButton)).click();
    }

    public void clickOnPendingQuotations() {
        element(By.id(Pending_Quotations)).click();
    }
}
