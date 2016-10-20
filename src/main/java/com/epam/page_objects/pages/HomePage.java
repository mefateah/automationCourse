package com.epam.page_objects.pages;

import com.epam.page_objects.controls.Button;
import com.epam.page_objects.controls.TextField;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

/**
 * Created by Aleksei_Voronin on 10/20/2016.
 */
public class HomePage {
    private String pageUrl = "https://jdi-framework.github.io/tests/page1.htm";
    private WebDriver driver;

    private Button loginIcon;
    private TextField userField;
    private TextField passwordField;
    private Button loginButton;

    public String getPageUrl() {
        return pageUrl;
    }

    public WebDriver getDriver() {
        return driver;
    }

    public Button getLoginIcon() {
        return loginIcon;
    }

    public TextField getUserField() {
        return userField;
    }

    public TextField getPasswordField() {
        return passwordField;
    }

    public Button getLoginButton() {
        return loginButton;
    }

    public HomePage(WebDriver driver) {
        this.driver = driver;

        loginIcon = new Button(driver, By.cssSelector(".profile-photo"));
        userField = new TextField(driver, By.id("Login"));
        passwordField = new TextField(driver, By.id("Password"));
        loginButton = new Button(driver, By.cssSelector(".btn-login"));
    }

    public void open() {
        driver.navigate().to(pageUrl);
    }
}
