package stepDefinition;

import org.testng.annotations.BeforeClass;
import pages.CartPage;
import pages.ProductInformationPage;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.testng.Assert;

public class ProductDetailPageSteps {
    private static final ProductInformationPage m_productInformationPage = new ProductInformationPage();
    private static final CartPage m_cartPage = new CartPage();
    private static final int PRODUCT_COMMENTS_LIKE_INDEX = 0;


    @And("click to comments")
    public void clickToComments() {
        m_productInformationPage.clickComments();
    }
    @And("click to thumps up")
    public void clickToThumpsUp() {
        m_productInformationPage.clickThumpsUp(PRODUCT_COMMENTS_LIKE_INDEX);
    }
    @And("click to add to cart")
    public void clickToAddToCart() {
        m_productInformationPage.clickAddToCart();
    }
    @When("click to go to cart")
    public void clickToGoToCart() {
        m_productInformationPage.goToCart();
    }
    @Then("verify in cart page")
    public void verifyInCartPage() {
        Assert.assertTrue(m_cartPage.isOnBasketPage(), "Not on the Basket Page");
    }
}
