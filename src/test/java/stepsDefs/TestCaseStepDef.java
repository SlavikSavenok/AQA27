package stepsDefs;

import baseEntities.BaseTest;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.testng.Assert;
import pages.AddTestCasePage;
import pages.DashboardPage;
import pages.TestCasesPage;


public class TestCaseStepDef extends BaseTest {
    DashboardPage dashboardPage;
    TestCasesPage testCasesPage;
    AddTestCasePage addTestCasePage;
    private BaseTest baseTest;

    public TestCaseStepDef(BaseTest baseTest) {
        this.baseTest = baseTest;
        dashboardPage = new DashboardPage(baseTest.driver);
        testCasesPage = new TestCasesPage(baseTest.driver);
        addTestCasePage = new AddTestCasePage(baseTest.driver);
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
    public void userWriteTitle(String title){
        addTestCasePage.setTitleValue(title);
    }

    @And("select Section Dropdown")
    public void userSelectsSection(){
       addTestCasePage.setSectionDropDown("Test Cases");
    }

    @And("select Template Dropdown")
    public void userTemplateSection(){
       addTestCasePage.setTemplateDropDown("Behaviour Driven Development");
    }



}
