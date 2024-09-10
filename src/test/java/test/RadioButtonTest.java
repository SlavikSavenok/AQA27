package test;

import baseEntities.BaseTest;
import configuration.ReadProperties;
import org.testng.annotations.Test;

public class RadioButtonTest extends BaseTest {

    @Test
    public void indexRadioButtonTest() {
        userStep.successfulLogin(ReadProperties.username(), ReadProperties.password());
        userStep.openEditProjectPage();
        projectStep.selectRadioButtonByIndex(2);
    }

    @Test
    public void valueRadioButtonTest() {
        userStep.successfulLogin(ReadProperties.username(), ReadProperties.password());
        userStep.openEditProjectPage();
        projectStep.selectRadioButtonByValue("3");
    }

    @Test
    public void textRadioButtonTest() {
        userStep.successfulLogin(ReadProperties.username(), ReadProperties.password());
        userStep.openEditProjectPage();
        projectStep.selectRadioButtonByText("Use multiple test suites to manage cases");
    }
}
