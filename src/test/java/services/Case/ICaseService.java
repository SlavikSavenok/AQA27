package services.Case;

import io.restassured.response.Response;
import models.Case;

public interface ICaseService {
    Case getCase(int id);
    Response getGeneralCase(int id);
    Case updateCase(Case aCase, int id);
    void moveCasesToSection();
    Response deleteCase(int id);
}
