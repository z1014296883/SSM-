package com.ocaco.demo02;

import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

@Component("bean1")
public class Bean1 {

    @PostConstruct
    public void init(){
        System.out.println("初始化");
    }
    public void method(){
        System.out.println("本类方法");
    }
    @PreDestroy
    public void destroy(){
        System.out.println("销毁方法");

    }
}
