package stepDefinition;

import pages.ProductListPage;
import io.cucumber.java.en.And;

public class ProductListPageSteps {
    private static ProductListPage m_productListPage;

    @And("click to first product")
    public void clickToFirstProduct() {
        m_productListPage.clickFirstProduct();
    }
}
