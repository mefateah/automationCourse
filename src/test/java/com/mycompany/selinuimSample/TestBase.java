package com.mycompany.selinuimSample;

import io.github.bonigarcia.wdm.ChromeDriverManager;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;

/**
 * Created by Aleksei_Voronin on 10/19/2016.
 */
public class TestBase {


    @BeforeClass
    public void BeforeClass(){
        System.out.println("before class");
        ChromeDriverManager.getInstance().setup();
    }

    @AfterClass
    public void AfterClass(){
        System.out.println("after class - Close web driver");
    }
}
