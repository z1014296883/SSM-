package com.ocaco.ioc.demo03;

public class Bean2Factory {

    public static Bean2 getBean2(){
        System.out.println("Bean2工厂执行");
        return new Bean2();
    }
}
