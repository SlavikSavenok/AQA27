package baseEntities;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import pages.ContextMenuPage;
import services.BrowsersService;
import services.WaitsService;
import steps.UserSteps;


public class BaseTest {
    protected WebDriver driver;
    protected WaitsService waitsService;
    protected Actions actions;
    protected ContextMenuPage contextMenuPage;
  // protected UserSteps userSteps;



    @BeforeMethod
    public void setUp() {
        driver = new BrowsersService().getDriver();
        waitsService = new WaitsService(driver);
        actions = new Actions(driver);
        contextMenuPage =new ContextMenuPage(driver);
       // userSteps = new UserSteps(driver);

    }

    @AfterMethod
    public void tearDown() {
        driver.quit();
    }
}

