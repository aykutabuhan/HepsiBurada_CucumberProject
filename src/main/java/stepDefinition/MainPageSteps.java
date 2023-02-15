package stepDefinition;

import drivers.Driver;
import pages.MainPage;
import io.cucumber.java.en.And;

public class MainPageSteps extends Driver {
    private final MainPage m_mainPage = new MainPage(getDriver());
    private static final String PRODUCT_SEARCH_NAME = "Iphone";

    @And("click to accept cookies")
    public void clickToAcceptCookies() {
        m_mainPage.acceptCookies();
    }
    @And("search product and click")
    public void searchProductAndClick() {
        m_mainPage.searchProductNameAndClick(PRODUCT_SEARCH_NAME);
    }
}
