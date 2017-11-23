package com.garyhu;

import com.garyhu.dao.CustomerDao;
import com.garyhu.pojo.Customer;
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
        ApplicationContext context  = new ClassPathXmlApplicationContext("applicationContext.xml");
        CustomerDao dao = (CustomerDao) context.getBean("customerDao");

        Customer c = new Customer();
        c.setName("jusppa");
        c.setSex("kid");

        dao.insert(c);
    }
}
