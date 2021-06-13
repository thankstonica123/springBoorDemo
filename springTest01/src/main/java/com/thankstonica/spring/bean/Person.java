package com.thankstonica.spring.bean;

/**
 * 定义一个javaBean : Person
 */
public class Person {
    private int id;
    private String name;
    private String pwd;
    private Food food;

    public Person(int id, String name, String pwd, Food food) {
        this.id = id;
        this.name = name;
        this.pwd = pwd;
        this.food = food;
    }

    public Food getFood() {
        return food;
    }

    public void setFood(Food food) {
        this.food = food;
    }

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

    public String getPwd() {
        return pwd;
    }

    public void setPwd(String pwd) {
        this.pwd = pwd;
    }

    @Override
    public String toString() {
        return "Person{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", pwd='" + pwd + '\'' +
                '}';
    }
}
