package com.company;

/**
 * @author 鲁佳磊
 * @create 2020-08-12 17:17
 */
public class User {
    private String name;
    private String age;

    public User(String name, String age) {
        this.name = name;
        this.age = age;
    }

    public void test(){
        System.out.println("创建了一个user类来实现这个事情！");
        System.out.println(name+""+age);
    }
}
