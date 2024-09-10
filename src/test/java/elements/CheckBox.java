package elements;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class CheckBox {
    private final UIElement uiElement;

    public CheckBox(WebDriver driver, By by) {
        this.uiElement = new UIElement(driver, by);
    }


    private void setFlag(boolean flag) {
        if (!uiElement.isSelected() && flag) {
            uiElement.click();
        }
    }

    public void setCheckBox() {
        setFlag(true);
    }

    public void removeCheckBox() {
        setFlag(false);
    }
}

