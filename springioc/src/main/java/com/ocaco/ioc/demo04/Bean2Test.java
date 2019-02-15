package com.ocaco.ioc.demo04;

import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Bean2Test {

    /**
     * spring的生命周期
     */
    @Test
    public void Bena4Test(){
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("applicationContext.xml");
        Bean4 bean4 = (Bean4) applicationContext.getBean("bean4");

        bean4.say();

        //向下转型
        ClassPathXmlApplicationContext cpApplicationContext = (ClassPathXmlApplicationContext)applicationContext;
        //关闭工厂时会调用销毁方法
        cpApplicationContext.close();


    }
}
