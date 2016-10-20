package com.epam.sample_project;

import com.epam.page_objects.controls.ResultSection;
import com.epam.page_objects.pages.ContactPage;
import com.epam.sample_project.data_providers.ContactFormData;
import org.testng.Assert;
import org.testng.annotations.Test;

/**
 * Created by Aleksei_Voronin on 10/19/2016.
 */
public class ContactFormTests extends InitSuite {

    @Test(dataProviderClass = ContactFormData.class, dataProvider = "textFields")
    public void fieldsTest(String name, String lastName, String description){
        ContactPage contactPage = getSite().getContactPage();
        contactPage.getNameField().setText(name);
        contactPage.getLastNameField().setText(lastName);
        contactPage.getDescriptionField().setText(description);
        contactPage.getSubmitButton().click();

        ResultSection result = contactPage.getResultSection();

        Assert.assertEquals(result.getName(), name);
        Assert.assertEquals(result.getLastName(), lastName);
        Assert.assertEquals(result.getDescription(), description);
    }

    @Test
    public void summaryTest() {
        ContactPage contactPage = getSite().getContactPage();
        contactPage.getThree().select();
        contactPage.getSix().select();
        contactPage.getCalculateButton().click();

        ResultSection result = contactPage.getResultSection();

        Assert.assertEquals(result.getSummary(), "9");
    }
}
