package com.skilrock.springsDemo;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class ApplicationContextAwareExample {
	
	public static void main(String[] args) {
		ApplicationContext context=new ClassPathXmlApplicationContext("spring.xml");
		AutoWiring autoWiring=(AutoWiring)context.getBean("autoWiredObjectSecond");
		autoWiring.setApplicationContext(context);
		autoWiring.displayMyCoordinates();
	}
}
