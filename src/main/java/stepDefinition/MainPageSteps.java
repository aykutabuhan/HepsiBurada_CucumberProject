package stepDefinition;

import drivers.Driver;
import pages.MainPage;
import io.cucumber.java.en.And;

public class MainPageSteps extends Driver {
    private static final MainPage m_mainPage = new MainPage(getDriver());

    @And("click to accept cookies")
    public void clickToAcceptCookies() {
        m_mainPage.acceptCookies();
    }
    @And("search product and click {}")
    public void searchProductAndClick(String productName) {
        m_mainPage.searchProductNameAndClick(productName);
    }
}
