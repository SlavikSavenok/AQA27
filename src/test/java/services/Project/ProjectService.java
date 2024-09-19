package services.Project;

import io.restassured.mapper.ObjectMapperType;
import io.restassured.response.Response;
import models.Project;
import org.apache.http.HttpStatus;
import utils.Endpoints;

import static io.restassured.RestAssured.given;

public class ProjectService implements IProjectService {

    @Override
    public Response getGeneralProject(int id) {
        return given()
                .pathParam("project_id", id)
                .log().all()
                .when()
                .get(Endpoints.GET_PROJECT)
                .then()
                .log().body()
                .extract().response();
    }

    @Override
    public Project getProject(int id) {
        return given()
                .pathParam("project_id", id)
                .log().all()
                .when()
                .get(Endpoints.GET_PROJECT)
                .then()
                .log().body()
                .statusCode(HttpStatus.SC_OK)
                .extract()
                .as(Project.class, ObjectMapperType.GSON);
    }

    @Override
    public void getProjects() {

    }

    @Override
    public Project addProject(Project project) {
        return given()
                .body(project)
                .log().body()
                .when()
                .post(Endpoints.ADD_PROJECTS)
                .then()
                .statusCode(HttpStatus.SC_OK)
                .log().body()
                .extract().as(Project.class, ObjectMapperType.GSON);
    }

    @Override
    public Project updateProject(Project project, int id) {
        return given()
                .body(project)
                .log().body()
                .pathParam("project_id", id)
                .when()
                .post(Endpoints.UPDATE_PROJECTS)
                .then()
                .statusCode(HttpStatus.SC_OK)
                .log().body()
                .extract().as(Project.class, ObjectMapperType.GSON);

    }

    @Override
    public Response deleteProject(int id) {
        return given()
                .pathParam("project_id", id)
                .when()
                .post(Endpoints.DELETE_PROJECTS);
    }
}