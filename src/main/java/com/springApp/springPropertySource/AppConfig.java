package com.springApp.springPropertySource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;
import org.springframework.core.env.Environment;

/**
 * Java config
 * @author Ihor Savchenko
 * @version 1.0
 */
@Configuration
@PropertySource("classpath:/app.properties")
public class AppConfig {
    @Autowired
    Environment env;

    @Bean(name = "myBean")
    public TestBean testBean() {
        TestBean testBean = new TestBean();
        testBean.setName(env.getProperty("testBean.name"));
        testBean.setName2(env.getProperty("testBean.name2"));
        testBean.setName("Hey pale!");
        return testBean;
    }
}

