package Components.sale;

import Pages.ReusableViewElements;
import net.serenitybdd.core.annotations.findby.By;
import org.openqa.selenium.WebDriver;

import static org.assertj.core.api.Assertions.assertThat;

public class VehicleComponent extends ReusableViewElements {

    private final String manufacturer_id = "quote:makeList:1:j_idt705";
    private final String carType = "typespan8"; // TODO make the typeSpan iterable
    private final String carModel = "quote:modelList:13:j_idt714"; //TODO make model distinct
    public VehicleComponent(WebDriver driver) {
        super(driver);
    }


    public void selectCarManufacturer(String manufacturer) {
//        assertThat(element(By.id(manufacturer_id)).getText().equalsIgnoreCase(manufacturer));
        waitABit(4000);
        element(By.xpath("//*[@id=\"quote:makeFieldSet\"]/legend")).click(); //TODO refactor lazy solution
        element(By.id(manufacturer_id)).click();
        waitABit(3000);
    }

    public void openMakeSelectionBox(){
        waitABit(5000);
        element(By.xpath("//button[@id='quote_actions_dealer:j_idt133']/span")).click();
        waitABit(3000);
    }

    public void selectCarModel(){
        waitABit(2000);
        element(By.id(carModel)).click();
        waitABit(2000);
    }

    public void selCarType() {
        waitABit(1000);
        element(By.id(carType)).click();
    }
}
