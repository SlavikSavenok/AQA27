package pages;



import baseEntities.BasePage;
import com.codeborne.selenide.SelenideElement;
import org.openqa.selenium.By;


import static com.codeborne.selenide.Selenide.$;

public class LoginPage extends BasePage {

    private final By USERNAME_INPUT_LOCATOR = By.id("user-name");
    private final By PASSWORD_INPUT_LOCATOR = By.id("password");
    private final By LOGIN_BUTTON_LOCATOR = By.id("login-button");

    @Override
    protected By getPageIdentifier() {
        return USERNAME_INPUT_LOCATOR;
    }

    @Override
    protected String getPagePath() {
        return "/";
    }

    public SelenideElement getUsernameInput() {
        return $(USERNAME_INPUT_LOCATOR);
    }

    public SelenideElement getPasswordInput() {
        return $(PASSWORD_INPUT_LOCATOR);
    }

    public SelenideElement getLoginButton() {
        return $(LOGIN_BUTTON_LOCATOR);
    }

    public void setUsernameValue(String value) {
        getUsernameInput().val(value);
    }

    public void setPasswordValue(String value) {
        getPasswordInput().val(value);
    }

    public void clickLogin() {
        getLoginButton().click();
    }
}
