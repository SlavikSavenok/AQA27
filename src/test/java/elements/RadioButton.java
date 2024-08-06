package elements;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import java.util.ArrayList;
import java.util.List;

public class RadioButton {
    private List<UIElement> uiElementsList;
    private List<String> valueList;

    public RadioButton(WebDriver driver, By by) {
        uiElementsList = new ArrayList<>();

        for (WebElement element : driver.findElements(by)) {
            UIElement uiElement = new UIElement(driver, element);
            uiElementsList.add(uiElement);
            valueList.add(uiElement.getAttribute("value"));
        }
    }

    public void selectByValue(String value) {
        int index = valueList.indexOf(value);
        if (index >= 0) {
            uiElementsList.get(index).click();
        } else {
            throw new IllegalArgumentException("Элемента с таким value не существует");
        }
    }
}