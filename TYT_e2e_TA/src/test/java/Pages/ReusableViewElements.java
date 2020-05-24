package Pages;


import Utils.CurrentProperties;
import net.serenitybdd.core.pages.PageObject;
import org.junit.Assert;
import org.openqa.selenium.*;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.time.Duration;
import java.util.Calendar;
import java.util.NoSuchElementException;
import java.util.concurrent.TimeUnit;

import static Utils.constance.Country.FRANCE;
import static Utils.constance.Country.ITALY;

public class ReusableViewElements extends PageObject {

    private final String nextButtonId = "quote:navigationButton_next";
    public ReusableViewElements(WebDriver driver) {
        super(driver);
    }
    public static CurrentProperties currentProperties;
    protected WebDriverWait webDriverWait= new WebDriverWait(getDriver(), 10);

    public void openURL(String pageURL){
        getDriver().get(pageURL);
        waitABit(1000);
    }

    public void openMRTab(int tabIndex){
        String country =  currentProperties.getCurrentCountry();
        switch (country.toUpperCase()){
            case "ITALY": openURL(ITALY.getMilesRiaURL()+"#tab_"+tabIndex);
                break;
            case "FRANCE" : openURL(FRANCE.getMilesRiaURL()+"#tab_"+tabIndex);
                break;
            default:
                throw new IllegalStateException("Unexpected value: " + country.toUpperCase());
        }
    }

    public void openMilesWebMainPageURL(String country){
        // important to set the active country property at the beginning
        currentProperties = new CurrentProperties(country);
        switch (country.toUpperCase()){
            case "ITALY": openURL(ITALY.getMilesWebURL());
                break;
            case "FRANCE": openURL(FRANCE.getMilesWebURL());
                // important to set the active country property at the beginning
                break;
            default:
                throw new IllegalStateException("Unexpected value: " + country.toUpperCase());
        }
        waitABit(1000);
    }

    public void openMilesRiaMainPageURL(String country){
        // important to set the active country property at the beginning
        currentProperties = new CurrentProperties(country);
        switch (country.toUpperCase()){
            case "ITALY": openURL(ITALY.getMilesRiaURL());
                break;
            case "FRANCE": openURL(FRANCE.getMilesRiaURL());
                break;
            default:
                throw new IllegalStateException("Unexpected value: " + country.toUpperCase());
        }
        waitABit(1000);
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

    /**
     *
     * @param elementToReach
     */
    public void scrollToElement(WebElement elementToReach) {
        JavascriptExecutor js = (JavascriptExecutor) getDriver();
        long startTime = System.currentTimeMillis();
        Boolean staleElement = true;
        while(staleElement && (System.currentTimeMillis()-startTime)< 5000){
            try{
                js.executeScript("arguments[0].scrollIntoView();",  elementToReach);
                staleElement = false;

            } catch(StaleElementReferenceException e){
                staleElement = true;
            }
        }
    }

    /**
     *
     * @param from position x
     * @param to to position y
     */
    public void scrollToPosition(int from, int to) {
        JavascriptExecutor js = (JavascriptExecutor) getDriver();
        js.executeScript("scroll("+from+", "+to+");");
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

    public void waitAndClickElementUsingJS(WebElement element) {
        JavascriptExecutor js = (JavascriptExecutor) getDriver();
        try {
            webDriverWait.until(ExpectedConditions.elementToBeClickable(element));
            js.executeScript("arguments[0].click();", element);
        } catch (StaleElementReferenceException elementUpdated) {
            WebElement staleElement = element;
            Boolean elementPresent = webDriverWait.until(ExpectedConditions.elementToBeClickable(staleElement)).isEnabled();
            if (elementPresent == true) {
                js.executeScript("arguments[0].click();", elementPresent);
            }
        } catch (NoSuchElementException e) {
            Assert.fail("Unable to JS click on the WebElement, Exception: " + e.getMessage());
        }
    }
    // getter and setter
}
