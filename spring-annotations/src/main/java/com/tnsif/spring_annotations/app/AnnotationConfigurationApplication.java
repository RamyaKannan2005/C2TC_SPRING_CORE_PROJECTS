package com.tnsif.spring_annotations.app;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
public class AnnotationConfigurationApplication {
	public static void main(String...args) {
		// TODO Auto-generated method stub
		ApplicationContext context = new AnnotationConfigApplicationContext(AppConfig.class);
		
		MusicTeacher obj= context.getBean("getTeacherInfo",MusicTeacher.class);
		obj.setName("Shyam singha roy");
		System.out.println(obj.getTeacherInfo());
	}		
}