package test;

import baseEntities.BaseTest;
import configuration.ReadProperties;
import org.testng.annotations.Test;

public class RadioButtonTest extends BaseTest {

    @Test
    public void radioButtonTest() {
        userStep.successfulLogin(ReadProperties.username(), ReadProperties.password());
        userStep.openEditProjectPage();
    }
}
