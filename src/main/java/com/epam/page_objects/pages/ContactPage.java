package com.epam.page_objects.pages;

import com.epam.page_objects.controls.*;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

/**
 * Created by Aleksei_Voronin on 10/20/2016.
 */
public class ContactPage {
    private String pageUrl = "https://jdi-framework.github.io/tests/page1.htm";
    private WebDriver driver;

    private TextField nameField;
    private TextField lastNameField;
    private TextField descriptionField;

    private Radiobutton one;
    private Radiobutton two;
    private Radiobutton three;
    private Radiobutton four;
    private Radiobutton five;
    private Radiobutton six;
    private Radiobutton seven;
    private Radiobutton eight;

    private Button submitButton;
    private Button calculateButton;

    private ResultSection resultSection;

    public ContactPage(WebDriver driver) {
        this.driver = driver;
        nameField = new TextField(driver, By.id("Name"));
        lastNameField = new TextField(driver, By.id("LastName"));
        descriptionField = new TextField(driver, By.id("Description"));

        one = new Radiobutton(driver, By.xpath("//*[@id='p1']/.."));
        two = new Radiobutton(driver, By.xpath("//*[@id='p5']/.."));
        three = new Radiobutton(driver, By.xpath("//*[@id='p2']/.."));
        four = new Radiobutton(driver, By.xpath("//*[@id='p6']/.."));
        five = new Radiobutton(driver, By.xpath("//*[@id='p3']/.."));
        six = new Radiobutton(driver, By.xpath("//*[@id='p7']/.."));
        seven = new Radiobutton(driver, By.xpath("//*[@id='p4']/.."));
        eight = new Radiobutton(driver, By.xpath("//*[@id='p8']/.."));

        submitButton = new Button(driver, By.xpath("//*[text()='Submit']"));
        calculateButton = new Button(driver, By.xpath("//*[text()='Calculate']"));

        resultSection = new ResultSection(driver);
    }

    public TextField getNameField() {
        return nameField;
    }

    public TextField getLastNameField() {
        return lastNameField;
    }

    public TextField getDescriptionField() {
        return descriptionField;
    }

    public Radiobutton getOne() {
        return one;
    }

    public Radiobutton getTwo() {
        return two;
    }

    public Radiobutton getThree() {
        return three;
    }

    public Radiobutton getFour() {
        return four;
    }

    public Radiobutton getFive() {
        return five;
    }

    public Radiobutton getSix() {
        return six;
    }

    public Radiobutton getSeven() {
        return seven;
    }

    public Radiobutton getEight() {
        return eight;
    }

    public Button getSubmitButton() {
        return submitButton;
    }

    public Button getCalculateButton() {
        return calculateButton;
    }

    public void open() {
        driver.navigate().to(pageUrl);
    }

    public ResultSection getResultSection() {
        return resultSection;
    }
}
