package test;

import baseEntities.BaseTest;
import configuration.ReadProperties;
import org.testng.Assert;
import org.testng.annotations.Test;

public class RemoveProduct extends BaseTest {
    @Test
    public void removeFromCart(){
       Assert.assertTrue(userSteps.successLogin(ReadProperties.username(),ReadProperties.password()).isPageOpen());
        addRemoveSteps.successAddToCart();
        addRemoveSteps.successRemoveFromCart();

    }
}
