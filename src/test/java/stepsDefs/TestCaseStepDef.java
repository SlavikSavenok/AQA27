package stepsDefs;

import baseEntities.BaseTest;
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
    }

    @When("user clicks Test Cases")
    public void userClickTestCases() {
        dashboardPage = new DashboardPage(baseTest.driver);
        dashboardPage.clickTestCases();
    }

    @Then("Test Cases page is displayed")
    public void isAddMilestonePageOpened() {
        testCasesPage = new TestCasesPage(baseTest.driver);
        Assert.assertTrue(testCasesPage.isPageOpened());
    }

    @When("user clicks Add TestCase")
    public void userClickAddTestCase() {
        testCasesPage = new TestCasesPage(baseTest.driver);
        testCasesPage.clickAddTestCase();
    }

    @Then("Add TestCase page is displayed")
    public void isAddTestCasePageOpened() {
        addTestCasePage = new AddTestCasePage(baseTest.driver);
        Assert.assertTrue(addTestCasePage.isPageOpened());
    }

}
