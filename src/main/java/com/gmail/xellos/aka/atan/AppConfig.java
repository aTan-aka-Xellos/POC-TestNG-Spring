package com.gmail.xellos.aka.atan;

import org.apache.commons.lang3.RandomStringUtils;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan("com.gmail.xellos.aka.atan")
public class AppConfig {

    @Bean
    public static SimpleBean getBeanBar() {
        return new SimpleBean("This is a SimpleBean");
    }

    @Bean
    public static BeanWithProp getBeanWithProp() {
        return new BeanWithProp();
    }

    @Bean
    public static BeanWithPropCopy getBeanWithPropCopy() {
        return new BeanWithPropCopy();
    }

    @Bean
    public static BeanToStoreString getBeanStoreString() {
        return new BeanToStoreString(RandomStringUtils.randomAlphabetic(10));
    }

    @Bean(name = "randomString")
    public static String generateString() {
        return RandomStringUtils.randomAlphabetic(10);
    }

}
