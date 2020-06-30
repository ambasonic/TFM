package e2eTests;

import io.cucumber.junit.CucumberOptions;
import io.cucumber.junit.CucumberSerenityRunner;
import net.serenitybdd.cucumber.CucumberWithSerenity;
import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.runner.RunWith;

@RunWith(CucumberSerenityRunner.class)
@CucumberOptions(
        plugin = {"pretty"},
        features = "src/test/resources/features",
        tags = "@italy"
)
public class CucumberTestSuite {

    @BeforeClass
    public static void doMe(){
    }
    @AfterClass
    public static void makeMe(){
    }
}
