package steps;

import baseEntities.BaseStep;
import io.qameta.allure.Step;
import org.openqa.selenium.WebDriver;


public class AddRemoveSteps extends BaseStep {
    public AddRemoveSteps(WebDriver driver) {
        super(driver);
    }

    @Step(value = "Успешное добовление товарв в корзину")
    public void successAddToCart() {
        addToCart();
    }

    @Step(value = "Успешое удоление товара из корзины")
    public void successRemoveFromCart() {
        removeFromCart();
    }

    private void addToCart() {
        menuPage.setAddSauceLabsOnesie();
        menuPage.setAddSauceLabsBackpack();
    }

    private void removeFromCart() {
        menuPage.setRemoveSauceLabsBackpack();
        menuPage.setRemoveSauceLabsOnesie();
    }
}
