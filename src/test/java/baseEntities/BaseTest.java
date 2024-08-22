package baseEntities;

import com.codeborne.selenide.Browsers;
import com.codeborne.selenide.Configuration;
import com.codeborne.selenide.WebDriverRunner;
import configuration.ReadProperties;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import steps.AddRemoveSteps;
import steps.PaymentSteps;
import steps.UserSteps;

import static com.codeborne.selenide.Selenide.open;

public class BaseTest {
    protected UserSteps userSteps;
    protected AddRemoveSteps addRemoveSteps;
    protected PaymentSteps paymentSteps;

    @BeforeMethod
    public void setup() {
        open(ReadProperties.getUrl());
        WebDriverRunner.driver().getWebDriver().manage().window().maximize();
        userSteps = new UserSteps();
        addRemoveSteps = new AddRemoveSteps();
        paymentSteps = new PaymentSteps();
    }
}

