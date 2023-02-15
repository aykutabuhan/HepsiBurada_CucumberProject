package drivers;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.remote.RemoteWebDriver;

public class Driver {
    private static final ThreadLocal<WebDriver> ms_driver = new ThreadLocal<>();


    public static WebDriver getDriver(){
        return  ms_driver.get();
    }
    public static void setDriver(final RemoteWebDriver driver ) {
        ms_driver.set(driver);
    }
}
