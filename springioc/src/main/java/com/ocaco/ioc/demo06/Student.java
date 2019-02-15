package com.ocaco.ioc.demo06;

public class Student {

    private String name;
    private int age;

    private Cat cat;

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public Cat getCat() {
        return cat;
    }

    public void setCat(Cat cat) {
        this.cat = cat;
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", cat=" + cat +
                '}';
    }


    public void setName(String name) {
        this.name = name;
    }

    public void setAge(int age) {
        this.age = age;
    }
}
