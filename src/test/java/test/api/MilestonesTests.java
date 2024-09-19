package test.api;

import baseEntities.BaseApiTest;
import io.restassured.response.Response;
import models.Milestones;
import org.testng.annotations.Test;


public class MilestonesTests extends BaseApiTest {
    private Milestones actualMilestones;


    @Test
    public void getMilestoneTest() {
        milestonesService.getMilestones(88);
    }


    @Test
    public void deleteMilestoneTest() {
        Response deleteMilestone = milestonesService.deleteMilestone(90);
        deleteMilestone
                .then()
                .assertThat()
                .statusCode(200)
                .log().status();
    }

    @Test
    public void updateMilestoneTest() {
        Milestones updateMilestones = new Milestones();
        updateMilestones.setName("UPDATE");
        actualMilestones = milestonesService.updateMilestones(updateMilestones, 91);


    }


}
