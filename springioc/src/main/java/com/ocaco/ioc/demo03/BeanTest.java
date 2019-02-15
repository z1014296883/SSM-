package com.ocaco.ioc.demo03;

import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.Bean;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class BeanTest {

    @Test
    /**
     *  类构造器实例化
     */
    public void beanTest1(){

        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("applicationContext.xml");
        applicationContext.getBean("bean1");

    }

    @Test
    /**
     *  静态工厂类实例化bean2
     */
    public void beanTest2(){
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("applicationContext.xml");
        Bean2 bean2 = (Bean2) applicationContext.getBean("bean2");
        bean2.say();

    }

    @Test
    /**
     *
     */
    public void beanTest3(){
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("applicationContext.xml");
        Bean3 bean3 = (Bean3) applicationContext.getBean("bean3");

    }
}
