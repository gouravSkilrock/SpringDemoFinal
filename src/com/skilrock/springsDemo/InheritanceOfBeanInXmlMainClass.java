package com.skilrock.springsDemo;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class InheritanceOfBeanInXmlMainClass {
	
	public static void main(String[] args) {
		
		AbstractApplicationContext context=new ClassPathXmlApplicationContext("spring.xml");
		context.registerShutdownHook();
		System.out.println("INHERITANCE EXMAPLE 1");
		InheritanceOfBeanInXml beanInXml=(InheritanceOfBeanInXml)context.getBean("beanInXmlObject");
		beanInXml.showPoints();
		System.out.println("INHERITANCE EXMAPLE 2");
		InheritanceOfBeanInXml beanInXmlSecond=(InheritanceOfBeanInXml)context.getBean("beanInXmlObjectSecond");
		beanInXmlSecond.showPoints();
		System.out.println("INHERITANCE EXMAPLE USING COLLECTION LIST");
		InheritanceOfBeanInXmlUsingList beanInXmlThird=(InheritanceOfBeanInXmlUsingList)context.getBean("beanInXmlObjectThird");
		beanInXmlThird.showPointUsingList();
		
	
	}

}
