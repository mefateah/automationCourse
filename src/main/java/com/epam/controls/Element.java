package com.epam.controls;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

/**
 * Created by student on 17/10/16.
 */
public class Element {

    protected By _locator;
    protected WebDriver _driver;

    public Element(WebDriver driver, By locator) {
        _driver = driver;
        _locator = locator;
    }

    protected WebElement getElement() {
        if (_element == null) {
            return _driver.findElement(_locator);
        }
        return _element;
    }
}
