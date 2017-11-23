package com.garyhu.test;

import com.garyhu.pojo.HelloWorld;
import com.garyhu.service.HelloWorldService;
import com.garyhu.service.User;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @author: garyhu
 * @Since: 2017/11/13.
 * @Decription: 测试类
 */
public class HelloProgram {
    public static void main(String[] args){
        ApplicationContext context = new ClassPathXmlApplicationContext("beans.xml");
        HelloWorldService service = (HelloWorldService) context.getBean("helloWorldService");
        User user = (User) context.getBean("user");

        HelloWorld hw = service.getHelloWorld();

        hw.sayHello();
        System.out.println("用户名： "+user.getName());
    }
}
