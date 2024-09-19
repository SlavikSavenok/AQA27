package services.Case;

import io.restassured.mapper.ObjectMapperType;
import io.restassured.response.Response;
import models.Case;
import org.apache.http.HttpStatus;
import utils.Endpoints;
import utils.EndpointsCase;

import static io.restassured.RestAssured.given;

public class CaseService implements ICaseService {

    @Override
    public Case getCase(int id) {
        return given()
                .pathParam("case_id",id)
                .log().all()
                .when()
                .get(EndpointsCase.GET_CASE)
                .then()
                .log().body()
                .statusCode(HttpStatus.SC_OK)
                .extract()
                .as(Case.class, ObjectMapperType.GSON);
    }

    @Override
    public Response getGeneralCase(int id) {
        return given()
                .pathParam("case_id", id)
                .log().all()
                .when()
                .get(EndpointsCase.GET_CASE)
                .then()
                .log().body()
                .extract().response();
    }

    @Override
    public Case updateCase(Case aCase, int id) {
        return given()
                .body(aCase)
                .log().body()
                .pathParam("case_id",id)
                .when()
                .post(EndpointsCase.UPDATE_CASE)
                .then()
                .statusCode(HttpStatus.SC_OK)
                .log().body()
                .extract().as(Case.class,ObjectMapperType.GSON);
    }

    @Override
    public void moveCasesToSection() {

    }

    @Override
    public Response deleteCase(int id) {
        return given()
                .pathParam("case_id", id)
                .when()
                .post(EndpointsCase.DELETE_CASE);
    }
}
