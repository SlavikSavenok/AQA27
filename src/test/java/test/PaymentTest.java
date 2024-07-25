package test;

import baseEntities.BaseTest;
import configuration.ReadProperties;
import org.testng.Assert;
import org.testng.annotations.Test;

public class PaymentTest extends BaseTest {

    @Test
    public void paymentTest() throws InterruptedException {
        userSteps.successLogin(ReadProperties.username(), ReadProperties.password());
        addRemoveSteps.successAddToCart();
        paymentSteps.successGoToCart();
        paymentSteps.successGoToCheckoutInformation();
        Assert.assertTrue(paymentSteps.successGoToOverview("Ivan", "Ivanov", "1111").isPageOpen());
        paymentSteps.successFinishPayment();
        paymentSteps.successBackHome();
    }
}
