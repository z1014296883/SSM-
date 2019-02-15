package com.ocaco.ioc.demo02;

import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class FoodTest {
    @Test
    public void foodTest(){
        //获取工厂对象
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("applicationContext.xml");

        Food food = (Food) applicationContext.getBean("foodClass");

        System.out.println(food.toString());
    }

}
