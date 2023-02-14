package drivers;

import io.cucumber.java.After;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.safari.SafariDriver;

public class Driver {
    private static final ThreadLocal<WebDriver> ms_driver = new ThreadLocal<>();


    public static WebDriver getDriver(){
        return  ms_driver.get();
    }
    public static void setDriver(final WebDriver driver ) {
        ms_driver.set(driver);
    }
}
