package com.garyhu;

import com.garyhu.log.Logging;
import com.garyhu.pojo.Student;
import org.springframework.aop.aspectj.annotation.AspectJProxyFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        ApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
        Student student = (Student) context.getBean("student");

        AspectJProxyFactory factory = new AspectJProxyFactory(student);

        factory.addAspect(Logging.class);

        Student studentProxy = factory.getProxy();

        studentProxy.getName();
    }
}
