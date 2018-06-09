package com.gmail.xellos.aka.atan;

import org.testng.Assert;
import org.testng.annotations.*;

public class BaseTest extends TestNGSpringTest {

    @BeforeSuite
    public void setUpSuiteChild() {
        System.out.println("Child Suite");
        testBeans();
    }

    @BeforeTest
    public void setUpTestChild() {
        System.out.println("Child Test");
        testBeans();
    }

    @BeforeMethod
    public void setUpMethodChild() {
        System.out.println("Child Method");
        testBeans();
    }

    @Test
    void testComponent() {
        Assert.assertNotNull(simpleComponent);
        Assert.assertNotNull(simpleComponent.getName());
    }

    @Test
    void testSimpleBean() {
        Assert.assertNotNull(simpleBean);
        Assert.assertNotNull(simpleBean.getName());
    }

    @Test
    void testStringProperty() {
        Assert.assertNotNull(randomString);
        Assert.assertFalse(randomString.isEmpty());
    }

    @Test
    void testBeanWithStringProp() {
        Assert.assertNotNull(beanWithStringProp);
        Assert.assertFalse(randomString.isEmpty());
        Assert.assertEquals(beanWithStringProp.getName(), randomString);

    }

}
