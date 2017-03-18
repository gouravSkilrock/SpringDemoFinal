package com.skilrock.springsDemo;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class DrawShapeUsingInterface {

	public static void main(String[] args) {
		
		AbstractApplicationContext context=new ClassPathXmlApplicationContext("spring.xml");
		context.registerShutdownHook();
		IShape shape=(IShape)context.getBean("triangle");
		shape.draw();
		
		IShape shape2=(IShape)context.getBean("circle");
		shape2.draw();


	}

}
