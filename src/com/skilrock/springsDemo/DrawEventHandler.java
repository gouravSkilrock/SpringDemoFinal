package com.skilrock.springsDemo;

import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationEvent;

public class DrawEventHandler extends ApplicationEvent {
	
	public DrawEventHandler(Object source) {
		super(source);
		// TODO Auto-generated constructor stub
	}

	public String toString(){
		
		return "Draw Event Occured";
	}

}
