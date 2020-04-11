package Components.sale;

import Pages.ReusableViewElements;
import net.serenitybdd.core.annotations.findby.By;
import org.openqa.selenium.WebDriver;

import static org.assertj.core.api.Assertions.assertThat;

public class VehicleComponent extends ReusableViewElements {

    private  String manufacturer_id = "quote:makeList:1:j_idt705";
    public VehicleComponent(WebDriver driver) {
        super(driver);
    }


    public void selectCarManufacturer(String manufacturer) {
        waitABit(7000);
        assertThat(element(By.id(manufacturer_id)).getText().equalsIgnoreCase(manufacturer));
        element(By.id(manufacturer_id)).click();
    }

    public void openMakeSelectionBox(){
        waitABit(3000);
        element(By.xpath("//button[@id='quote_actions_dealer:j_idt133']/span")).click();
    }

    public void selectCarModel(){
        waitABit(2000);
        element(By.id("quote:modelList:0:j_idt714")).click();
    }
}
