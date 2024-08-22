package test;

import baseEntities.BaseTest;
import configuration.ReadProperties;
import org.testng.Assert;
import org.testng.annotations.Test;


public class AddProduct extends BaseTest {

    @Test
    public void addToCart() {
      Assert.assertTrue(userSteps.successLogin(ReadProperties.username(), ReadProperties.password()).isPageOpened());
        addRemoveSteps.successAddToCart();
    }
}
