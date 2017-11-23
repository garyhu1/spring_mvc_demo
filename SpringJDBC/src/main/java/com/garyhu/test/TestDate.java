package com.garyhu.test;

import com.garyhu.pojo.CusDate;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.util.Date;

/**
 * @author: garyhu
 * @Since: 2017/11/14 0014.
 * @Decription:
 */
public class TestDate {
    public static void main(String[] args){
        ApplicationContext context = new ClassPathXmlApplicationContext("date.xml");
        ApplicationContext context1 = new ClassPathXmlApplicationContext("date2.xml");
        CusDate date = (CusDate) context.getBean("cusDate");
        Date d = date.getDate();
        System.out.println("日期： "+d.toString());

        CusDate date1 = (CusDate) context1.getBean("mydate");
        Date d1 = date1.getDate();
        System.out.println("日期： "+d1.toString());
    }
}
