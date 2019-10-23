package com.hexa.spring.springdemo3;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
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
        /*ApplicationContext context = new ClassPathXmlApplicationContext("Bean.xml");
        Employee emp = context.getBean("emp", Employee.class);
        emp.setEid(320120);
        System.out.println(emp.getEid());
        
        Employee emp1=context.getBean("emp", Employee.class);
        System.out.println(emp1.getEid());*/
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext();
        context.register(AppConfig.class);
        context.refresh();
        Employee emp = context.getBean(Employee.class);
        emp.setEid(4444);
        System.out.println(emp.getEid());
        context.close();
    }
}
