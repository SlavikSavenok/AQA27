package baseEntities;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.interactions.Actions;

public abstract class BasePage {
    protected WebDriver pageDriver;
    protected Actions actions;

    public BasePage(WebDriver driver) {
        this.pageDriver = driver;
        actions = new Actions(pageDriver);
    }
}