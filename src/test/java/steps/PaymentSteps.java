package steps;

import baseEntities.BaseStep;
import org.openqa.selenium.WebDriver;

public class PaymentSteps extends BaseStep {
    public PaymentSteps(WebDriver driver) {
        super(driver);
    }
    public void successGoToCart(){
        menuPage.clickCart();
    }

}
