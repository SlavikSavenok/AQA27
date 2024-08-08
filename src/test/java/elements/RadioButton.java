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
        for (WebElement element : driver.findElements(by)){

        }

    }
}