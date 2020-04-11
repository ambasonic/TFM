package Components;

import Pages.ReusableViewElements;
import net.serenitybdd.core.annotations.findby.By;
import org.openqa.selenium.WebDriver;

public class LoginComponent extends ReusableViewElements {

    public LoginComponent(WebDriver driver) {
        super(driver);
    }

    public void setUsername(String username) {
        waitABit(2000);
        element(By.id("login:user")).sendKeys(username);
    }

    public void setPassword(String pwd) {
        element(By.id("login:password")).sendKeys(pwd);
    }

    public void submitLoginCredential() {
        element(By.id("login:loginButton")).click();
    }
}
