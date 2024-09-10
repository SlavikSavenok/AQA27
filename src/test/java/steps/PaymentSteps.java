package steps;

import baseEntities.BaseStep;
import io.qameta.allure.Step;
import org.openqa.selenium.WebDriver;
import pages.OverviewPage;

public class PaymentSteps extends BaseStep {

    public PaymentSteps(WebDriver driver) {
        super(driver);
    }

    @Step(value = "Успешный переход в корзину")
    public void successGoToCart() {
        menuPage.clickCart();
    }
    @Step(value = "Успешный переход на страницу с инормацией о таваре в корзине")
    public void successGoToCheckoutInformation() {
        cartPage.clickCheckout();
    }

    @Step(value = "Успешное заполнение полей покупателя")
    public OverviewPage successGoToOverview(String firstname, String lastname, String zip) {
        continues(firstname, lastname, zip);
        return overviewPage;
    }

    private void continues(String firstname, String lastname, String zip) {
        checkoutInformationPage.setFirstNameValue(firstname);
        checkoutInformationPage.setLastNameValue(lastname);
        checkoutInformationPage.setZipValue(zip);
        checkoutInformationPage.clickContinueButton();
    }

    @Step(value = "Успешное завершение покупки")
    public void successFinishPayment() {
        overviewPage.clickFinishButton();
    }

    @Step(value = "Успешный переход из корзины на главную страницу")
    public void successBackHome() {
        checkoutComplete.clickBackHome();
    }
}
