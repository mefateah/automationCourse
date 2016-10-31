package com.epam.sample_project;

import com.epam.page_objects.TestSite;
import com.epam.page_objects.pages.HomePage;
import io.github.bonigarcia.wdm.MarionetteDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.MarionetteDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;

/**
 * Created by Aleksei_Voronin on 10/19/2016.
 */
public class TestBase {
    private TestSite site;
    private WebDriver driver;

    protected TestSite getSite() {
        return site == null ? new TestSite(driver) : site;
    }

    @BeforeClass
    public void beforeClass(){
        System.out.println("before class");
//        ChromeDriverManager.getInstance().setup();
        MarionetteDriverManager.getInstance().setup();
        driver = new MarionetteDriver();
        driver.manage().window().maximize();
        HomePage homePage = getSite().getHomePage();
        homePage.open();
        login(homePage);
    }

    private void login(HomePage page) {
        page.getLoginIcon().click();
        page.getUserField().setText("epam");
        page.getPasswordField().setText("1234");
        page.getLoginButton().click();
    }

    @AfterClass
    public void afterClass(){
        System.out.println("after class - Close web driver");
        if (driver != null){
            driver.quit();
        }
    }
}
