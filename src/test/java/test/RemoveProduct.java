package test;

import baseEntities.BaseTest;
import configuration.ReadProperties;
import org.testng.annotations.Test;

public class RemoveProduct extends BaseTest {
    @Test
    public void removeFromCart(){
        userSteps.successLogin(ReadProperties.username(),ReadProperties.password());
        addRemoveSteps.successAddToCart();
        addRemoveSteps.successRemoveFromCart();

    }
}
