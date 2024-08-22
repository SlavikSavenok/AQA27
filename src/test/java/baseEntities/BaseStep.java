package baseEntities;

import org.openqa.selenium.WebDriver;
import pages.*;

public class BaseStep {
    protected LoginPage loginPage;
    protected MenuPage menuPage;
    protected CartPage cartPage;
    protected CheckoutInformationPage checkoutInformationPage;
    protected OverviewPage overviewPage;
    protected CheckoutComplete checkoutComplete;

    public BaseStep() {
        loginPage = new LoginPage();
        menuPage = new MenuPage();
        cartPage = new CartPage();
        overviewPage = new OverviewPage();
        checkoutComplete = new CheckoutComplete();
        checkoutInformationPage = new CheckoutInformationPage();
    }
}
