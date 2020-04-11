package Pages;


import net.serenitybdd.core.pages.PageObject;
import org.openqa.selenium.WebDriver;

public class ReusableViewElements extends PageObject {

    public ReusableViewElements(WebDriver driver) {
        super(driver);
    }

    public void OpenURL(String pageURL){
        getDriver().get(pageURL);
    }
}
