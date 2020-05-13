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
    private final By CHR = By.id("quote:modelList:1:j_idt714");
    private final By COROLLA = By.id("quote:modelList:2:j_idt714");
    public VehicleComponent(WebDriver driver) {
        super(driver);
    }


    public void selectCarManufacturer(String manufacturer) {
        waitABit(4000);
        element(By.xpath("//*[@id='quote:makeFieldSet']/legend")).click(); //TODO refactor lazy solution
        waitABit(2000);
        switch (manufacturer.toLowerCase()){
            case "toyota": element(TOYOTA).click();
                break;
            case "lexus": element(LEXUS).click();
                break;
            default:assertFalse(" The manufacturer selector for: "+manufacturer+" is unknown", true);
        }
        waitABit(3000);
    }

    public void selectCarModel(String model){
        switch (model.toLowerCase()){
            case "yaris": element(YARIS).click();
                break;
            case "rx":element(RX).click();
                break;
            case "chr":element(CHR).click();
                break;
            case "corolla":element(COROLLA).click();
                break;
            default:assertFalse(" The model selector for: "+model+" is unknown", true);
        }
        waitABit(2000);
    }

    public void selCarType(String carType) {
        waitABit(1000);
        switch (carType){
            case "1.5 Hybrid Lounge Red/Bronze MY19": element(By.id(TYPE_SPAN+8)).click();
                break;
            case "450h F Sport":element(By.id(TYPE_SPAN+1)).click();
                break;
            case "1.8H (122CV) E-CVT Dynamic (2019)":element(By.id(TYPE_SPAN+6)).click();
                break;
            case "TS Hybrid Active":element(By.id(TYPE_SPAN+2)).click();
                break;
            default:assertFalse(" The carType selector for:"+carType+" is unknown", true);
        }
        waitABit(2000);
    }
}
