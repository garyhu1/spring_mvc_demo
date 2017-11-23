package com.garyhu.test;

import com.garyhu.pojo.CustomerService;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @author: garyhu
 * @Since: 2017/11/14 0014.
 * @Decription:
 */
public class TestSingle {
    public static void main(String[] args){
        ApplicationContext context = new ClassPathXmlApplicationContext("service/CustomerService.xml");
        CustomerService serviceA = (CustomerService) context.getBean("customerService");
        serviceA.setMsg("Msg is created by A");

        CustomerService serviceB = (CustomerService) context.getBean("customerService");
        System.out.println("serviceA ---> "+serviceA.getMsg());
        System.out.println("serviceB ---> "+serviceB.getMsg());
    }
}
