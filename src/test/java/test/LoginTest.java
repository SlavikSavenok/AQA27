package test;

import baseEntities.BaseTest;
import configuration.ReadProperties;
import io.qameta.allure.Description;
import io.qameta.allure.Severity;
import io.qameta.allure.SeverityLevel;
import io.qameta.allure.Step;
import org.testng.Assert;
import org.testng.annotations.Test;

public class LoginTest extends BaseTest {

    @Test(description = "Тест на проверку логина")
    @Description("Тест проверяет вход под логином StandardUser")
    @Severity(SeverityLevel.CRITICAL)
    public void loginTestStandardUser(){
        Assert.assertTrue(userSteps.successLogin(ReadProperties.username(), ReadProperties.password()).isPageOpen());
    }

    @Test(description = "Тест на проверку логина")
    @Description("Тест проверяет вход под логином VisualUser")
    @Severity(SeverityLevel.CRITICAL)
    public void loginTestVisualUser(){
        Assert.assertTrue(userSteps.successLogin("visual_user", ReadProperties.password()).isPageOpen());
    }

    @Test(description = "Тест на проверку логина")
    @Description("Тест проверяет вход под логином ProblemUser")
    @Severity(SeverityLevel.CRITICAL)
    public void loginTestProblemUser(){
        Assert.assertTrue(userSteps.successLogin("problem_user", ReadProperties.password()).isPageOpen());
    }
}