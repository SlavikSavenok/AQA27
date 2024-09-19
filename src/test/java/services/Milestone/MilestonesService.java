package services.Milestone;

import io.restassured.mapper.ObjectMapperType;
import io.restassured.response.Response;
import models.Milestones;
import org.apache.http.HttpStatus;
import utils.EndpointsMilestones;

import static io.restassured.RestAssured.given;
import static org.hamcrest.Matchers.is;

public class MilestonesService implements IMilestonesService {
    @Override
    public void getMilestones(int id) {
        given()
                .pathParam("milestone_id", id)
                .log().all()
                .when()
                .get(EndpointsMilestones.GET_MILESTONE)
                .then()
                .log().body()
                .statusCode(HttpStatus.SC_OK)
                .body("id", is(88))
                .body("name", is("Milestone"))
                .body("description", is("Description"))
                .body("is_started", is(false));
    }

    @Override
    public void addMilestone(int id) {
    }

    @Override
    public Milestones updateMilestones(Milestones milestones, int id) {

        return given()
                .body(milestones)
                .log().body()
                .pathParam("milestone_id", id)
                .when()
                .post(EndpointsMilestones.UPDATE_MILESTONE)
                .then()
                .statusCode(HttpStatus.SC_OK)
                .log().body()
                .extract().as(Milestones.class, ObjectMapperType.GSON);

    }

    @Override
    public Response deleteMilestone(int id) {
        return given()
                .pathParam("milestone_id", id)
                .when()
                .post(EndpointsMilestones.DELETE_MILESTONE);
    }
}
