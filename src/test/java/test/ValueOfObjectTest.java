package test;

import baseEntities.BaseTest;
import configuration.ReadProperties;
import org.testng.annotations.Test;

public class ValueOfObjectTest extends BaseTest {

    @Test
    public void successLoginTest() throws InterruptedException {
        userStep.successfulLogin(ReadProperties.username(), ReadProperties.password());
        projectStep.clickAddProject();
        project.setProjectName("xxx");

        projectStep.addProject(project);
        Thread.sleep(3000);
    }
}