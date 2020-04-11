package Pages.dealerHome;

import Components.QuotationComponent;
import Pages.ReusableViewElements;
import org.openqa.selenium.WebDriver;

public class DealerHomePage extends ReusableViewElements {

    public QuotationComponent getQuotationComponent(){
        return new QuotationComponent(getDriver());}

    public DealerHomePage(WebDriver driver) {
        super(driver);
    }
}
