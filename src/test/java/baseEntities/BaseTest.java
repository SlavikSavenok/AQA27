package baseEntities;

import configuration.ReadProperties;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import services.BrowsersService;
import steps.AddRemoveSteps;
import steps.PaymentSteps;
import steps.UserSteps;

public class BaseTest {
    protected WebDriver driver;
    protected UserSteps userSteps;
    protected AddRemoveSteps addRemoveSteps;
    protected PaymentSteps paymentSteps;

    @BeforeMethod
    public void setup() {
        driver = new BrowsersService().getDriver();
        userSteps = new UserSteps(driver);
        addRemoveSteps = new AddRemoveSteps(driver);
        paymentSteps = new PaymentSteps(driver);
        driver.get(ReadProperties.getUrl());
    }

    @AfterMethod
    public void tearDown() {
        driver.quit();
    }
}

