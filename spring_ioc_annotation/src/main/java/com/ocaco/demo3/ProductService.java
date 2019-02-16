package com.ocaco.demo3;

import javax.annotation.Resource;

public class ProductService {
    //属性注入使用注解
    @Resource(name="categoryDao")
    private CategoryDao categoryDao;
    @Resource(name="productDao")
    private ProductDao productDao;

    public void save(){
        categoryDao.save();
        productDao.save();

        System.out.println("ProductService中save执行了");
    }
}
