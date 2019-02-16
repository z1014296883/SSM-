package com.ocaco.demo1;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

//@Component("userService")
@Service("userService")
public class UserService {

    @Value("biangbiangbiang")//如果有set方法则注解加载set方法上，没有则加在属性上
    private String something;

//    @Autowired
//    @Qualifier("userDao")
    @Resource(name="userDao")   //相当于上面两句
    private UserDao userDao;
    public String seyHello(String name){
        return "hello"+name;
    }

    public String sey(){
        return something;
    }

    public void save(){
        userDao.save();
        System.out.println("Service中保存用户。。");
    }
}
