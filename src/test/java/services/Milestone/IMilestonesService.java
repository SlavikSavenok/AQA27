package services.Milestone;

import io.restassured.response.Response;
import models.Milestones;


public interface IMilestonesService {

    void getMilestones(int id);
    void addMilestone( int id);
    Milestones updateMilestones(Milestones milestones,int id);
    Response deleteMilestone(int id);

}
