package baseEntities;

import configuration.ReadProperties;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import services.BrowsersService;
import steps.UserSteps;

public class BaseTest {
    protected WebDriver driver;
    protected UserSteps userSteps;


    @BeforeMethod
    public void setup() {
        driver = new BrowsersService().getDriver();
        userSteps = new UserSteps(driver);
        driver.get(ReadProperties.getUrl());
    }

    @AfterMethod
    public void teardown() {
        driver.quit();
    }
}

