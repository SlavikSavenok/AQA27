package test.api;

import baseEntities.BaseApiTest;
import io.restassured.response.Response;
import models.Project;
import org.testng.Assert;
import org.testng.annotations.Test;

import static org.hamcrest.Matchers.is;

public class CrudProject extends BaseApiTest {
    private Project actualProject;

    @Test
    public void readProjectTest() {
        Project project = projectService.getProject(6);
        System.out.println(project);
        Assert.assertEquals(project.getName(), "AQA27AQA27");
    }

    @Test
    public void readProjectTest1() {
        Response response = projectService.getGeneralProject(255);

        response
                .then()
                .assertThat()
                .statusCode(400)
                .body("error", is("Field :project_id is not a valid or accessible project."));
    }

    @Test
    public void addProjectTest() {
        Project expectedProject = new Project();
        expectedProject.setName("ADD_Project");
        expectedProject.setAnnouncement("Test");
        expectedProject.setShowAnnouncement(true);
       // expectedProject.setSuiteMode(1);

        actualProject = projectService.addProject(expectedProject);

        Assert.assertEquals(actualProject, expectedProject);
    }


    @Test
    public void deleteProject() {
        Response deleteProject = projectService.deleteProject(27);
        deleteProject
                .then()
                .assertThat()
                .statusCode(200)
                .log().status();
    }

    @Test
    public void updateProject() {
        Project updateProject = new Project();

        updateProject.setName("update");
        updateProject.setAnnouncement("update announcement");
        updateProject.setShowAnnouncement(true);
        updateProject.setSuiteMode(3);

        actualProject = projectService.updateProject(updateProject, 31);

        Assert.assertEquals(actualProject, updateProject);
    }


    @Test
    public void dedssdeProject() {
        System.out.println("gfhgfh");
    }


}
