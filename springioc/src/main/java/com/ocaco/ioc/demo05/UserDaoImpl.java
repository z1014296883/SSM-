package com.ocaco.ioc.demo05;

public class UserDaoImpl implements UserDao{
    @Override
    public void findAll() {
        System.out.println("查询数据库信息");
    }

    @Override
    public void save() {
        System.out.println("向数据库添加信息");
    }
}
