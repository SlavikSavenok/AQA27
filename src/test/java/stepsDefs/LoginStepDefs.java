package stepsDefs;

import baseEntities.BaseTest;
import configuration.ReadProperties;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.testng.Assert;
import pages.DashboardPage;
import pages.LoginPage;

public class LoginStepDefs extends BaseTest {
    LoginPage loginPage;
    private BaseTest baseTest;

    public LoginStepDefs(BaseTest baseTest) {
        this.baseTest = baseTest;
    }

    @Given("open login page")
    public void openLoginPage() {
        baseTest.driver.get(ReadProperties.getUrl());
        loginPage = new LoginPage(baseTest.driver);
    }

    @When("set username {string}")
    public void setUsername(String username) {
        loginPage.setEmailValue(username);
    }

    @When("set password {string}")
    public void setPassword(String password) {
        loginPage.setPasswordValue(password);
    }

    @When("user clicks login button")
    public void clickLoginButton() {
        loginPage.clickLogin();
    }

    @When("login with username {} and password {}")
    public void login(String username, String password) {
        setUsername(username);
        setPassword(password);
        clickLoginButton();
    }

    @Then("dashboard page is displayed")
    public void isDashboardPageDisplayed() {
        Assert.assertTrue(new DashboardPage(driver).isPageOpened());
    }
}
