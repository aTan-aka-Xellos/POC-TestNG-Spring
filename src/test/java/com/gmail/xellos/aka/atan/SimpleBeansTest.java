package com.gmail.xellos.aka.atan;

import static org.testng.Assert.assertFalse;
import static org.testng.Assert.assertNotNull;
import static org.testng.Assert.assertEquals;

import org.testng.annotations.Test;

public class SimpleBeansTest extends TestNGSpringTest {

    @Test
    void testComponent() {
        System.out.println("_Test method");
        assertNotNull(simpleComponent);
        assertNotNull(simpleComponent.getName());
    }

    @Test
    void testSimpleBean() {
        System.out.println("_Test method");
        assertNotNull(simpleBean);
        assertNotNull(simpleBean.getName());
    }

    @Test
    void testStringProperty() {
        System.out.println("_Test method");
        assertNotNull(randomString);
        assertFalse(randomString.isEmpty());
    }

    @Test
    void testBeanWithProp() {
        System.out.println("_Test method");
        assertNotNull(beanWithProp);
        assertNotNull(beanWithProp.getBeanToStoreString());
    }

    @Test
    void testBeanWithPropCopy() {
        System.out.println("_Test method");
        assertNotNull(beanWithPropCopy);
        assertNotNull(beanWithPropCopy.getBeanToStoreString());
    }


    @Test
    void testBeansEquals() {
        System.out.println("_Test method");
        assertEquals(beanWithPropCopy.getBeanToStoreString().getString(),
                         beanWithProp.getBeanToStoreString().getString());
    }


}
