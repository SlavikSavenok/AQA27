package baseEntities;

import org.openqa.selenium.WebDriver;
import pages.*;

public class BaseStep {
    protected WebDriver driver;
    protected LoginPage loginPage;
    protected DashboardPage dashboardPage;
    protected AddProjectPage addProjectPage;
    protected TestCasesPage testCasesPage;
    protected AddTestCasePage addTestCasePage;
    protected ProjectsPage projectsPage;

    public BaseStep(WebDriver driver) {
        this.driver = driver;
        addProjectPage = new AddProjectPage(driver);
        loginPage = new LoginPage(driver);
        dashboardPage = new DashboardPage(driver);
        testCasesPage = new TestCasesPage(driver);
        addTestCasePage = new AddTestCasePage(driver);
        projectsPage = new ProjectsPage(driver);
    }
}