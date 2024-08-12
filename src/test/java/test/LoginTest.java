package test;

import baseEntities.BaseTest;
import configuration.ReadProperties;
import org.testng.Assert;
import org.testng.annotations.Test;

public class LoginTest extends BaseTest {

    @Test
    public void successLoginTest() throws InterruptedException {
        userStep.successfulLogin(ReadProperties.username(), ReadProperties.password());
        projectStep.addProject();
        Thread.sleep(3000);
    }
}