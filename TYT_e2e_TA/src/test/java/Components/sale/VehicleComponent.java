package Components.sale;

import Pages.ReusableViewElements;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import static org.junit.Assert.*;

public class VehicleComponent extends ReusableViewElements {

    private final By TOYOTA = By.id("quote:makeList:1:j_idt705");
    private final By LEXUS = By.id("quote:makeList:0:j_idt705");
    private final String TYPE_SPAN = "typespan";
    private final By YARIS = By.id("quote:modelList:13:j_idt714");
    private final By RX = By.id("quote:modelList:7:j_idt714");
    public VehicleComponent(WebDriver driver) {
        super(driver);
    }


    public void selectCarManufacturer(String manufacturer) {
        waitABit(4000);
        element(By.xpath("//*[@id='quote:makeFieldSet']/legend")).click(); //TODO refactor lazy solution
        waitABit(2000);
        switch (manufacturer){
            case "Toyota": element(TOYOTA).click();
                break;
            case "Lexus": element(LEXUS).click();
                break;
            default:assertFalse(" The manufacturer selector for: "+manufacturer+" is unknown", true);
        }
        waitABit(3000);
    }

    public void selectCarModel(String model){
        switch (model){
            case "Yaris": element(YARIS).click();
                break;
            case "Rx":element(RX).click();
                break;
            default:assertFalse(" The model selector for: "+model+" is unknown", true);
        }
        waitABit(2000);
    }

    public void selCarType(String carType) {
        waitABit(1000);
        switch (carType){
            case "TODO": element(By.id(TYPE_SPAN+8)).click();
                break;
            case "450h F Sport":element(By.id(TYPE_SPAN+1)).click();
                break;
            default:assertFalse(" The carType selector for:"+carType+" is unknown", true);
        }
        waitABit(2000);
    }
}
