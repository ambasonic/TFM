package Components.sale;

import Pages.ReusableViewElements;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class QuotationSearchComponent extends ReusableViewElements {

    private final String Quote_Selection_Check_Box = "qlist_dealermanager:quotelistTable:0:checking";
    private final String Quote_Selection_Actions_Button= "qlist_dealermanager:quotelistTable:0:j_idt177_button";
    private final String Quote_Copy_Button = "Copy";

    public QuotationSearchComponent(WebDriver driver) {
        super(driver);
    }

    public void selectQuote() {
        element(By.id(Quote_Selection_Check_Box)).click();
    }

    public void openQuoteActionsMenu() {
        element(By.id(Quote_Selection_Actions_Button)).click();
    }

    public void copyQuote() {
        element(By.linkText(Quote_Copy_Button)).click();
        waitABit(3000);
    }
}
