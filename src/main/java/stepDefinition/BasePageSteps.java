package stepDefinition;

import drivers.Driver;
import io.cucumber.java.en.Given;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;

public class BasePageSteps {
    private WebDriver m_driver;
    @BeforeClass
    @Given("navigate to website {string}")
    public void navigate_to_website(String url) {
        m_driver = Driver.initializationDriver("Chrome");
        m_driver.manage().window().maximize();
        m_driver.get(url);
    }

    @AfterClass
    public void quit(){
        m_driver.quit();
    }


}

