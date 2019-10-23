package com.hexa.spring.springtraining;
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
        /*Training trg = new javaTraining();
        Training trg1 = new oracleTraining();
        trg.training();
        trg1.training();*/
        ApplicationContext context = new ClassPathXmlApplicationContext("Bean.xml");
        //Training trg = (Training)context.getBean("emp");
        javaTraining j = (javaTraining) context.getBean("java");
        j.training();
        System.out.println(j);
        //System.out.println(trg);
        //Training trg1 = (Training)context.getBean("java");
        /*Resource resource = new ClassPathResource("Bean.xml");
        BeanFactory factory = new XmlBeanFactory(resource);
        Training trg = (Training)factory.getBean("oracle");*/
       //e.empDetails();
       //trg1.training();
    }
}
