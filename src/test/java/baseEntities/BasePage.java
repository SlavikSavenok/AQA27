package baseEntities;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public abstract class BasePage {
    protected WebDriver pageDriver;

    public BasePage(WebDriver driver) {
        this.pageDriver = driver;
    }

    protected abstract By getPageIdentifier();

    public boolean isPageOpen() {
        return pageDriver.findElement(getPageIdentifier()).isDisplayed();
    }

}