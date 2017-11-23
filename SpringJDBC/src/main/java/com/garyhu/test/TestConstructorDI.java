package com.garyhu.test;

import com.garyhu.util.OuterHelper;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @author: garyhu
 * @Since: 2017/11/14 0014.
 * @Decription:
 */
public class TestConstructorDI {
    public static void main(String[] args){
        ApplicationContext context = new ClassPathXmlApplicationContext("out.xml");
        OuterHelper out = (OuterHelper) context.getBean("out");
        out.print("this is a test pager");
    }
}
