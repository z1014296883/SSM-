package com.ocaco.ioc.demo01;

import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class SpringDemo1 {

    @Test
    /**
     * 传统方式开发
     */
    public void sayHelloTest1(){
        UserService service = new UserServiceImpl();
        //因为接口中没有geter seter方法 无法调用实现类中的方法，直接new实现类，不符合面向接口编程
        service.sayHello();
    }

    @Test
    /**
     * 使用spring工厂的方式开发
     */
    public void seyHelloTest2(){
        //创建spring工厂对象
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("applicationContext.xml");
        //通过工厂对象的getBean方法获取对象
        UserService service = (UserService) applicationContext.getBean("userService");

        service.sayHello();
    }


}
