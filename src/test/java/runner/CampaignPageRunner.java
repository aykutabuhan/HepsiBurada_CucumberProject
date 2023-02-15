package runner;

import drivers.Driver;
import io.cucumber.junit.Cucumber;
import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;
import org.junit.runner.RunWith;
import org.openqa.selenium.Capabilities;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.openqa.selenium.safari.SafariDriver;
import org.openqa.selenium.safari.SafariOptions;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Parameters;

import java.net.MalformedURLException;
import java.net.URL;

@RunWith(Cucumber.class)

@CucumberOptions(
        features = {"src/test/java/features/campaignpage.feature"},
        //     plugin = {"pretty", "io.qameta.allure.cucumber7jvm.AllureCucumber7Jvm"},
        glue = {"stepDefinition"}
)

public class CampaignPageRunner extends AbstractTestNGCucumberTests {

    @BeforeClass
    @Parameters({"browser", "host", "port"})
    public static void initializationDriver(String browserName, String host, String port) throws MalformedURLException {

        if (browserName.equalsIgnoreCase("Chrome")){
         //   System.setProperty("webdriver.chrome.driver", "src/main/resources/chromedriver");
            Driver.setDriver(new RemoteWebDriver(new URL("http://" +host+ ":" +port+ "/wd/hub"), new ChromeOptions()));
        }
        else if (browserName.equalsIgnoreCase("Safari")) {
            Driver.setDriver(new RemoteWebDriver(new URL("http://" +host+ ":" +port+ "/wd/hub"), new SafariOptions()));
        }
    }

    @AfterClass
    public void quit() throws InterruptedException {
        Driver.getDriver().quit();
    }
}
