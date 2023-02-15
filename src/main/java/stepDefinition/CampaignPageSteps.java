package stepDefinition;

import drivers.Driver;
import pages.MainPage;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.testng.Assert;

public class CampaignPageSteps extends Driver {
    private final MainPage m_mainPage = new MainPage(getDriver());
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
