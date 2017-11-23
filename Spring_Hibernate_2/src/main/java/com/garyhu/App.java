package com.garyhu;

import com.garyhu.bo.impl.ProductBoImpl;
import com.garyhu.pojo.Product;
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
        ProductBoImpl productBo = (ProductBoImpl) context.getBean("productBo");

        Product product = productBo.getProductById(3);

        System.out.println("product name : "+product.getName());
    }
}
