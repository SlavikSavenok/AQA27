package test;

import baseEntities.BaseTest;
import configuration.ReadProperties;
import org.testng.Assert;
import org.testng.annotations.Test;

public class ValueOfObjectTest extends BaseTest {

    @Test
    public void valueOfObjectTest() {
        userStep.successfulLogin(ReadProperties.username(), ReadProperties.password());
        projectStep.clickAddProject();
        project.setProjectName(faker.pokemon().name());
        project.setAnnouncement(faker.company().name());
        project.setShowAnnouncement(true);
        Assert.assertTrue(project.isShowAnnouncement());
        project.setProjectType(1);
        project.setEnableApprovals(false);
        Assert.assertFalse(project.isEnableApprovals());
        projectStep.addProject(project);
        projectStep.createProject();
        Assert.assertTrue(projectsPage.isProjectCreated());
    }
}