package baseEntities;

import pages.*;

public class BaseStep {
    protected LoginPage loginPage;
    protected MenuPage menuPage;
    protected CartPage cartPage;
    protected CheckoutInformationPage checkoutInformationPage;
    protected OverviewPage overviewPage;
    protected CheckoutCompletePage checkoutCompletePage;

    public BaseStep() {
        loginPage = new LoginPage();
        menuPage = new MenuPage();
        cartPage = new CartPage();
        overviewPage = new OverviewPage();
        checkoutCompletePage = new CheckoutCompletePage();
        checkoutInformationPage = new CheckoutInformationPage();
    }
}
