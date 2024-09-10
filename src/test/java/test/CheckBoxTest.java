package test;

import baseEntities.BaseTest;
import configuration.ReadProperties;
import org.testng.annotations.Test;

public class CheckBoxTest extends BaseTest {

    @Test
    public void checkBoxTest(){
        userStep.successfulLogin(ReadProperties.username(), ReadProperties.password());
        userStep.openEditProjectPage();
        projectStep.clickCheckBox();
    }

    @Test
    public void removeBoxTest() {
        userStep.successfulLogin(ReadProperties.username(), ReadProperties.password());
        userStep.openEditProjectPage();
        projectStep.removeCheckBox();
    }
}
