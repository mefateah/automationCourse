package com.epam.lessons;

import org.testng.annotations.*;

/**
 * Created by Aleksei_Voronin on 10/13/2016.
 */

@Test
public class Lesson3 {

    @BeforeClass
    public void beforeClass() {
        System.out.println("Before class");
    }

    @BeforeSuite
    public void beforeSuite() {
        System.out.println("Before suite");
    }

    @AfterSuite
    public void afterSuite() {
        System.out.println("After suite");
    }

    @AfterClass
    public void afterClass() {
        System.out.println("After class");
    }

    @BeforeGroups
    public void beforeGroups() {
        System.out.println("Before groups");
    }

    @Test(groups = "No", dataProviderClass = Datas.class, dataProvider = "testA")
    public void testA(boolean b, String s, int i, Object o) {
        System.out.println("test A bool = " + b +
                " string = " + s +
                " int = " + i +
                " object = " + o.hashCode());
    }

    @Test(groups = "No", timeOut = 3000)
    public void testB() throws InterruptedException {
        Thread.sleep(2000);
        System.out.println("test B");
    }

    @Test()
    public void testC_1() {
        System.out.println("test C1");
    }

    @Test(groups = "group C", dependsOnMethods = "testC_1")
    public void testC_2() {
        System.out.println("test C2");
    }
}
