package elements;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import java.util.ArrayList;
import java.util.List;

public class DropDown {
    private UIElement uiElement;
    private UIElement actionElement;
    private UIElement optionsElement;
    private List<UIElement> optionList = new ArrayList<>();

    public DropDown(WebDriver driver, By by) {
        this.uiElement = new UIElement(driver, by);
        this.actionElement = uiElement.findUIElement(By.className("chzn-single"));
        this.optionsElement = uiElement.findUIElement(By.cssSelector("[data-testid='compareVersionDropDwonButton']"));

    }

    private void openDropDown() {
        actionElement.click();
        for (WebElement webElement : uiElement.findUIElements(By.tagName("li"))) {
            optionList.add((UIElement) webElement);
        }
    }

    public void selectByIndex(int index) {
        openDropDown();
        optionList.get(index).click();
    }
}