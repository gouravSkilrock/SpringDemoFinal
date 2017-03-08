package com.skilrock.springsDemo;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class ObjectInjectionDemo {

	public static void main(String[] args) {
		
		ApplicationContext context = new ClassPathXmlApplicationContext("spring.xml");
		ObjectInjectionMethodClass object=(ObjectInjectionMethodClass)context.getBean("objectInjection");
		object.displayMyCoordinates();

	}

}
