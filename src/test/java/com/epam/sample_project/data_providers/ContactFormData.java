package com.epam.sample_project.data_providers;

import org.testng.annotations.DataProvider;

/**
 * Created by Aleksei_Voronin on 10/20/2016.
 */
public class ContactFormData {

    @DataProvider
    public static Object[][] textFields() {
        return new Object[][]{
                {"Boris", "Petrov", "Cool site"},
                {"Sara", "Hamud", "Another description"}
        };
    }
}
