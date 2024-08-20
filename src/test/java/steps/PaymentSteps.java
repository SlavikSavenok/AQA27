package steps;

import baseEntities.BaseStep;
import pages.OverviewPage;

public class PaymentSteps extends BaseStep {

    public PaymentSteps() {
        super();
    }

    public void successGoToCart(){
        menuPage.clickCart();
    }

    public void successGoToCheckoutInformation(){
        cartPage.clickCheckout();
    }

    public OverviewPage successGoToOverview(String firstname, String lastname, String zip) {
        continues(firstname,lastname,zip);
        return overviewPage;
    }

    private void continues(String firstname, String lastname,String zip) {
        checkoutInformationPage.setFirstNameValue(firstname);
        checkoutInformationPage.setLastNameValue(lastname);
        checkoutInformationPage.setZipValue(zip);
        checkoutInformationPage.clickContinueButton();
    }

    public void successFinishPayment(){
        overviewPage.clickFinishButton();
    }

    public void successBackHome(){
        checkoutCompletePage.clickBackHome();
    }
}
