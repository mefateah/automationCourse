package com.epam.page_objects.controls;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

/**
 * Created by Aleksei_Voronin on 10/20/2016.
 */
public class ResultSection {
    private WebDriver driver;

    private Element summary;
    private Element name;
    private Element lastName;
    private Element description;

    public ResultSection(WebDriver driver) {
        this.driver = driver;

        summary = new Element(driver, By.className("summ-res"));
        name = new Element(driver, By.className("name-res"));
        lastName = new Element(driver, By.className("lname-res"));
        description = new Element(driver, By.className("descr-res"));
    }

    public String getSummary() {
        // TODO: check empty string
        String res = summary.getElement().getText().replace("Summary: ", "").trim();
        return res;
    }

    public String getName() {
        // TODO: check empty string
        String res = name.getElement().getText().replace("Name: ", "").trim();
        return res;
    }

    public String getLastName() {
        // TODO: check empty string
        String res = lastName.getElement().getText().replace("Last Name: ", "").trim();
        return res;
    }

    public String getDescription() {
        // TODO: check empty string
        String res = description.getElement().getText().replace("Description: ", "").trim();
        return res;
    }
}
