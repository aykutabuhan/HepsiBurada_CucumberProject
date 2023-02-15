package stepDefinition;

import drivers.Driver;
import io.cucumber.java.en.Given;
import org.openqa.selenium.WebDriver;


public class BasePageSteps extends Driver{
    protected WebDriver m_driver;

    @Given("navigate to website {string}")
    public void navigate_to_website(String url) {
        m_driver = Driver.getDriver();
        getDriver().get(url);
    }
}

