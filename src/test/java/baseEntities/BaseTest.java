package baseEntities;

import configuration.ReadProperties;
import models.Project;
import org.openqa.selenium.WebDriver;
import org.testng.ITestContext;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Listeners;
import pages.AddTestCasePage;
import services.BrowsersService;
import services.WaitsService;
import steps.ProjectStep;
import steps.UserStep;
import utils.InvokedListener;


@Listeners(InvokedListener.class)
public class BaseTest {
    protected WebDriver driver;
    protected UserStep userStep;
    protected WaitsService waitsService;
    protected ProjectStep projectStep;
    protected AddTestCasePage addTestCasePage;
    protected Project project;

    @BeforeMethod
    public void setup(ITestContext iTestContext) {
        driver = new BrowsersService().getDriver();
        waitsService = new WaitsService(driver);
        iTestContext.setAttribute("webdriver", driver);
        userStep = new UserStep(driver);
        projectStep = new ProjectStep(driver);
        addTestCasePage = new AddTestCasePage(driver);
        project = new Project();
        driver.get(ReadProperties.getUrl());
    }

    @AfterMethod
    public void teardown() {
        driver.quit();
    }
}
