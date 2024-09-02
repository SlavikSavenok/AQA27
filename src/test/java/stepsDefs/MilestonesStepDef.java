package stepsDefs;

import baseEntities.BaseTest;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.testng.Assert;
import pages.AddMilestonePage;
import pages.DashboardPage;
import pages.MilestonesPage;
import pages.ProjectPage;


public class MilestonesStepDef extends BaseTest {

    DashboardPage dashboardPage;
    MilestonesPage milestonesPage;
    AddMilestonePage adMilestonesPage;
    ProjectPage projectPage;
    private BaseTest baseTest;


    public MilestonesStepDef(BaseTest baseTest) {
        this.baseTest = baseTest;
        dashboardPage = new DashboardPage(baseTest.driver);
        milestonesPage = new MilestonesPage(baseTest.driver);
        adMilestonesPage = new AddMilestonePage(baseTest.driver);
        projectPage = new ProjectPage(baseTest.driver);


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
        Assert.assertTrue(adMilestonesPage.isPageOpened());
    }

    @And("write Name {string}")
    public void writeName(String name) {
        adMilestonesPage.setNameValue(name);
    }

    @And("write References {string}")
    public void writeReferences(String value) {
        adMilestonesPage.setReferencesValue(value);
    }

    @And("write Description {string}")
    public void writeDescription(String value) {
        adMilestonesPage.setDescriptionValue(value);
    }

    @And("user clicks Start Date field")
    public void userClickStartDate() {
        adMilestonesPage.clickStartDate();
    }

    @And("user clicks on the selected start date")
    public void userClickSelectedStartDate() {
        adMilestonesPage.clickFirstAugustDate();
    }


    @And("user clicks on End Date field")
    public void userClickEndDate() {
        adMilestonesPage.clickEndDate();
    }


    @And("user clicks on the selected end date")
    public void userClickSelectedEndDate() {
        adMilestonesPage.clickThirtyFirstAugustDate();
    }

    @And("user click checkbox 'This milestone is completed'")
    public void userClickCheckBox() {
        adMilestonesPage.setCheckBox();
    }

    @Then("user clicks Add Milestone Button")
    public void userClickAddMilestoneButton() {
        adMilestonesPage.clickAddMilestone();
    }

    @When("user click AQA27 project")
    public void userClickAQA27ProjectName() {
        milestonesPage.clickOnProjectNameAQA27();
    }

    @When("user click ViachaslauAQA27 project")
    public void userClickViachaslauAQA27ProjectName() {
        milestonesPage.clickOnProjectNameViachaslauAQA27();
    }

    @Then("project page is displayed")
    public void isProjectPageOpened() {
        Assert.assertTrue(projectPage.isPageOpened());
    }

    @When("user clicks Edit button")
    public void userClickEditButton() {
        projectPage.clickEditButton();
    }

    @Then("name field has value {string}")
    public void isNameField(String expectedValue) {
        Assert.assertEquals(adMilestonesPage.readNameField(), expectedValue);
    }

    @And("references field has value {string}")
    public void isReferenceField(String expectedValue) {
        Assert.assertEquals(adMilestonesPage.readReferencesField(), expectedValue);
    }

    @And("description field has value {string}")
    public void isDescriptionField(String expectedValue) {
        Assert.assertEquals(adMilestonesPage.readDescriptionField(), expectedValue);
    }

    @And("start date field has value {string}")
    public void isStartDateField(String expectedValue) {
        Assert.assertEquals(adMilestonesPage.readStartDateField(), expectedValue);
    }

    @And("end date field has value {string}")
    public void isEndDateField(String expectedValue) {
        Assert.assertEquals(adMilestonesPage.readEndDateField(), expectedValue);
    }

    @And("is checkbox 'milestone completed' marked")
    public void isCheckboxField() {
        Assert.assertTrue(adMilestonesPage.readCheckboxField());

    }

    @And("update Name field on {string}")
    public void updateNameField(String value) {
        adMilestonesPage.updateNameField(value);
    }

    @And("update References field on {string}")
    public void updateReferenceField(String value) {
        adMilestonesPage.updateReferenceField(value);
    }

    @And("update Description field on {string}")
    public void updateDescriptionField(String value) {
        adMilestonesPage.updateDescriptionField(value);
    }

    @And("update Start Date")
    public void updateStartDate() {
        adMilestonesPage.updateStartDate();
    }

    @And("update End Date")
    public void updateEndDate() {
        adMilestonesPage.updateEndDate();
    }

    @And("remove checkbox")
    public void updateCheckbox() {
        adMilestonesPage.removeCheckbox();
    }

    @When("user click delete this milestone")
    public void deleteMilestone() {
        adMilestonesPage.deleteMilestone();
    }

    @Then("popup window appears is displayed")
    public void isPopupWindowDisplayed() {
        Assert.assertTrue(adMilestonesPage.isPopupOpened());
    }

    @Then("set checkbox delete milestone")
    public void setCheckboxDeleteMilestone() {
        adMilestonesPage.setDeleteCheckbox();
    }

    @And("user click Ok button in popup window")
    public void clickOkButtonInPopupWindow() {
        adMilestonesPage.clickOkButtonPopupWindow();
    }
}
