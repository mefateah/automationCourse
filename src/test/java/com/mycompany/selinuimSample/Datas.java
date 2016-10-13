package com.mycompany.selinuimSample;

import org.testng.annotations.DataProvider;

/**
 * Created by Aleksei_Voronin on 10/13/2016.
 */
public class Datas {

    @DataProvider
    public static Object[][] loginData() {
        return new Object[][]{
                {false, "", ""},
                {false, "", ""},
                {false, "", ""},
                {false, "", ""},
                {false, "", ""}};
    }

    @DataProvider
    public Object[][] testA(){
        return new Object[][]{
                {false, "abc", 4, new Object()},
                {true, "string", -99, new Object()}
        };
    }
}
