package drivers;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.safari.SafariDriver;

public class Driver {
    private static WebDriver ms_driver;
    public static WebDriver initializationDriver(String browserName){

        if (browserName.equalsIgnoreCase("Chrome")){
            System.setProperty("webdriver.chrome.driver", "src/main/resources/chromedriver");
            ms_driver = new ChromeDriver();
        }
        else if (browserName.equalsIgnoreCase("Safafi")) {
            ms_driver = new SafariDriver();
        }
        else
            return null;

        return getDriver();
    }
    public static void setDriver(WebDriver driver){
         ms_driver = driver;
    }
    public static WebDriver getDriver(){
        return  ms_driver;
    }
}
