package pages;

import baseEntities.BasePage;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class DynamicControlPage extends BasePage {
    private final By REMOVE_BUTTON_LOCATOR = By.xpath("//*[@onclick='swapCheckbox()']");
    private final By ENABLE_BUTTON_LOCATOR = By.cssSelector("[onclick='swapInput()']");

    public DynamicControlPage(WebDriver driver) {
        super(driver);
    }

    @Override
    protected By getPageIdentifier() {
        return REMOVE_BUTTON_LOCATOR;
    }

    public WebElement getRemoveButton() {
        return pageDriver.findElement(REMOVE_BUTTON_LOCATOR);
    }

    public WebElement getEnableButton() {
        return pageDriver.findElement(ENABLE_BUTTON_LOCATOR);
    }

    public void clickRemoveButton() {
        getRemoveButton().click();
    }

    public void clickEnableButton() {
        getEnableButton().click();
    }

}
