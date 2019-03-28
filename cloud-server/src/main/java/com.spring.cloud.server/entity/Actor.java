package com.spring.cloud.server.entity;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Actor {
    private int id;
    private String name;
    private int age;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public Actor() {
        super();
        System.out.println("创建对象======");
    }

    public Actor(int id, String name, int age) {
        this.id = id;
        this.name = name;
        this.age = age;
    }
}
