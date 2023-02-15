package runner;

import drivers.Driver;
import io.cucumber.junit.Cucumber;
import io.cucumber.testng.CucumberOptions;
import org.junit.runner.RunWith;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.safari.SafariDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Parameters;

@RunWith(Cucumber.class)

@CucumberOptions(
        features = {"src/test/java/features/productlistpage.feature"},
        //     plugin = {"pretty", "io.qameta.allure.cucumber7jvm.AllureCucumber7Jvm"},
        glue = {"stepDefinition"}
)

public class ProductListPageRunner {
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
    public void quit() throws InterruptedException {
        Driver.getDriver().quit();
    }
}
