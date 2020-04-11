package Components;

import Pages.ReusableViewElements;
import net.serenitybdd.core.annotations.findby.By;
import org.openqa.selenium.WebDriver;

public class QuotationComponent extends ReusableViewElements {

    public QuotationComponent(WebDriver driver) {
        super(driver);
    }

    public void selectNewQuotation() {
        waitABit(3000);
        element(By.id("quote_actions_dealer:j_idt133")).click();
    }
}
