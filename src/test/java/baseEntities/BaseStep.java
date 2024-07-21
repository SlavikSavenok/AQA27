package baseEntities;

import org.openqa.selenium.WebDriver;
import pages.LoginPage;
import pages.MenuPage;

public class BaseStep {
    protected WebDriver driver;
    protected LoginPage loginPage;
    protected MenuPage menuPage;

    public BaseStep(WebDriver driver) {
        this.driver = driver;
        loginPage = new LoginPage(driver);
        menuPage = new MenuPage(driver);
    }
}
