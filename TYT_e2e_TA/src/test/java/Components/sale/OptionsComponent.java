package Components.sale;

import Pages.ReusableViewElements;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;

public class OptionsComponent extends ReusableViewElements {

    private final String colorDropDown = "quote:ddcolour_label";
    private final String upholsteryDropDown = "quote:ddupholstry_label";
    private final String colorId = "//tr[@id='quote:ddcolour_2']/td";// TODO iteration over the color number
    private final String upholsteryId = "//tr[@id='quote:ddupholstry_1']/td";

    public OptionsComponent(WebDriver driver) {
        super(driver);
    }

    public void setCarColor() {
        element(By.id(colorDropDown)).click();
        element(By.xpath(colorId)).click();
    }

    public void setUpholstery() {
        waitABit(1000);
        element(By.cssSelector(".validateOptionActions")).click();
//        element(By.id(upholsteryDropDown)).click(); TODO due to italy i only validate the option from Popup
//        element(By.xpath(upholsteryId)).click();
    }

    public void setOption() {
        waitABit(2000);
//        element(By.cssSelector(".validateOptionActions")).click();
        element(By.id("quote:taccs:5:selected")).click();
    }

}
