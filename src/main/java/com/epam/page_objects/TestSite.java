package com.epam.page_objects;

import com.epam.page_objects.pages.ContactPage;
import com.epam.page_objects.pages.HomePage;
import org.openqa.selenium.WebDriver;

/**
 * Created by Aleksei_Voronin on 10/20/2016.
 */
public class TestSite {
    private WebDriver driver;
    private ContactPage contactPage;
    private HomePage homePage;

    public TestSite(WebDriver driver) {
        this.driver = driver;
        this.contactPage = new ContactPage(driver);
        this.homePage = new HomePage(driver);
    }

    public ContactPage getContactPage() {
        return contactPage;
    }

    public HomePage getHomePage() {
        return homePage;
    }
}
