package com.epam.page_objects.controls;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

/**
 * Created by Aleksei_Voronin on 10/20/2016.
 */
public class Button extends Element {

    public Button(WebDriver driver, By locator) {
        super(driver, locator);
    }

    public void click() {
        getElement().click();
    }
}
