package stepDefinition;

import org.openqa.selenium.WebDriver;
import pages.MainPage;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.testng.Assert;

public class CampaignPageSteps {
    private static final MainPage m_mainPage = new MainPage();
    private static final String CAMPAIGN_TEXT = "Kampanyalar";

    @When("click to campaign button")
    public void clickToCampaignButton() {
        m_mainPage.clickCampaignLocator();
    }
    @Then("verify campaign page")
    public void verifyCampaignPage() {
        Assert.assertEquals(m_mainPage.getCampaignText(), CAMPAIGN_TEXT, "Not on the campaign page!");
    }
}
