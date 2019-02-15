package com.ocaco.ioc.demo03;

public class Bean3Factory {

    public Bean3 getBean3(){
        System.out.println("Bean3Factory实例化了");
        return new Bean3();
    }
}
