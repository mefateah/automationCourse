package com.mycompany.selinuimSample;

import io.github.bonigarcia.wdm.MarionetteDriverManager;
import org.junit.*;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import static java.lang.System.setProperty;

public class InitTests {
    protected WebDriver driver;

    @BeforeClass
    public static void setupClass(){
        setProperty("webdriver.chrome.driver", "C:\\Selenium\\chromedriver.exe");
        MarionetteDriverManager.getInstance().setup();
    }

    @Before
    public void setupTest(){
//        driver = new MarionetteDriver();
        driver = new ChromeDriver();
        driver.navigate().to("https://jdi-framework.github.io/tests");
        driver.manage().window().maximize();
    }

    @Test
    public void LoginTest(){
        WebElement loginIcon = driver.findElement(By.cssSelector(".profile-photo"));
        WebElement userField = driver.findElement(By.id("Login"));
        WebElement passwordField = driver.findElement(By.id("Password"));
        WebElement loginButton = driver.findElement(By.cssSelector(".btn-login"));
        WebElement logoutButton = driver.findElement(By.cssSelector(".logout"));

        loginIcon.click();
        userField.sendKeys("epam");
        passwordField.sendKeys("1234");
        loginButton.click();

        String logoutButtonClass = logoutButton.getAttribute("class");
        Assert.assertTrue(!logoutButtonClass.contains("hidden"));
    }

    @After
    public void tearDown(){
        if (driver != null) {
            driver.close();
        }
    }
}
