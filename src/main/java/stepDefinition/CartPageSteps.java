package stepDefinition;

import io.cucumber.java.en.And;
import pages.CartPage;

public class CartPageSteps {

    private static final CartPage m_cartPage = new CartPage();
    @And("click to my account")
    public void clickToAccount() {
        m_cartPage.clickMyAccount();
    }

    @And("click to login")
    public void clickToLogin() {
        m_cartPage.clickEnterMyAccount();
    }
}
