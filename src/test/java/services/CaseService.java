package services;

import io.restassured.response.Response;
import org.apache.http.HttpStatus;
import utils.EndpointsCase;

import static io.restassured.RestAssured.given;

public class CaseService implements ICaseService {

    @Override
    public Response getCase(int id) {
        return given()
                .pathParam("case_id", id)
                .log().all()
                .when()
                .get(EndpointsCase.GET_CASE)
                .then()
                .log().body()
                .statusCode(HttpStatus.SC_OK)
                .extract().response();
    }

    @Override
    public void updateCase() {

    }

    @Override
    public void moveCasesToSection() {

    }

    @Override
    public void deleteCase() {

    }
}
