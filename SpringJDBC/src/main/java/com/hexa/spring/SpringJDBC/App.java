package com.hexa.spring.SpringJDBC;

import java.util.List;

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
        System.out.println( "Hello World!" );
        ApplicationContext context = new ClassPathXmlApplicationContext("Bean.xml");
        ProductDAO prod = context.getBean("pdao", ProductDAO.class);
       // prod.insertPro(new Product(66, "PC"));
        List<Product> pr = prod.selectData();
        for(Product p : pr) {
        	System.out.println(p.getProId() + " " + p.getProName());
        }
    }
}
