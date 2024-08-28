package stepsDefs;

import baseEntities.BaseTest;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.testng.Assert;
import pages.AddMilestonePage;
import pages.DashboardPage;
import pages.MilestonesPage;


public class MilestonesStepDef extends BaseTest {

    DashboardPage dashboardPage;
    MilestonesPage milestonesPage;
    AddMilestonePage adMilestonesPage;
    private BaseTest baseTest;


    public MilestonesStepDef(BaseTest baseTest) {
        this.baseTest = baseTest;
        dashboardPage=new DashboardPage(baseTest.driver);
        milestonesPage=new MilestonesPage(baseTest.driver);

    }

    @When("user clicks milestones")
    public void userClickMilestone() {
        dashboardPage.clickMilestones();
    }

    @Then("milestones page is displayed")
    public void isMilestonePageDisplayed() {
        Assert.assertTrue(milestonesPage.isPageOpened());
    }

    @When("user clicks Add Milestone")
    public void userClickAddMilestone() {
        milestonesPage.clickAddMilestone();
    }

    @Then("Add Milestones page is displayed")
    public void isAddMilestonePageOpened() {
        adMilestonesPage = new AddMilestonePage(baseTest.driver);
        Assert.assertTrue(adMilestonesPage.isPageOpened());
    }

    @And("write name {string}")
    public void writeName(String name) {
        adMilestonesPage = new AddMilestonePage(baseTest.driver);
        adMilestonesPage.setNameValue(name);
    }
}
