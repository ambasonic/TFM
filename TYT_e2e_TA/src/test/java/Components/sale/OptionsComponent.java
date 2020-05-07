package Components.sale;

import Pages.ReusableViewElements;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;

import static org.junit.Assert.assertFalse;

public class OptionsComponent extends ReusableViewElements {

    private final String colorDropDown = "quote:ddcolour_label";
    private final String upholsteryDropDown = "quote:ddupholstry_label";
    private final String colorId = "//tr[@id='quote:ddcolour_2']/td";// TODO iteration over the color number
    private final String upholsteryId = "//tr[@id='quote:ddupholstry_1']/td";
    private final By METALLIC_OR_PEARL_PAINT = By.id("option_6051828");
    private final By PREMIUM_PACK_FSPORT = By.id("option_6053111");
    private final By LOGJACK_PREMIUM = By.id("option_2000013");

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

    public void setOption(String option) {
        waitABit(2000);
        switch (option){
            case "Metallic or pearl paint": element(METALLIC_OR_PEARL_PAINT).click();
                break;
            case "TODO":
                break;
            default:assertFalse(" The option selector for: "+option+" is unknown", true);
        }

        waitABit(2000);
        element(PREMIUM_PACK_FSPORT).click();

        waitABit(2000);

        element(LOGJACK_PREMIUM).click();

        waitABit(1000);
    }

    public void selectOptionPack(String optionPack) {
    }

    public void setAccessories(String accessory) {
    }

    public void selectsOptionFromPopUp(String option) {
        waitABit(2000);
//        element(By.cssSelector(".validateOptionActions")).click();
        element(By.id("quote:taccs:5:selected")).click();
    }
}
