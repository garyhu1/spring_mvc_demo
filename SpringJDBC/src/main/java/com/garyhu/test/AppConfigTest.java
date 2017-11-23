package com.garyhu.test;

import com.garyhu.config.AppConfig;
import com.garyhu.inter.HelloWorld;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @author: garyhu
 * @Since: 2017/11/14 0014.
 * @Decription:
 */
public class AppConfigTest {
    public static void  main(String[] args){
        ApplicationContext context = new AnnotationConfigApplicationContext(AppConfig.class);
        HelloWorld hw = (HelloWorld) context.getBean("helloWorld");

        hw.sayHello("garyhu");
    }
}
