package com.garyhu.test;

import com.garyhu.core.Animal;
import com.garyhu.pojo.Order;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @author: garyhu
 * @Since: 2017/11/15 0015.
 * @Decription:
 */
public class TestEL {
    public static void main(String[] args){
        ApplicationContext context = new ClassPathXmlApplicationContext("Order.xml");
        Order order = (Order) context.getBean("order");
        System.out.println("name : "+order.getItemName());

        ApplicationContext context1 = new ClassPathXmlApplicationContext("Animal.xml");
        Animal a = (Animal) context1.getBean("animal");
        System.out.println("The Cat name : "+a.getName());
        String fullName = a.getFullName();
        System.out.println("The Cat fullName : "+fullName);
        a.print();
        String mapA = a.getMapA();
        String listA = a.getListA();
        System.out.println("The ListA  : "+listA+" ,the MapA : "+mapA);
    }
}
