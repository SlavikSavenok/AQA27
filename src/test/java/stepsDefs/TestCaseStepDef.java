package stepsDefs;

import baseEntities.BaseTest;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.StaleElementReferenceException;
import org.testng.Assert;
import pages.DashboardPage;
import pages.TestCase.AddTestCasePage;
import pages.TestCase.TestCasePersonalPage;
import pages.TestCase.TestCasesPage;


public class TestCaseStepDef extends BaseTest {
    DashboardPage dashboardPage;
    TestCasesPage testCasesPage;
    AddTestCasePage addTestCasePage;
    TestCasePersonalPage testCasePersonalPage;
    private BaseTest baseTest;


    public TestCaseStepDef(BaseTest baseTest) {
        this.baseTest = baseTest;
        dashboardPage = new DashboardPage(baseTest.driver);
        testCasesPage = new TestCasesPage(baseTest.driver);
        addTestCasePage = new AddTestCasePage(baseTest.driver);
        testCasePersonalPage = new TestCasePersonalPage(baseTest.driver);
    }

    @When("user clicks Test Cases")
    public void userClickTestCases() {
        dashboardPage.clickTestCases();
    }

    @Then("Test Cases page is displayed")
    public void isAddMilestonePageOpened() {
        Assert.assertTrue(testCasesPage.isPageOpened());
    }

    @When("user clicks Add TestCase")
    public void userClickAddTestCase() {
        testCasesPage.clickAddTestCase();
    }

    @Then("Add TestCase page is displayed")
    public void isAddTestCasePageOpened() {
        Assert.assertTrue(addTestCasePage.isPageOpened());
    }

    @Then("write {string}")
    public void userWriteTitle(String title) {
        addTestCasePage.setTitleValue(title);
    }

    @And("select Section Dropdown {string}")
    public void userSelectsSection(String testCases) {
        addTestCasePage.setSectionDropDown(testCases);
    }

    @And("select Template Dropdown {string}")
    public void userSelectTemplate(String template) {
        addTestCasePage.setTemplateDropDown(template);
    }

    @And("select Type Dropdown {string}")
    public boolean userSelectType(String type) {
        try {
            addTestCasePage.setTypeDropDown(type);
        } catch (StaleElementReferenceException e) {
            addTestCasePage.setTypeDropDown(type);
        }
        return false;
    }

    @And("select Priority Dropdown {string}")
    public void userSelectPriority(String priority) {
        addTestCasePage.setPriorityDropDown(priority);
    }

    @And("select Assigned To Dropdown {string}")
    public void userSelectAssigned(String assigned) {
        addTestCasePage.setAssignedDropDown(assigned);
    }

    @And("write Estimate {string}")
    public void userWriteEstimate(String estimate) {
        addTestCasePage.writeEstimate(estimate);
    }

    @And("write  References {string}")
    public void userWriteReferences(String references) {
        addTestCasePage.writeReferences(references);
    }

    @And("select Automation Type To Dropdown {string}")
    public void userSelectAutomationType(String type) {
        addTestCasePage.setAutomationTypeDropDown(type);
    }

    @And("write Preconditions {string}")
    public void userWritePreconditions(String preconditions) {
        addTestCasePage.writePreconditions(preconditions);
    }

    @Then("click Add Test Case button")
    public void userClickAddTestCaseButton() {
        addTestCasePage.clickAddTestCaseButton();
    }

    @When("user clicks  Test Case TitleAQA27")
    public void userClickTitleAQA27() {
        testCasesPage.clickTestCaseAQA27();
    }

    @Then("Test Case Personal Page is displayed")
    public void isTestCasePersonalPageOpened() {
        Assert.assertTrue(testCasePersonalPage.isPageOpened());
    }

    @Then("user clicks Test Case Edit button")
    public void isTitleAQA27PageDisplayed() {
        testCasePersonalPage.clickEditButton();
    }

    @Then("Title field has value {string}")
    public void isTitleField(String expectedValue) {
        Assert.assertEquals(addTestCasePage.readTitleField(), expectedValue);
    }

    @And("Section field has value {string}")
    public void isSectionField(String expectedValue) {
        Assert.assertEquals(addTestCasePage.readSectionField(), expectedValue);
    }

    @And("Template field has value {string}")
    public void isTemplateField(String expectedValue) {
        Assert.assertEquals(addTestCasePage.readTemplateField(), expectedValue);
    }

    @And("Type field has value {string}")
    public void isTypeField(String expectedValue) {
        Assert.assertEquals(addTestCasePage.readTypeField(), expectedValue);
    }

    @And("Priority field has value {string}")
    public void isPriorityField(String expectedValue) {
        Assert.assertEquals(addTestCasePage.readPriorityField(), expectedValue);
    }

    @And("Assigned field has value {string}")
    public void isAssignedField(String expectedValue) {
        Assert.assertEquals(addTestCasePage.readAssignedField(), expectedValue);
    }

    @And("Estimate field has value {string}")
    public void isEstimateField(String expectedValue) {
        Assert.assertEquals(addTestCasePage.readEstimateField(), expectedValue);
    }

    @And("References field has value {string}")
    public void isReferencesField(String expectedValue) {
        Assert.assertEquals(addTestCasePage.readReferencesField(), expectedValue);
    }

    @And("Automation Type field has value {string}")
    public void isAutomationTypeField(String expectedValue) {
        Assert.assertEquals(addTestCasePage.readAutomationTypeField(), expectedValue);
    }

    @And("Preconditions field has value {string}")
    public void isPreconditionsField(String expectedValue) {
        Assert.assertEquals(addTestCasePage.readPreconditionsField(), expectedValue);
    }

    @Then("update Title field {string}")
    public void updateTitle(String text) {
        addTestCasePage.updateTitle(text);
    }

    @Then("update Template field {string}")
    public void updateTemplate(String text) {
        addTestCasePage.updateTemplate(text);
    }

    @Then("update Type field {string}")
    public boolean updateType(String text) {
        try {
            addTestCasePage.updateType(text);
        } catch (StaleElementReferenceException e) {
            addTestCasePage.updateType(text);
        }
        return false;
    }

    @Then("update Priority field {string}")
    public void updatePriority(String text) {
        addTestCasePage.updatePriority(text);
    }

    @Then("update Assigned To field {string}")
    public void updateAssigned(String text) {
        addTestCasePage.updateAssigned(text);
    }

    @Then("update Estimate field {string}")
    public void updateEstimate(String text) {
        addTestCasePage.updateEstimate(text);
    }

    @Then("update References field {string}")
        public void updateReferences(String text) {
        addTestCasePage.updateReferences(text);
    }


    @Then("update Automation Type field {string}")
    public void updateAutomationType(String text) {
        addTestCasePage.updateAutomationType(text);
    }

    @Then("update Preconditions Type field {string}")
    public void updatePreconditions(String text) {
        addTestCasePage.updatePreconditions(text);
    }

    @Then("user click Test Case for delete")
    public void userClickTestCaseForDelete() {
        testCasesPage.clickTestCaseForDelete();
    }

    @When("user click delete this test case")
    public void userClickDeleteThisTestCase() {
        addTestCasePage.clickDeleteTestCase();
    }

    @And("user click mark as deleted")
    public void userClickDeletePermanently(){
        addTestCasePage.clickMarkAsDelete();
    }
}
