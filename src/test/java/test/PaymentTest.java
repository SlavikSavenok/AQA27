package test;

import baseEntities.BaseTest;
import configuration.ReadProperties;
import io.qameta.allure.Description;
import io.qameta.allure.Severity;
import io.qameta.allure.SeverityLevel;
import org.testng.Assert;
import org.testng.annotations.Test;

public class PaymentTest extends BaseTest {

    @Test(description = "Тест на оплату товара")
    @Description("Тест проверяет корректность оплаты товара из корзины")
    @Severity(SeverityLevel.CRITICAL)
    public void paymentTest() {
        userSteps.successLogin(ReadProperties.username(), ReadProperties.password());
        addRemoveSteps.successAddToCart();
        paymentSteps.successGoToCart();
        paymentSteps.successGoToCheckoutInformation();
        Assert.assertTrue(paymentSteps.successGoToOverview("Ivan", "Ivanov", "1111").isPageOpen());
        paymentSteps.successFinishPayment();
        paymentSteps.successBackHome();
    }
}
