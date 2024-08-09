package baseEntities;

import org.openqa.selenium.WebDriver;
import pages.*;

public class BaseStep {
    protected WebDriver driver;
    protected LoginPage loginPage;
    protected DashboardPage dashboardPage;
    protected EditProjectPage editProjectPage;
    protected TestCasesPage testCasesPage;
    protected AddTestCasePage addTestCasePage;

    public BaseStep(WebDriver driver) {
        this.driver = driver;
        editProjectPage = new EditProjectPage(driver);
        loginPage = new LoginPage(driver);
        dashboardPage = new DashboardPage(driver);
        testCasesPage=new TestCasesPage(driver);
        addTestCasePage=new AddTestCasePage(driver);
    }
}