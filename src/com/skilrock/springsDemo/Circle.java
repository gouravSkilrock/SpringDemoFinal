package com.skilrock.springsDemo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;

public class Circle implements IShape{

	private ObjectInjectionPoint circle;
	
	
	public ObjectInjectionPoint getCircle() {
		return circle;
	}

   @Autowired
   @Qualifier("circleRelated")
	public void setCircle(ObjectInjectionPoint circle) {
		this.circle = circle;
	}


	@Override
	public void draw() {
		System.out.println("Circle points are : ( "+circle.getX()+","+circle.getY()+")");
		
	}

}
