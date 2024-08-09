package test;

import baseEntities.BaseTest;
import configuration.ReadProperties;
import org.testng.annotations.Test;

public class DropDownTest extends BaseTest {

    @Test
    public void dropDownTest() throws InterruptedException {
        userStep.successfulLogin(ReadProperties.username(), ReadProperties.password());
        userStep.editTestCasesPage();
        projectStep.addTestCase();
        projectStep.selectPriorityDropDownByIndex(1);
        Thread.sleep(3000);
    }
}
