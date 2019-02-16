package com.ocaco.demo02;

import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class BeanTest {

    @Test
    public void test1(){
        ApplicationContext applicationContext =new ClassPathXmlApplicationContext("applicationContext.xml");

        Bean1 bean1 = (Bean1) applicationContext.getBean("bean1");

        bean1.method();

        ClassPathXmlApplicationContext cpac = (ClassPathXmlApplicationContext) applicationContext;
        cpac.close();

    }
    @Test
    public void test2(){
        ApplicationContext applicationContext =new ClassPathXmlApplicationContext("applicationContext.xml");

        Bean2 bean1 = (Bean2) applicationContext.getBean("bean2");
        Bean2 bean2 = (Bean2) applicationContext.getBean("bean2");

        System.out.println("bean1 = " + bean1);
        System.out.println("bean2 = " + bean2);
    }
}
