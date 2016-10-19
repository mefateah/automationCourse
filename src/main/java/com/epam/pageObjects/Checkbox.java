package com.epam.pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

/**
 * Created by student on 17/10/16.
 */
public class Checkbox extends Element {

    public Checkbox(WebDriver driver, By locator) {
        super(driver, locator);
    }

    public boolean isChecked() {
        return getElement().isSelected();
    }

    public void check() {
        if (!isChecked()) getElement().click();
    }

    public void uncheck() {
        if (isChecked()) getElement().click();
    }

}
