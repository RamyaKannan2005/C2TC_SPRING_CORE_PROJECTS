package com.tnsif.spring_ioc_demo;

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
//    	IoC
        ApplicationContext context = new ClassPathXmlApplicationContext("beans.xml");
//        System.out.println("Beans are loaded");
//        Airtel airtel = (Airtel) context.getBean("air"); // Default it is Object class, we have to type cast to required Class
//        Jio jio = context.getBean("Jio", Jio.class);     // To avoid type cast, we can pass class parameters like this.
        
        // we can implement Loose Coupling 
//        airtel.call();
//        airtel.data();
        Mobile mobile = context.getBean("mobile", Mobile.class);
        mobile.call();
        mobile.data();
        mobile.print();
    }
}
