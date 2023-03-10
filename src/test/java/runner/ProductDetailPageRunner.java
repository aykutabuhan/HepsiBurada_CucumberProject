package runner;

import drivers.Driver;
import io.cucumber.junit.Cucumber;
import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;
import org.junit.runner.RunWith;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.safari.SafariDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Parameters;

@RunWith(Cucumber.class)

@CucumberOptions(
        features = {"src/test/java/features/productdetailpage.feature"},
        //     plugin = {"pretty", "io.qameta.allure.cucumber7jvm.AllureCucumber7Jvm"},
        glue = {"stepDefinition"}
)

public class ProductDetailPageRunner extends AbstractTestNGCucumberTests {
    @BeforeClass
    @Parameters({"browser"})
    public static void initializationDriver(String browserName){

        if (browserName.equalsIgnoreCase("Chrome")){
            System.setProperty("webdriver.chrome.driver", "src/main/resources/chromedriver");
            Driver.setDriver(new ChromeDriver());
        }
        else if (browserName.equalsIgnoreCase("Safari")) {
            Driver.setDriver(new SafariDriver());
        }
    }

    @AfterClass
    public void quit() {
        Driver.getDriver().quit();
    }
}
