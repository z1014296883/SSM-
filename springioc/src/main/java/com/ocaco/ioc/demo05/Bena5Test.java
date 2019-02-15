package com.ocaco.ioc.demo05;

import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Bena5Test {

    @Test
    public void Bean5Test(){
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("applicationContext.xml");

        UserDao userDao = (UserDao) applicationContext.getBean("userDao");


        userDao.findAll();
        userDao.save();
    }
}
