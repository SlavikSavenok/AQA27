package test;

import baseEntities.BaseTest;
import configuration.ReadProperties;
import org.testng.annotations.Test;

public class PaymentTest extends BaseTest {
    @Test
    public void paymentTest() throws InterruptedException {
        userSteps.successLogin(ReadProperties.username(), ReadProperties.password());
        addRemoveSteps.successAddToCart();
        paymentSteps.successGoToCart();
        paymentSteps.successGoToCheckoutInformation();
        paymentSteps.successGoToOverview("Ivan","Ivanov","1111");
        Thread.sleep(2000);


    }
}
