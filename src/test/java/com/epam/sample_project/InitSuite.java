package com.epam.sample_project;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

/**
 * Created by Aleksei_Voronin on 10/19/2016.
 */
public class InitSuite extends TestBase {


    @BeforeMethod
    public void BeforeMethod(){
        System.out.println("Before test");
        getSite().getContactPage().open();
    }

    @AfterMethod
    public void AfterMethod(){
        System.out.println("After test");
    }
}
