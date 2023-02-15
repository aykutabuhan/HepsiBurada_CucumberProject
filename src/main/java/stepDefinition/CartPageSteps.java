package stepDefinition;

import drivers.Driver;
import io.cucumber.java.en.And;
import org.openqa.selenium.safari.SafariDriver;
import pages.CartPage;

public class CartPageSteps extends Driver {
    private static final CartPage m_cartPage =new CartPage(getDriver());

    @And("click to my account")
    public void clickToAccount() {
        m_cartPage.clickMyAccount();
    }

    @And("click to login")
    public void clickToLogin() {
        m_cartPage.clickEnterMyAccount();
    }
}
