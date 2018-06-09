package com.gmail.xellos.aka.atan;

import static org.testng.Assert.assertNotNull;

import org.apache.commons.lang3.RandomStringUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.testng.AbstractTestNGSpringContextTests;
import org.testng.annotations.*;

@ContextConfiguration(classes = AppConfig.class)
public class TestNGSpringTest extends AbstractTestNGSpringContextTests {

    private static int beforeParentMethodCallCounter = 0;

    @BeforeTest  (alwaysRun = true)
    @BeforeSuite (alwaysRun = true)
    @BeforeMethod(alwaysRun = true)
    @Override
    protected void springTestContextPrepareTestInstance() throws Exception {
        // https://jira.spring.io/browse/SPR-4072
        System.out.println();
        System.out.println("Override springTestContextPrepareTestInstance");
        super.springTestContextBeforeTestClass();
        super.springTestContextPrepareTestInstance();
    }

    @Autowired SimpleComponent simpleComponent;
    @Autowired SimpleBean simpleBean;

    @Autowired String randomString;
    @Autowired BeanWithProp beanWithProp;
    @Autowired BeanWithPropCopy beanWithPropCopy;

    @BeforeSuite
    void xSetUpSuite() {
        System.out.println();
        System.out.println("Base BeforeSuite");
        checkBeans();
    }

    @BeforeTest
    void xSetUpTest() {
        System.out.println("Base BeforeTest");
        checkBeans();
    }

    @BeforeMethod
    void xSetUpMethod() {
        System.out.println("Base BeforeMethod");
        checkBeans();
        beforeParentMethodCallCounter++;
    }

    @AfterSuite
    void xAfterSuite() {
        System.out.println("Base AfterSuite");
        System.out.println("xSetUpMethod calls: " + beforeParentMethodCallCounter);
        checkBeans();
    }

    @AfterTest
    void xAfterTest() {
        System.out.println("Base AfterTest");
        checkBeans();
    }

    @AfterMethod
    void xAfterMethod() {
        System.out.println("Base AfterMethod");
        checkBeans();
    }

    void refreshBeanToStoreString() {
        beanWithProp.getBeanToStoreString().setString(RandomStringUtils.randomAlphabetic(5));
    }

    void checkBeans() {
        assertNotNull(simpleBean);
        assertNotNull(simpleComponent);
        assertNotNull(randomString);
        assertNotNull(beanWithProp);
        assertNotNull(beanWithPropCopy);
        assertNotNull(beanWithProp    .getBeanToStoreString());
        assertNotNull(beanWithPropCopy.getBeanToStoreString());
        assertNotNull(beanWithProp    .getBeanToStoreString().getString());
        assertNotNull(beanWithPropCopy.getBeanToStoreString().getString());

    }
}
