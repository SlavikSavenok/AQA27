package steps;

import baseEntities.BaseStep;
import io.qameta.allure.Step;
import org.openqa.selenium.WebDriver;
import pages.DashboardPage;
import pages.EditProjectPage;
import pages.LoginPage;

public class UserStep extends BaseStep {

    public UserStep(WebDriver driver) {
        super(driver);
    }

    public DashboardPage successfulLogin(String username, String password) {
        login(username, password);

        return dashboardPage;
    }

    private void login(String username, String password) {
        loginPage.setEmailValue(username);
        loginPage.setPasswordValue(password);
        loginPage.clickLogin();
    }

    public EditProjectPage openEditProjectPage() {
        openEditProject();

        return editProjectPage;
    }

    private void openEditProject() {
        dashboardPage.clickEdit();
    }

    public void clickCheckBox(){
        editProjectPage.clickCheckBox();
    }

    public void removeCheckBox(){
        editProjectPage.removeCheckBox();
    }
}