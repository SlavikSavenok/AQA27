package test;

import baseEntities.BaseTest;
import configuration.ReadProperties;
import io.qameta.allure.Description;
import io.qameta.allure.Severity;
import io.qameta.allure.SeverityLevel;
import org.testng.Assert;
import org.testng.annotations.Test;


public class AddProduct extends BaseTest {

    @Test(description = "Тест с корзиной")
    @Description("Тест проверяет добавление товара в корзину")
    @Severity(SeverityLevel.BLOCKER)
    public void addToCart() {
      Assert.assertTrue(userSteps.successLogin(ReadProperties.username(), ReadProperties.password()).isPageOpen());
        addRemoveSteps.successAddToCart();
    }
}
