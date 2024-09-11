package services;

import io.restassured.response.Response;

public interface ICaseService {
    Response getCase(int id);
    void updateCase();
    void moveCasesToSection();
    void deleteCase();
}
