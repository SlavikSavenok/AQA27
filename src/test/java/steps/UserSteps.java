package steps;

import baseEntities.BaseStep;
import org.openqa.selenium.WebDriver;
import pages.MenuPage;

public class UserSteps extends BaseStep {


    public UserSteps(WebDriver driver) {
        super(driver);
    }

    public MenuPage successLogin(String username, String password) {
        login(username,password);
        return menuPage;
    }

    private void login(String username, String password) {
        loginPage.setUsernameValue(username);
        loginPage.setPasswordValue(password);
        loginPage.clickLogin();

    }
}
