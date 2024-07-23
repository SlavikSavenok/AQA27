package steps;

import baseEntities.BaseStep;
import org.openqa.selenium.WebDriver;


public class AddRemoveSteps extends BaseStep {
    public AddRemoveSteps(WebDriver driver) {
        super(driver);
    }

    public void successAddToCart() {
        addToCart();

    }
    public void successRemoveFromCart(){
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
