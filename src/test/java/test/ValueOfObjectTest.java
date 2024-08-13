package test;

import baseEntities.BaseTest;
import configuration.ReadProperties;
import org.testng.Assert;
import org.testng.annotations.Test;

public class ValueOfObjectTest extends BaseTest {

    @Test
    public void successLoginTest(){
        userStep.successfulLogin(ReadProperties.username(), ReadProperties.password());
        projectStep.clickAddProject();
        project.setProjectName(String.valueOf(faker.pokemon()));
        project.setAnnouncement(String.valueOf(faker.lebowski()));
        project.setShowAnnouncement(true);
        Assert.assertTrue(project.isShowAnnouncement());
        project.setProjectType(1);
        project.setEnableApprovals(false);
        Assert.assertFalse(project.isEnableApprovals());
        projectStep.addProject(project);
        projectStep.createProject();
        projectsPage.isProjectCreated();
    }
}