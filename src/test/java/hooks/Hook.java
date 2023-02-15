package hooks;

import drivers.Driver;
import io.cucumber.java.AfterStep;
import io.cucumber.java.Scenario;
import io.qameta.allure.Allure;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;

import java.io.ByteArrayInputStream;

public class Hook extends Driver {
    @AfterStep
    public void afterStep(Scenario s) {
        if (s.isFailed()) {
            Allure.addAttachment(s.getName(), new ByteArrayInputStream(((TakesScreenshot) getDriver()).getScreenshotAs(OutputType.BYTES)));
        }
    }
}
