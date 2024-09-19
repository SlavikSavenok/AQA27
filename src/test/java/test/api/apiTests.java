package test.api;

import baseEntities.BaseApiTest;
import io.restassured.response.Response;
import models.User;
import models.Users;
import org.apache.http.HttpStatus;
import org.testng.Assert;
import org.testng.annotations.Test;

import static io.restassured.RestAssured.given;
import static org.hamcrest.Matchers.is;

public class apiTests extends BaseApiTest {

    @Test
    public void getAllProjects() {
        String endpoint = "/index.php?/api/v2/get_projects";
        given()
                .when()
                .get(endpoint)
                .then()
                .log().body()
                .statusCode(HttpStatus.SC_OK)
                .body("limit", is(250))
                .body("size", is(3));
    }

    @Test
    public void getSingleValue() {
        int project_id = 14;
        String endpoint = "/index.php?/api/v2/get_project/" + project_id;
        String name = given()
                .when()
                .get(endpoint)
                .then()
                .log().body()
                .assertThat()
                .statusCode(HttpStatus.SC_OK)
                .extract().jsonPath().getString("name");

        System.out.println(name);
    }

    @Test
    public void getResponseValue() {
        int project_id = 14;
        String endpoint = "/index.php?/api/v2/get_project/" + project_id;
        Response response = given()
                .when()
                .get(endpoint)
                .then()
                .log().body()
                .assertThat()
                .statusCode(HttpStatus.SC_OK)
                .extract().response();

        Assert.assertEquals(response.getBody().jsonPath().getString("name"), "Savenok_AQA27");
    }

    @Test
    public void paramTest() {
        int project_id = 14;
        String endpoint = "/index.php?/api/v2/get_project/{project_id}";
        String name = given()
                .pathParams("project_id", project_id)
                .when()
                .get(endpoint)
                .then()
                .log().body()
                .assertThat()
                .statusCode(HttpStatus.SC_OK)
                .extract().jsonPath().getString("name");

        System.out.println(name);
    }

    @Test
    public void getAllUsersAsArray() {
        Response response = userService.getUsers();
        User[] users = response.getBody().jsonPath().getObject("users", User[].class);
        System.out.println(users[0]);
    }

    @Test
    public void getAllUsersAsObject() {
        Response response = userService.getUsers();

        Users users = response.getBody().as(Users.class);

        System.out.println(users);
        System.out.println(users.getUsers()[0]);
    }

}