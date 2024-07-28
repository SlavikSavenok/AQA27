package baseEntities;

import configuration.ReadProperties;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import services.BrowsersService;
import services.WaitsService;


public class BaseTest {
    protected WebDriver driver;
    protected WaitsService waitsService;
    protected Actions actions;


    @BeforeMethod
    public void setup() {
        driver = new BrowsersService().getDriver();
        waitsService = new WaitsService(driver);
        actions = new Actions(driver);
        driver.get(ReadProperties.getUrlContextMenu());
    }

    @AfterMethod
    public void tearDown() {
        driver.quit();
    }
}

