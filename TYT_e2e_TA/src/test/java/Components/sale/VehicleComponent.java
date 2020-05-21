package Components.sale;

import Pages.ReusableViewElements;
import net.serenitybdd.core.pages.WebElementFacade;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import java.util.List;
import java.util.stream.Collectors;

import static org.junit.Assert.*;

public class VehicleComponent extends ReusableViewElements {
    private final By TOYOTA = By.id("quote:makeList:1:j_idt705");
    private final By LEXUS = By.id("quote:makeList:0:j_idt705");
    private final By MODEL_TABLE = By.id("quote:modeltable");
    private final By VEHICLE_ROWS = By.xpath("//div[@class='veh-row']");

    public VehicleComponent(WebDriver driver) {
        super(driver);
    }


    public void selectCarManufacturer(String manufacturer) {
        waitABit(3500);
        element(By.xpath("//*[@id='quote:makeFieldSet']/legend")).click(); //TODO refactor lazy solution
        waitABit(1500);
        switch (manufacturer.toLowerCase()){
            case "toyota": element(TOYOTA).click();
                break;
            case "lexus": element(LEXUS).click();
                break;
            default:assertFalse(" The manufacturer selector for: "+manufacturer+" is unknown", true);
        }
        waitABit(3000);
    }

    public void selectCarModelByText(String model){
        List<WebElementFacade> anchors = element(MODEL_TABLE).thenFindAll(By.tagName("a"))
                .stream()
                .filter(c -> c.find(By.tagName("span")).getText().equalsIgnoreCase(model))
                .collect(Collectors.toList());
        assertFalse("The model: "+model+" is unknown or more than one car model was found", anchors.size()!=1);
        anchors.get(0).click();
        waitABit(2000);
    }

    public void selectCarTypeByText(String carTye){
        List<WebElementFacade> anchors = findAll(VEHICLE_ROWS)
                .stream()
                .filter(c -> c.findElements(By.tagName("span")).get(1).getText().equalsIgnoreCase(carTye))
                .collect(Collectors.toList());
        assertFalse("The type: "+carTye+" is unknown or more than one car model was found", anchors.size()!=1);
        anchors.get(0).click();
        waitABit(2000);
    }
}
