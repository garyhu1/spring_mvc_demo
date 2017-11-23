package com.garyhu.test;

import com.garyhu.pojo.Customer;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @author: garyhu
 * @Since: 2017/11/15 0015.
 * @Decription: 测试继承关系
 */
public class TestInhiret {

    public static void main(String[] args){
        ApplicationContext context = new ClassPathXmlApplicationContext("Customer.xml");
        Customer customer = (Customer) context.getBean("cut");
        System.out.println(customer);
    }
}
