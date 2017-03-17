package com.skilrock.springsDemo;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class DrawShapeUsingInterface {

	public static void main(String[] args) {
		
		ApplicationContext context=new ClassPathXmlApplicationContext("spring.xml");
		IShape shape=(IShape)context.getBean("triangle");
		shape.draw();
		
		IShape shape2=(IShape)context.getBean("circleObject");
		shape2.draw();


	}

}
