package com.gmail.xellos.aka.atan;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.testng.AbstractTestNGSpringContextTests;
import org.testng.Assert;
import org.testng.annotations.*;

@ContextConfiguration(classes = AppConfig.class)
public class TestNGSpringTest extends AbstractTestNGSpringContextTests {

    @BeforeSuite(alwaysRun = true)
    @Override
    protected void springTestContextPrepareTestInstance() throws Exception {
        // https://jira.spring.io/browse/SPR-4072
        logger.info("Override springTestContextPrepareTestInstance");
        super.springTestContextBeforeTestClass();
        super.springTestContextPrepareTestInstance();
    }

    @Autowired
    SimpleComponent simpleComponent;

    @Autowired
    SimpleBean simpleBean;

    @Autowired
    BeanWithStringProp beanWithStringProp;

    @Autowired
    String randomString;


    @BeforeSuite
    public void xSetUpSuite() {
        System.out.println("Base Suite");
        testBeans();
    }


    @BeforeTest
    public void setUpTest() {
        System.out.println("Base Test");
        testBeans();
    }

    @BeforeMethod
    public void setUpMethod() {
        System.out.println("Base Method");
        testBeans();
    }

    protected void testBeans() {
        Assert.assertNotNull(simpleComponent);
        Assert.assertNotNull(simpleBean);
        Assert.assertNotNull(randomString);
    }

}
