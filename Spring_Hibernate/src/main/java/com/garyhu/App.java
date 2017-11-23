package com.garyhu;

import com.garyhu.dao.ProductDao;
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
        ProductDao dao = (ProductDao) context.getBean("productDao");

        Product p = new Product();
        p.setName("vivo x20");
        p.setPrice(2499f);

        dao.save(p);

        Product product = dao.getProductById(4);
        System.out.println("product name : "+product.getName());
    }
}
