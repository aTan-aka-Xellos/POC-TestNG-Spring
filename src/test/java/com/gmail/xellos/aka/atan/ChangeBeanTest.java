package com.gmail.xellos.aka.atan;

import static org.testng.Assert.assertEquals;
import static org.testng.Assert.assertNotEquals;

import org.testng.annotations.*;

public class ChangeBeanTest extends TestNGSpringTest {

    @Test
    void testBeanWithRefresh() {

        System.out.println("_Test method");

        System.out.println();
        System.out.println("randomString:     " + randomString);
        System.out.println("randomStringProp: " + beanWithProp.getRandomString());
        System.out.println("withProp:         " + beanWithProp.getBeanToStoreString().getString());

        assertEquals(beanWithProp.getRandomString(), randomString);

        beanWithProp.setRandomString(beanWithProp.getBeanToStoreString().getString());
        assertEquals(beanWithProp.getBeanToStoreString().getString(),
                     beanWithProp.getRandomString());

        refreshBeanToStoreString();

        System.out.println();
        System.out.println("randomString:     " + randomString);
        System.out.println("randomStringProp: " + beanWithProp.getRandomString());
        System.out.println("withProp:         " + beanWithProp.getBeanToStoreString().getString());

        System.out.println("withProp:         " + beanWithProp    .getBeanToStoreString().getString());
        System.out.println("withPropCopy:     " + beanWithPropCopy.getBeanToStoreString().getString());
        System.out.println();

        assertNotEquals(beanWithPropCopy.getBeanToStoreString().getString(), randomString);
        assertNotEquals(beanWithProp.getBeanToStoreString().getString(),
                beanWithProp.getRandomString());

        assertEquals(beanWithProp    .getBeanToStoreString().getString(),
                     beanWithPropCopy.getBeanToStoreString().getString());

    }


}
