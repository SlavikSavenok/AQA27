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
    private List<String> textList = new ArrayList<>();

    public DropDown(WebDriver driver, By by) {
        this.uiElement = new UIElement(driver, by);
        this.actionElement = uiElement.findUIElement(By.className("chzn-single"));
        this.optionsElement = uiElement.findUIElement(By.cssSelector("[data-testid='compareVersionDropDwonButton']"));

    }

    private void openDropDown() {
        actionElement.click();
        for (WebElement webElement : uiElement.findUIElements(By.tagName("li"))) {
            optionList.add((UIElement) webElement);
            for (WebElement webElement1 : optionsElement.findUIElements(By.tagName("li"))) ;
            textList.add(webElement.getText());
        }
    }

    public void selectByIndex(int index) {
        openDropDown();
        optionList.get(index).click();
    }

    public void selectByText(String text) {
        openDropDown();
        optionList.get(textList.indexOf(text)).click();
    }
}