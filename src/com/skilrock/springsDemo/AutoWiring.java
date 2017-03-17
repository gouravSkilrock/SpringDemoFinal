package com.skilrock.springsDemo;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.BeanNameAware;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationContextAware;

public class AutoWiring implements ApplicationContextAware , BeanNameAware{

	private ObjectInjectionPoint pointA;
	private ObjectInjectionPoint pointB;
	private ObjectInjectionPoint pointC;
	private ApplicationContext context = null;
	
	
	public ObjectInjectionPoint getPointA() {
		return pointA;
	}


	public void setPointA(ObjectInjectionPoint pointA) {
		this.pointA = pointA;
	}


	public ObjectInjectionPoint getPointB() {
		return pointB;
	}


	public void setPointB(ObjectInjectionPoint pointB) {
		this.pointB = pointB;
	}


	public ObjectInjectionPoint getPointC() {
		return pointC;
	}


	public void setPointC(ObjectInjectionPoint pointC) {
		this.pointC = pointC;
	}


	public void displayMyCoordinates(){
		System.out.println("POINT A : ("+pointA.getX()+","+pointA.getY()+")");
		System.out.println("POINT B : ("+pointB.getX()+","+pointB.getY()+")");
		System.out.println("POINT C : ("+pointC.getX()+","+pointC.getY()+")");
	}


	@Override
	public void setBeanName(String beanName) {
		System.out.println("Name of bean is : "+beanName);
		
	}


	@Override
	public void setApplicationContext(ApplicationContext context) throws BeansException {
		this.context =context;
		
	}
	
}
