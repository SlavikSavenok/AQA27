package steps;

import baseEntities.BaseStep;
import org.openqa.selenium.WebDriver;


public class AddRemoveSteps extends BaseStep {
    public AddRemoveSteps() {
        super();
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
