package com.skilrock.springsDemo;

public class Triangle implements IShape {
	
	private String type;
	private int length;
	private int width;
	
	public int getWidth() {
		return width;
	}


	public void setWidth(int width) {
		this.width = width;
	}
	
	public String getType() {
		return type;
	}


	public int getLength() {
		return length;
	}
	
	public Triangle(String type){
		this.type=type;
	}
	
	public Triangle(int length){
		this.length=length;
	}
	
	public Triangle(String type,int length) {
		this.type=type;
		this.length=length;
	}


	public void draw(){
		System.out.println(getType()+" Triangle Drawn with length : "+getLength()+" And width :"+getWidth());
	}


	

}
