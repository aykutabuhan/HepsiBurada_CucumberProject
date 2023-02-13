package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;

public class CartPage extends BasePage{
    @FindBy(css = "div[class*=basket] h1")
    private WebElement myBasketLocator;
    @FindBy(css = "div[data-test-id='account-new']")
    private WebElement myAccountLocator;
    @FindBy(xpath = "//a[contains(text(),'Giriş yap')]")
    private WebElement enterMyAccountLocator;

    public boolean isOnBasketPage(){
        waitUntil(ExpectedConditions.visibilityOf(myBasketLocator), 5);
        return isDisplayed(myBasketLocator);
    }
    public void clickMyAccount(){
        m_WaitPage.until(ExpectedConditions.elementToBeClickable(myAccountLocator)).click();
    }
    public void clickEnterMyAccount(){
        m_WaitPage.until(ExpectedConditions.elementToBeClickable(enterMyAccountLocator)).click();
    }
}
