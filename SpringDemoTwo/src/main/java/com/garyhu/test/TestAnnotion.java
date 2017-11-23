package com.garyhu.test;

import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @author: garyhu
 * @Since: 2017/11/15 0015.
 * @Decription:
 */
public class TestAnnotion {
    public static void main(String[] args){
        ConfigurableApplicationContext context = new ClassPathXmlApplicationContext("Worker.xml");
        context.getBean("worker");
        context.close();
    }
}
