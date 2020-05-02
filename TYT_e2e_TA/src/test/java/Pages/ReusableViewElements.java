package Pages;


import net.serenitybdd.core.pages.PageObject;
import org.openqa.selenium.*;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.time.Duration;
import java.util.Calendar;
import java.util.NoSuchElementException;

public class ReusableViewElements extends PageObject {

    private final String nextButtonId = "quote:navigationButton_next";
    public ReusableViewElements(WebDriver driver) {
        super(driver);
    }

    protected WebDriverWait webDriverWait= new WebDriverWait(getDriver(), 20);

    public void OpenURL(String pageURL){
        getDriver().get(pageURL);
    }

    public void clickOnNext() {
        waitABit(2000);
        element(By.id(nextButtonId)).click();
        waitABit(3000);
    }

    public ExpectedCondition<Boolean> clickUntilElementIsStale(WebElement toClick){
        return driver -> {
            try {
                if(webDriverWait.withTimeout(Duration.ofSeconds(4))
                        .until(ExpectedConditions.stalenessOf(toClick))){
                    return true;
                }
            } catch (NoSuchElementException | StaleElementReferenceException | TimeoutException e){
            }
            try {
                toClick.click();
            } catch (StaleElementReferenceException e){

            }return false;
        };
    }

    public ExpectedCondition<Boolean> sendKeysUntilElementIsStale(WebElement toClick, String keys) {
        return driver -> {
            try {
                if (webDriverWait.withTimeout(Duration.ofSeconds(4))
                        .until(ExpectedConditions.stalenessOf(toClick))) {
                    return true;
                }
            } catch (NoSuchElementException | StaleElementReferenceException | TimeoutException e) {
            }
            try {
                toClick.clear();
                toClick.sendKeys(keys);
            } catch (StaleElementReferenceException e) {

            }
            return false;
        };
    }
    public void sendKeysAfterStaleness(By elementBy, boolean cleartext, CharSequence... charSequences) {
        Boolean staleElement = true;
        while(staleElement){
            try{
                if(cleartext) element(elementBy).clear();
                element(elementBy).sendKeys(charSequences);
                staleElement = false;

            } catch(StaleElementReferenceException e){
                staleElement = true;
            }
        }
    }

    public void typeAfterStaleness(By elementBy, CharSequence... charSequences) {
        Boolean staleElement = true;
        while(staleElement){
            try{
                element(elementBy).type(charSequences);
                staleElement = false;

            } catch(StaleElementReferenceException e){
                staleElement = true;
            }
        }
    }

    public void waitUntilStaleness(By by) {
        Boolean staleElement = true;
        while(staleElement){
            try{
                element(by);
                staleElement = false;

            } catch(StaleElementReferenceException e){
                staleElement = true;
            }
        }
    }

    public void scrollToElement(WebElement elementToReach) {
        JavascriptExecutor js = (JavascriptExecutor) getDriver();
        Boolean staleElement = true;
        while(staleElement){
            try{
                js.executeScript("arguments[0].scrollIntoView();",  elementToReach);
                staleElement = false;

            } catch(StaleElementReferenceException e){
                staleElement = true;
            }
        }
    }

    public String getActualDate() {
        Calendar calendar = Calendar.getInstance();
        DateFormat formatter = new SimpleDateFormat( "dd/MM/yyyy" );
        return formatter.format(calendar.getTime());
    }

    /**
     * This method select a date in the future
     *
     * @param numBerOfDaysInTheFuture
     * @return Actual date plus a number of day to reach the future date
     */
    public String getFutureDate(int numBerOfDaysInTheFuture) {
        Calendar calendar = Calendar.getInstance();
        calendar.add(Calendar.DAY_OF_YEAR, numBerOfDaysInTheFuture);
        DateFormat formatter = new SimpleDateFormat( "dd/MM/yyyy" );
        return formatter.format(calendar.getTime());
    }

}
