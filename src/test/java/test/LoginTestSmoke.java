package test;

import baseEntities.BaseTest;
import configuration.ReadProperties;
import io.qameta.allure.Description;
import io.qameta.allure.Severity;
import io.qameta.allure.SeverityLevel;
import org.testng.Assert;
import org.testng.annotations.Test;

public class LoginTestSmoke extends BaseTest {

    @Test(description = "Тест на проверку логина")
    @Description("Тест проверяет вход под логином VisualUser")
    @Severity(SeverityLevel.CRITICAL)
    public void loginTestVisualUser(){
        Assert.assertTrue(userSteps.successLogin("visual_user", ReadProperties.password()).isPageOpen());
    }
}
