package com.springApp.springPropertySource;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Entry point
 * @author Ihor Savchenko
 * @version 1.0
 */
public class Main {

    public static void main(String[] args) {
        ApplicationContext context = new AnnotationConfigApplicationContext(AppConfig.class);
        //ApplicationContext context = new ClassPathXmlApplicationContext("classpath:/springContext.xml");
        TestBean testBean = (TestBean) context.getBean("myBean");
        //TestBean testBean = context.getBean("myBean", TestBean.class);
        System.out.println(testBean.getName());
        System.out.println(testBean.getName2());
    }
}
