package runner;

import io.cucumber.junit.Cucumber;
import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;
import org.junit.BeforeClass;
import org.junit.runner.RunWith;
import org.openqa.selenium.WebDriver;

@RunWith(Cucumber.class)

@CucumberOptions(
        features = {"src/test/java/features"},
   //     plugin = {"pretty", "io.qameta.allure.cucumber7jvm.AllureCucumber7Jvm"},
        glue = {"stepDefinition"}
)

public class TestRunner extends AbstractTestNGCucumberTests {

    @BeforeClass
    public void before(WebDriver driver){

    }
}
