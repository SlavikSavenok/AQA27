package baseEntities;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.interactions.Actions;

public abstract class BasePage {
    protected WebDriver pageDriver;
    protected Actions actions =new Actions(pageDriver);

    public BasePage(WebDriver driver) {
        this.pageDriver = driver;
    }

    protected abstract By getPageIdentifier();

    public boolean isPageOpen() {
        return pageDriver.findElement(getPageIdentifier()).isDisplayed();
    }
}