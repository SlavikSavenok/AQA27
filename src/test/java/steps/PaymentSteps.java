package steps;

import baseEntities.BaseStep;
import org.openqa.selenium.WebDriver;
import pages.OverviewPage;

public class PaymentSteps extends BaseStep {
    public PaymentSteps(WebDriver driver) {
        super(driver);
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

}
