package com.ocaco.ioc.demo06;

import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class PersonTest {

    @Test
    public void personTest(){
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("applicationContext.xml");

        Person person = (Person) applicationContext.getBean("person");

        System.out.println(person.toString());
    }

    @Test
    public void studentTest(){
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("applicationContext.xml");

        Student student = (Student) applicationContext.getBean("student");

        System.out.println(student.toString());
    }

    @Test
    public void productTest(){
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("applicationContext.xml");

        Product product = (Product) applicationContext.getBean("product");

        System.out.println(product.toString());

    }
}
