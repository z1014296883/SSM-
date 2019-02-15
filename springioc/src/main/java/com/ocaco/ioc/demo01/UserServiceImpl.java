package com.ocaco.ioc.demo01;

public class UserServiceImpl implements UserService {

    private String name;

    @Override
    public void sayHello() {
        System.out.println("heeeee"+name);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
