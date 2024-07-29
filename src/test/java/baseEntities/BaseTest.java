package baseEntities;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import services.BrowsersService;
import services.WaitsService;
import steps.ContextMenuSteps;

public class BaseTest {
    protected WebDriver driver;
    protected WaitsService waitsService;
    protected Actions actions;
    protected ContextMenuSteps contextMenuSteps;

    @BeforeMethod
    public void setUp() {
        driver = new BrowsersService().getDriver();
        waitsService = new WaitsService(driver);
        actions = new Actions(driver);
        contextMenuSteps = new ContextMenuSteps(driver);
    }

    @AfterMethod
    public void tearDown() {
        driver.quit();
    }
}

