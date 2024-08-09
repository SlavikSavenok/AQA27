package elements;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import java.util.ArrayList;
import java.util.List;

public class DropDown {

    private final UIElement uiElement;
    private UIElement actionElement;
    private List<UIElement> uiElementsList;
    ;

    public DropDown(WebDriver driver, By by) {
        this.uiElement = new UIElement(driver, by);
        this.actionElement = uiElement.findUIElement(By.cssSelector("[class='chzn-single']"));
        actionElement.click();
        uiElementsList = new ArrayList<>();
        for (WebElement element : driver.findElements(by)) {
            UIElement uiElement = new UIElement(driver, element);
            uiElementsList.add(uiElement);
        }
    }

    public void selectByIndex(int index) {
        actionElement.click();
        if (index >= 0 && index < uiElementsList.size()) {
            uiElementsList.get(index).click();
        } else {
            throw new IndexOutOfBoundsException("Индекс не соответствует размеру коллекции");
        }
    }


    public void selectByValue(String value) {
        actionElement.click();
        for (UIElement uiElement : uiElementsList) {
            if (uiElement.getAttribute("value").equals(value)) {
                uiElement.click();
                return;
            }
        }
        throw new IllegalArgumentException("Значение с таким value не сушествует");
    }
}
