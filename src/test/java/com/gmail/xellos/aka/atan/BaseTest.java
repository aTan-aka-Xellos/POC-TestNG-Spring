package com.gmail.xellos.aka.atan;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.testng.AbstractTestNGSpringContextTests;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

@ContextConfiguration(classes = AppConfig.class)
public class BaseTest extends AbstractTestNGSpringContextTests {

    @Autowired
    ComponentFoo foo;

    @BeforeSuite
    public void setUpSuite() {
        System.out.println("Suite:  " + foo);
    }

    @BeforeTest
    public void setUpTest() {
        System.out.println("Test:   " + foo);
    }

    @BeforeMethod
    public void setUpMethod() {
        System.out.println("Method: " + foo);
    }

    @Test
    void testSpring() {

        Assert.assertNotNull(foo);
        Assert.assertTrue(foo.returnTrue());
    }

}
