package com.gmail.xellos.aka.atan;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.testng.AbstractTestNGSpringContextTests;
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
    ComponentFoo foo;

    @BeforeSuite
    public void xSetUpSuite() {
        System.out.println("Suite Base:  " + foo);
    }


    @BeforeTest
    public void setUpTest() {
        System.out.println("Test Base:   " + foo);
    }

    @BeforeMethod
    public void setUpMethod() {
        System.out.println("Method Base: " + foo);
    }

}
