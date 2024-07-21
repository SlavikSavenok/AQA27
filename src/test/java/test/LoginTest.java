package test;

import baseEntities.BaseTest;
import configuration.ReadProperties;
import org.testng.Assert;
import org.testng.annotations.Test;

public class LoginTest extends BaseTest {

    @Test
    public void loginTestStandardUser(){
        Assert.assertTrue(userSteps.successLogin(ReadProperties.username(), ReadProperties.password()).isPageOpen());
    }
    @Test
    public void loginTestVisualUser(){
        Assert.assertTrue(userSteps.successLogin("visual_user", ReadProperties.password()).isPageOpen());
    }
    @Test
    public void loginTestProblemUser(){
        Assert.assertTrue(userSteps.successLogin("problem_user", ReadProperties.password()).isPageOpen());
    }
}