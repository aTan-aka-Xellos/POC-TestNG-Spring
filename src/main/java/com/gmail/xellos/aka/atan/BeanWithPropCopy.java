package com.gmail.xellos.aka.atan;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;

public class BeanWithPropCopy {

    @Autowired
    @Qualifier("randomString")
    private String randomString;

    @Autowired
    private BeanToStoreString beanToStoreString;

    public BeanWithPropCopy() {
        System.out.println("Create BeanWithPropCopy");
    }

    public BeanToStoreString getBeanToStoreString() {
        return beanToStoreString;
    }

    public void setBeanToStoreString(BeanToStoreString beanToStoreString) {
        this.beanToStoreString = beanToStoreString;
    }

    public String getRandomString() {
        return randomString;
    }

    public void setRandomString(String randomString) {
        this.randomString = randomString;
    }


}
