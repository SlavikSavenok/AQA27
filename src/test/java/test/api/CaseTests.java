package test.api;

import baseEntities.BaseApiTest;
import io.restassured.response.Response;
import models.Case;
import org.testng.Assert;
import org.testng.annotations.Test;

import static org.hamcrest.Matchers.is;

public class CaseTests extends BaseApiTest {
    private Case actualCase;

    @Test
    public void getCaseTest() {
        Case aCase = caseService.getCase(52);
        Assert.assertEquals(aCase.getTitle(), "case section");
    }

    @Test
    public void getGeneralCaseTest() {
        Response response = caseService.getGeneralCase(1000);
        response
                .then()
                .assertThat()
                .statusCode(400)
                .body("error", is("Field :case_id is not a valid test case."));
    }

    @Test
    public void updateCaseTest() {
        Case updateCase = new Case();
        updateCase.setTitle("update case");
        updateCase.setSectionId(1);
        updateCase.setTemplateId(2);
        updateCase.setTypeId(1);
        updateCase.setPriorityId(2);
        actualCase = caseService.updateCase(updateCase, 51);
        Assert.assertEquals(actualCase, updateCase);
    }

    @Test
    public void deleteTestCase() {
        Response deleteCase = caseService.deleteCase(53);
        deleteCase
                .then()
                .assertThat()
                .statusCode(200)
                .log().status();
    }
}
