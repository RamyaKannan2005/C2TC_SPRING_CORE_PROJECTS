package com.tnsif.ioc;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class App {
    public static void main(String[] args) {
        // Load Spring configuration file
        ApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");

        // Retrieve bean from container
        Student student = (Student) context.getBean("studentBean");

        // Call method
        student.displayInfo();
    }
}
