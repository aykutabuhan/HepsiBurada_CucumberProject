package stepDefinition;

import drivers.Driver;
import io.cucumber.java.After;
import io.cucumber.java.en.Given;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;

public class BasePageSteps extends Driver{

    protected static WebDriver ms_driver;
    @Given("navigate to website {string}")
    public void navigate_to_website(String url) {
        ms_driver = Driver.getDriver();
        getDriver().get(url);
    }


}

