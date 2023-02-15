package stepDefinition;

import drivers.Driver;
import pages.ProductListPage;
import io.cucumber.java.en.And;

public class ProductListPageSteps extends Driver {
    private final ProductListPage m_productListPage = new ProductListPage(getDriver());

    @And("click to first product")
    public void clickToFirstProduct() {
        m_productListPage.clickFirstProduct();
    }
}
