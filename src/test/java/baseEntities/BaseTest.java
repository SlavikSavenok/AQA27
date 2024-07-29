package baseEntities;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import services.BrowsersService;
import services.WaitsService;
import steps.ContextMenuSteps;
import steps.DynamicControlSteps;

public class BaseTest {
    protected WebDriver driver;
    protected WaitsService waitsService;
    protected ContextMenuSteps contextMenuSteps;
    protected DynamicControlSteps dynamicControlSteps;

    @BeforeMethod
    public void setUp() {
        driver = new BrowsersService().getDriver();
        waitsService = new WaitsService(driver);
        contextMenuSteps = new ContextMenuSteps(driver);
        dynamicControlSteps=new DynamicControlSteps(driver);
    }

    @AfterMethod
    public void tearDown() {
        driver.quit();
    }
}

