package test;

import baseEntities.BaseTest;
import configuration.ReadProperties;
import org.testng.annotations.Test;

public class DropDownTest extends BaseTest {

    @Test
    public void dropDownTestPriority() {
        userStep.successfulLogin(ReadProperties.username(), ReadProperties.password());
        userStep.editTestCasesPage();
        projectStep.addTestCase();
        projectStep.selectDropDownByIndex(3);

    }
}
