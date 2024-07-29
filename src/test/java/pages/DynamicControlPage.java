package pages;

import baseEntities.BasePage;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class DynamicControlPage extends BasePage {
    private final By REMOVE_BUTTON_LOCATOR=By.xpath("//*[@onclick='swapCheckbox()']");

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

    public void clickRemoveButton(){
        getRemoveButton().click();
    }
}
