package Components.sale;

import Pages.ReusableViewElements;
import net.serenitybdd.core.pages.WebElementFacade;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import java.util.List;
import java.util.stream.Collectors;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.fail;

public class OptionsComponent extends ReusableViewElements {

    //TODO refactor all
    private final By COLOR_LABEL = By.id("quote:ddcolour_label");
    private final By UPHOLSTERY_LABEl = By.id("quote:ddupholstry_label");
    private final By UPHOLSTERY_PANEL = By.id("quote:ddupholstry_panel");
    private final By UPHOLSTERY_Leather_Black = By.id("quote:ddupholstry_1");
    private final By UPHOLSTERY_Leather_interior_and_Alcantara = By.id("quote:ddupholstry_1");
    private final By UPHOLSTERY_BLACK_CLOTH = By.id("quote:ddupholstry_1");
    private final By SUPER_WHITE_GLOSS = By.id("quote:ddupholstry_1");
    private final By COLOR_F_WHITE = By.id("quote:ddcolour_3");
    private final By COLOR_DARK_GREY = By.id("quote:ddcolour_2");// TODO iteration over the color number
    private final By COLOR_DARK_GREY_MET_WITH_BLACK_ROOF = By.id("quote:ddcolour_1");
    private final By COLOR_SUPER_WHITE_GLOSS = By.id("quote:ddcolour_11");
    private final By COLOR_RED_MIKA_BLACK = By.id("quote:ddcolour_2");
    private final By METALLIC_OR_PEARL_PAINT = By.id("option_6051828");
    private final By PREMIUM_PACK_FSPORT = By.id("option_6053111");
    private final By LOGJACK_PREMIUM = By.id("option_2000013");
    private final By SUPER_WHITE_GLOSS_PAINT = By.id("option_6053557");
    private final By TOUCH3_WITH_GO_PLUS = By.id("option_2000104");
    private final By TOUCH2_WITH_GO_PLUS = By.id("option_2000035");
    private final By LOJACK_CLASSIC = By.id("option_2000001");
    private final By SENSORI_DI_PARCHEGGIO_ANTERIORI = By.id("option_2000118");
    private final By Touch2_with_Go_Limited_Edition_Campaign = By.id("option_2000004");
    private final By LoJack_Premium = By.id("option_2000002");
    private final By PORTABICI_SX = By.id("option_2000026");
    private final By DD_COLOR_PANEL = By.id("quote:ddcolour_panel");
    private final By ACCESSORIES_BODY_ELEMENT = By.id("quote:tacc:tbody_element");
    private final By OPTION_PACK_BODY_ELEMENT = By.id("quote:tpack:tbody_element");

    public OptionsComponent(WebDriver driver) {
        super(driver);
    }

    public void setCarColorByText(String colorName){
        waitABit(1000);
        element(COLOR_LABEL).click();
        waitABit(500);
        List<WebElementFacade> anchors = element(DD_COLOR_PANEL).thenFindAll(By.tagName("tr"))
                .stream()
                .filter(c -> c.find(By.tagName("td")).getText().equalsIgnoreCase(colorName))
                .collect(Collectors.toList());
        assertFalse("The color name: "+colorName+" is unknown", anchors.size()!=1);
        anchors.get(0).click();
    }
    public void setCarColor(String colorName) { //TODO delete if not use
        element(COLOR_LABEL).click();
        waitABit(500);
        switch (colorName.toLowerCase()){
            case "red mica &black metalic":element(COLOR_RED_MIKA_BLACK).click();
                break;
            case "f white":element(COLOR_F_WHITE).click();
                break;
            case  "dark grey": element(COLOR_DARK_GREY).click();
                break;
            case "dark grey met with black roof": element(COLOR_DARK_GREY_MET_WITH_BLACK_ROOF).click();
                break;
            case "super white gloss black cloth": element(COLOR_SUPER_WHITE_GLOSS).click();
                break;
            default: fail(" The color selector for: " + colorName + " is unknown");
        }
    }

    public void setCarUpholsteryByText(String upholstery) {
        waitABit(1000);
        element(UPHOLSTERY_LABEl).click();
        waitABit(500);
        List<WebElementFacade> anchors = element(UPHOLSTERY_PANEL).thenFindAll(By.tagName("tr"))
                .stream()
                .filter(c -> c.find(By.tagName("td")).getText().equalsIgnoreCase(upholstery))
                .collect(Collectors.toList());
        assertFalse("The upholstery name: "+upholstery+" is unknown", anchors.size()!=1);
        anchors.get(0).click();
    }

    public void setUpholstery(String upholstery) { //TODO delete if not use
        waitABit(1000);
        element(UPHOLSTERY_LABEl).click();

        switch (upholstery.toLowerCase()){
            case "cloth black/grey": element(UPHOLSTERY_BLACK_CLOTH).click();
                break;
            case "leather black":element(UPHOLSTERY_Leather_Black).click();
                break;
            case "leather interior and alcantara":element(UPHOLSTERY_Leather_interior_and_Alcantara).click();
                break;
            case "super white gloss paint":element(SUPER_WHITE_GLOSS).click();
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

    public void selectOptionPackByText(String optionPack) {
        waitABit(2000);
        List<WebElementFacade> anchors = element(OPTION_PACK_BODY_ELEMENT).thenFindAll(By.className("row"))
                .stream()
                .filter(c -> c.find(By.className("optionNameColumn")).getText().equalsIgnoreCase(optionPack))
                .collect(Collectors.toList());
        assertFalse("The optionPack: "+optionPack+" is unknown", anchors.size()!=1);
        scrollToPosition(0,500);
        waitABit(750);
        WebElement optchk = anchors.get(0).findElement(By.className("optchk"));
        optchk.findElement(By.tagName("div")).click();
        waitABit(500);
    }

    public void setAccessoriesByText(String accessory){
        waitABit(1000);
        List<WebElementFacade> anchors = element(ACCESSORIES_BODY_ELEMENT).thenFindAll(By.tagName("tr"))
                .stream()
                .filter(c -> c.find(By.className("optdescription")).getText().equalsIgnoreCase(accessory))
                .collect(Collectors.toList());
        anchors.get(0).findElement(By.className("optchk")).click();
        waitABit(1000);
    }
    public void setAccessories(String accessory) { //TODO delete if not use
        waitABit(2000);
        switch (accessory){
            case "Lojack classic":element(LOJACK_CLASSIC).click();
                break;
            case "LoJack Premium":element(LoJack_Premium).click();
                break;
            case "Portabici Sx":element(PORTABICI_SX).click();
                break;
            case "Lojack premium":element(LOGJACK_PREMIUM).click();
                break;
            default:
                fail(" The option selector for: " + accessory + " is unknown");
        }
    }

    public void selectsOptionFromPopUp() {
        waitABit(2000);
        element(By.cssSelector(".validateOptionActions")).click();
    }
}
