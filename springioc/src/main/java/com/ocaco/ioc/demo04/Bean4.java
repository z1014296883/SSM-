package com.ocaco.ioc.demo04;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.BeanNameAware;
import org.springframework.beans.factory.DisposableBean;
import org.springframework.beans.factory.InitializingBean;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationContextAware;

public class Bean4 implements BeanNameAware,ApplicationContextAware,InitializingBean,DisposableBean {
    private String name;

    public Bean4() {
        System.out.println("第一步。Bean4被实例化。。。");
    }

    public void setName(String name) {
        System.out.println("第二步，设置属性");
        this.name = name;
    }

    @Override
    public void setBeanName(String name) {
        System.out.println("第三步，执行配置文件中ID的值 = "+name);
    }

    @Override
    public void setApplicationContext(ApplicationContext applicationContext) throws BeansException {
        System.out.println("第四步,了解工厂的信息");
    }

    @Override
    public void afterPropertiesSet() throws Exception {
        System.out.println("第六步，属性设置后");
    }


    public void init(){
        System.out.println("第七步，Bean4初始化。。。");
    }

    public void say(){
        System.out.println("第九步，执行本类中的方法。");
    }

    public void destroy(){
        System.out.println("第十部，执行spring销毁方法。。。");
    }

    public void closeBean(){
        System.out.println("第十一部，销毁Bean4.。。");
    }
}
