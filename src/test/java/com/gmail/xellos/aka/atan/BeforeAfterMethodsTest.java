package com.gmail.xellos.aka.atan;

import static org.testng.Assert.assertTrue;

import org.testng.annotations.*;

public class BeforeAfterMethodsTest extends TestNGSpringTest {

    @BeforeSuite
    public void setUpSuiteChild() {
        System.out.println("Child BeforeSuite");
        checkBeans();
    }

    @BeforeTest
    public void setUpTestChild() {
        System.out.println("Child BeforeTest");
        checkBeans();
    }

    @BeforeMethod
    public void setUpMethodChild() {
        System.out.println("Child BeforeMethod");
        checkBeans();
    }



    @Test
    void emptyTest() {
        System.out.println("_Test method");
        checkBeans();
        assertTrue(true);
    }


    @AfterSuite
    void afterSuiteChild() {
        System.out.println("Child AfterSuite");
        checkBeans();
    }

    @AfterTest
    void afterTestChild() {
        System.out.println("Child AfterTest");
        checkBeans();
    }

    @AfterMethod
    void afterMethodChild() {
        System.out.println("Child AfterMethod");
        checkBeans();
    }

}
