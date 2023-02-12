package drivers;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.safari.SafariDriver;

public class Driver {

    private static final ThreadLocal<WebDriver> ms_driver = new ThreadLocal<>();
    public static WebDriver initializationDriver(String browserName){

        if (browserName.equalsIgnoreCase("Chrome")){
            System.setProperty("webdriver.chrome.driver", "src/main/resources/chromedriver");
            return new ChromeDriver();
        }
        else if (browserName.equalsIgnoreCase("Safafi")) {
            return new SafariDriver();
        }
        else
            return null;
    }
    public void setDriver(WebDriver driver){
         ms_driver.set(driver);
    }
    public WebDriver getDriver(){
        return ms_driver.get();
    }
}
