package com.ocaco.ioc.demo07;

import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class CollectionBeanTest {

    @Test
    public void test(){
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("applicationContext.xml");

        CollectionBean collectionBean = (CollectionBean) applicationContext.getBean("collectionBean");

        System.out.println(collectionBean.toString());
    }
}
