package baseEntities;

import configuration.ReadProperties;
import io.restassured.RestAssured;
import io.restassured.http.ContentType;
import org.apache.http.protocol.HTTP;
import org.testng.annotations.BeforeTest;
import services.Case.CaseService;
import services.Milestone.MilestonesService;
import services.Project.ProjectService;
import services.User.UserService;

import static io.restassured.RestAssured.given;

public class BaseApiTest {
    protected CaseService caseService;
    protected ProjectService projectService;
    protected UserService userService;
    protected MilestonesService milestonesService;


    @BeforeTest
    public void setupApiClient() {
        // Setup RestAssured
        RestAssured.baseURI = ReadProperties.getUri();

        // Update default request specification
        RestAssured.requestSpecification = given()
                .header(HTTP.CONTENT_TYPE, ContentType.JSON)
                .auth().preemptive().basic(ReadProperties.username(), ReadProperties.password());

        caseService = new CaseService();
        projectService = new ProjectService();
        userService = new UserService();
        milestonesService=new MilestonesService();
    }
}