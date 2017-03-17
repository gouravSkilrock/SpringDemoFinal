package com.skilrock.springsDemo;

import java.util.List;

public class InheritanceOfBeanInXmlUsingList {

	private List<ObjectInjectionPoint> points;

	public List<ObjectInjectionPoint> getPoints() {
		return points;
	}

	public void setPoints(List<ObjectInjectionPoint> points) {
		this.points = points;
	}
	
	public void showPointUsingList(){
	
		for(ObjectInjectionPoint pointObject : points){
			System.out.println("Points are : ("+pointObject.getX()+","+pointObject.getY()+")");
		}
	}
	
}
