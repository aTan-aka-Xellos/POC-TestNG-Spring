package com.gmail.xellos.aka.atan;

import org.apache.commons.lang3.RandomStringUtils;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class DataProvider {

    @Bean(name = "randomString")
    public static String generateString() {
        return RandomStringUtils.randomAlphabetic(10);
    }

}
