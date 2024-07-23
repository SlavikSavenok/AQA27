package test;

import baseEntities.BaseTest;
import configuration.ReadProperties;
import org.testng.annotations.Test;


public class AddProduct extends BaseTest {


    @Test
    public void addToCart() {
        userSteps.successLogin(ReadProperties.username(), ReadProperties.password());
        addRemoveSteps.successAddToCart();
    }
}
