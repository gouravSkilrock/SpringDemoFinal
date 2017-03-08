package com.skilrock.springsDemo;

public class ObjectInjectionMethodClass {

	private ObjectInjectionPoint pointA;
	private ObjectInjectionPoint pointB;
	private ObjectInjectionPoint pointC;
	
	
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
	
}
