package test;

import baseEntities.BaseTest;
import configuration.ReadProperties;
import org.testng.Assert;
import org.testng.annotations.Test;

public class ChainOfInvocationTests extends BaseTest {

    @Test
    public void successLoginTest() {
        userStep.successfulLogin(ReadProperties.username(), ReadProperties.password());
    }
}