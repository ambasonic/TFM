package Pages;


import net.serenitybdd.core.pages.PageObject;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class ReusableViewElements extends PageObject {

    private final String nextButtonId = "quote:navigationButton_next";
    public ReusableViewElements(WebDriver driver) {
        super(driver);
    }

    public void OpenURL(String pageURL){
        getDriver().get(pageURL);
    }

    public void clickOnNext() {
        waitABit(1000);
        element(By.id(nextButtonId)).click();
        waitABit(3000);
    }
}
