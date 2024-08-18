package test;

import baseEntities.BaseTest;
import configuration.ReadProperties;
import org.testng.Assert;
import org.testng.annotations.Test;

public class ChainOfInvocationTests extends BaseTest {

    @Test
    public void chainOfInvocationTest(){
        Assert.assertTrue(
                loginPage
                        .successfulLogin(ReadProperties.username(), ReadProperties.password())
                        .isPageOpened());
        Assert.assertTrue(
                projectStep
                         .clickAddProject()
                         .isPageOpened());
        Assert.assertTrue(
                addProjectPage
                        .successCreateProject(faker.funnyName().name(), faker.company().name(), 2)
                        .isPageOpened());

        Assert.assertTrue(projectsPage.isProjectCreated());
    }
}
