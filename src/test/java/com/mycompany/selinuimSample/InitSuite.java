package com.mycompany.selinuimSample;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;

/**
 * Created by Aleksei_Voronin on 10/19/2016.
 */
public class InitSuite extends TestBase {


    @BeforeMethod
    public void BeforeMethod(){
        System.out.println("Before test");
    }

    @AfterMethod
    public void AfterMethod(){
        System.out.println("After test");
    }
}
