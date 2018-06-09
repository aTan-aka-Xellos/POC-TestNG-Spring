package com.gmail.xellos.aka.atan;

import org.testng.Assert;
import org.testng.annotations.*;

public class BaseTest extends TestNGSpringTest {

    @BeforeSuite
    public void setUpSuiteChild() {
        System.out.println("Child Suite");
        Assert.assertNotNull(foo);
        Assert.assertNotNull(bar);
    }

    @BeforeTest
    public void setUpTestChild() {
        System.out.println("Child Test");
        Assert.assertNotNull(foo);
        Assert.assertNotNull(bar);
    }

    @BeforeMethod
    public void setUpMethodChild() {
        System.out.println("Child Method");
        Assert.assertNotNull(foo);
        Assert.assertNotNull(bar);
    }

    @Test
    void testComponent() {
        Assert.assertNotNull(foo);
        Assert.assertNotNull(foo.getName());
    }

    @Test
    void testCBean() {
        Assert.assertNotNull(bar);
        Assert.assertNotNull(bar.getName());
    }

}
