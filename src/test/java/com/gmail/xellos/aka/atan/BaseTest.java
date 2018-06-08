package com.gmail.xellos.aka.atan;

import org.testng.Assert;
import org.testng.annotations.*;

public class BaseTest extends TestNGSpringTest {

    @BeforeSuite
    public void setUpSuiteChild() {
        System.out.println("Suite Child:  " + foo);
    }

    @BeforeTest
    public void setUpTestChild() {
        System.out.println("Test Child:   " + foo);
    }

    @BeforeMethod
    public void setUpMethodChild() {
        System.out.println("Method Child: " + foo);
    }

    @Test
    void testSpring() {

        Assert.assertNotNull(foo);
        Assert.assertTrue(foo.returnTrue());
    }

}
