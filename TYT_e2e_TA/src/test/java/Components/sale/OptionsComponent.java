package Components.sale;

import Pages.ReusableViewElements;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.fail;

public class OptionsComponent extends ReusableViewElements {

    private final By COLOR_LABEL = By.id("quote:ddcolour_label");
    private final By UPHOLSTERY_LABEl = By.id("quote:ddupholstry_label");
    private final By UPHOLSTERY_Leather_Black =By.id("quote:ddupholstry_1");
    private final By COLOR_F_WHITE = By.id("quote:ddcolour_3");
    private final By COLOR_DARK_GREY = By.id("quote:ddcolour_2");// TODO iteration over the color number
    private final String upholsteryId = "//tr[@id='quote:ddupholstry_1']/td";
    private final By METALLIC_OR_PEARL_PAINT = By.id("option_6051828");
    private final By PREMIUM_PACK_FSPORT = By.id("option_6053111");
    private final By LOGJACK_PREMIUM = By.id("option_2000013");
    private final By SUPER_WHITE_GLOSS_PAINT = By.id("option_6053557");
    private final By TOUCH3_WITH_GO_PLUS = By.id("option_2000104");
    private final By TOUCH2_WITH_GO_PLUS = By.id("option_2000035");
    private final By LOJACK_CLASSIC = By.id("option_2000001");
    private final By SENSORI_DI_PARCHEGGIO_ANTERIORI = By.id("option_2000118");

    public OptionsComponent(WebDriver driver) {
        super(driver);
    }

    public void setCarColor(String colorName) {
        element(COLOR_LABEL).click();
        waitABit(500);
        switch (colorName.toLowerCase()){
            case "f white":element(COLOR_F_WHITE).click();
            break;
            case  "dark grey": element(COLOR_DARK_GREY).click();
            default: fail(" The color selector for: " + colorName + " is unknown");
        }
    }

    public void setUpholstery(String upholstery) {
        waitABit(1000);
//        element(By.cssSelector(".validateOptionActions")).click();
//        element(By.id(upholsteryDropDown)).click(); TODO due to italy i only validate the option from Popup
        element(UPHOLSTERY_LABEl).click();

        switch (upholstery.toLowerCase()){
            case "leather black":element(UPHOLSTERY_Leather_Black).click();
                break;
            default: fail(" The color selector for: " + upholstery + " is unknown");
        }
    }

    public void setOption(String option) {
        waitABit(2000);
        switch (option.toLowerCase()){
            case "metallic or pearl paint": element(METALLIC_OR_PEARL_PAINT).click();
                break;
            case "super white gloss paint": element(SUPER_WHITE_GLOSS_PAINT).click();
                break;
            default:
                fail(" The option selector for: " + option + " is unknown");
        }
        waitABit(1000);
    }

    public void selectOptionPack(String optionPack) {
        waitABit(2000);
        switch (optionPack.toLowerCase()){
            case "premium pack":element(PREMIUM_PACK_FSPORT).click();
                break;
            case "sensori di parcheggio anterio":element(SENSORI_DI_PARCHEGGIO_ANTERIORI).click();
                break;
            case "touch2 with go plus":element(TOUCH2_WITH_GO_PLUS).click();
                break;
            case "touch3 with go plus":element(TOUCH3_WITH_GO_PLUS).click();
                break;
            default:
                fail(" The option selector for: " + optionPack + " is unknown");
        }
    }

    public void setAccessories(String accessory) {
        waitABit(2000);
        switch (accessory){
            case "Lojack classic":element(LOJACK_CLASSIC).click();
                break;
            case "Lojack premium":element(LOGJACK_PREMIUM).click();
                break;
            default:
                fail(" The option selector for: " + accessory + " is unknown");
        }
    }

    public void selectsOptionFromPopUp(String option) {
        waitABit(2000);
//        element(By.cssSelector(".validateOptionActions")).click();
        element(By.id("quote:taccs:5:selected")).click();
    }
}
