package Pages.milesRiaPages;

import Components.quotesMR.CreditScoreMRComponent;
import Components.quotesMR.ResultingContractMRComponent;
import Pages.ReusableViewElements;
import org.openqa.selenium.WebDriver;

public class QuotesPage extends ReusableViewElements {
    public QuotesPage(WebDriver driver) {
        super(driver);
    }

    public CreditScoreMRComponent getCreditScoreMRComponent (){
        return new CreditScoreMRComponent(getDriver());
    }
    public ResultingContractMRComponent getResultingContractMRComponent(){
        return new ResultingContractMRComponent(getDriver());
    }
}
