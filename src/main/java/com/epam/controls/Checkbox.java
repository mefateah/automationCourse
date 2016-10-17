package com.epam.controls;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

/**
 * Created by student on 17/10/16.
 */
public class Checkbox extends Element {
    private WebElement _element;

    public Checkbox(WebDriver driver, By locator) {
        super(driver, locator);
    }

    public boolean isChecked() {
        if (_element == null) {
            _element = _driver.findElement(_locator);
        }
        return getElement().isSelected();
    }

    public void check() {
        if (!isChecked()) getElement().click();
    }

    public void uncheck() {
        if (isChecked()) getElement().click();
    }

}
