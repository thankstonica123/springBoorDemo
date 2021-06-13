package com.thankstonica.spring.controller;

import com.thankstonica.spring.bean.Food;
import com.thankstonica.spring.bean.Person;
import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 *
 */
public class GetBean {
    public static void main(String[] args) {

        ClassPathXmlApplicationContext ctx = new ClassPathXmlApplicationContext("applicationContext.xml");
        Person person = ctx.getBean("person", Person.class);
        Food food = ctx.getBean("food", Food.class);
        person.setId(101);
        /*
        person.setName("thankstonica");
        person.setPwd("123");
        food.setName("banana");
        */
        person.setFood(food);
        System.out.println(ToStringBuilder.reflectionToString(person, ToStringStyle.MULTI_LINE_STYLE));

    }
}
