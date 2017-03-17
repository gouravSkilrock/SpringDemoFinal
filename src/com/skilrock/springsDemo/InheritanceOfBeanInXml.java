package com.skilrock.springsDemo;

import org.springframework.beans.factory.DisposableBean;
import org.springframework.beans.factory.InitializingBean;


public class InheritanceOfBeanInXml implements InitializingBean,DisposableBean {

	private ObjectInjectionPoint pointX;
	private ObjectInjectionPoint pointY;
	private ObjectInjectionPoint pointZ;
	
	
	public ObjectInjectionPoint getPointX() {
		return pointX;
	}
	public void setPointX(ObjectInjectionPoint pointX) {
		this.pointX = pointX;
	}

	public ObjectInjectionPoint getPointY() {
		return pointY;
	}

	public void setPointY(ObjectInjectionPoint pointY) {
		this.pointY = pointY;
	}

	public ObjectInjectionPoint getPointZ() {
		return pointZ;
	}

	public void setPointZ(ObjectInjectionPoint pointZ) {
		this.pointZ = pointZ;
	}

	public void showPoints(){
			System.out.println("POINT X : ("+pointX.getX()+","+pointX.getY()+")");
			System.out.println("POINT Y : ("+pointY.getX()+","+pointY.getY()+")");
			System.out.println("POINT Z : ("+pointZ.getX()+","+pointZ.getY()+")");
		}
	@Override
	public void destroy() throws Exception {
		System.out.println("Initializing init method called");
		
	}
	@Override
	public void afterPropertiesSet() throws Exception {
		System.out.println("DisposableBean destroy method called");
		
	}
	
	public void myInit(){
		System.out.println("My init method called");
	}
	
	public void myDestroy(){
		System.out.println("My destroy method called");
	}
}
