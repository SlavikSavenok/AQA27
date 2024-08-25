package baseEntities;

import org.openqa.selenium.WebDriver;
import pages.*;

public class BaseStep {
    protected WebDriver driver;
    protected LoginPage loginPage;
    protected MenuPage menuPage;
    protected CartPage cartPage;
    protected CheckoutInformationPage checkoutInformationPage;
    protected OverviewPage overviewPage;
    protected CheckoutComplete checkoutComplete;

    public BaseStep(WebDriver driver) {
        this.driver = driver;
        loginPage = new LoginPage(driver);
        menuPage = new MenuPage(driver);
        cartPage = new CartPage(driver);
        overviewPage = new OverviewPage(driver);
        checkoutComplete = new CheckoutComplete(driver);
        checkoutInformationPage = new CheckoutInformationPage(driver);
    }
}
