package Components.sale;

import Pages.ReusableViewElements;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class ProductComponent extends ReusableViewElements {

    public final By KINTO_ONE = By.id("quote:qtemplate3_0");
    public final By PRODUCT_LIST = By.id("quote:qtemplate3_label");
    public final By KINTO_ONE_DECALAGE = By.id("quote:qtemplate3_1");
//    public final By Kinto_One_decalage = By.id("quote:qtemplate3_label");
    public ProductComponent(WebDriver driver) {
        super(driver);
    }

    public void setProduct(String product) {
        waitABit(1000);
        element(PRODUCT_LIST).click();
        element(KINTO_ONE_DECALAGE).click();
        waitABit(2000);
        element(PRODUCT_LIST).click();
        element(KINTO_ONE).click();
        waitABit(2000);
//        element(PRODUCT_LIST).click();
//        element(Kinto_One_decalage).click();
//        waitABit(2000);
    }
}
