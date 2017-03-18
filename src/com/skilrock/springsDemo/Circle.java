package com.skilrock.springsDemo;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;
import javax.annotation.Resource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.ApplicationEventPublisher;
import org.springframework.context.ApplicationEventPublisherAware;
import org.springframework.context.MessageSource;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Controller;
import org.springframework.stereotype.Service;

@Component
public class Circle implements IShape,ApplicationEventPublisherAware{

	private ObjectInjectionPoint circle;
	private ObjectInjectionPoint center;
	private ApplicationEventPublisher publisher;
	
	@Autowired
	private MessageSource messageSource;
	
	
	public MessageSource getMessageSource() {
		return messageSource;
	}

	public void setMessageSource(MessageSource messageSource) {
		this.messageSource = messageSource;
	}

	public ObjectInjectionPoint getCenter() {
		return center;
	}

	public ObjectInjectionPoint getCircle() {
		return circle;
	}

   @Autowired
   @Qualifier("circleRelated")
	public void setCircle(ObjectInjectionPoint circle) {
		this.circle = circle;
	}
   
   @Resource(name="pointC")
	public void setCenter(ObjectInjectionPoint center) {
		this.center = center;
	}
   
  @PostConstruct
   public void initMethod(){
	   System.out.println("Init method called of Circle bean ");
   }
   
  @PreDestroy
   public void destroyMethod(){
	   System.out.println("destroy method called of Circle bean ");
   }

	@Override
	public void draw() {
		System.out.println(this.messageSource.getMessage("greeting", null,"Default Greeting", null));
		System.out.println(this.messageSource.getMessage("circle.points", new Object[]{circle.getX(),circle.getY()},"Default Circle Points", null));
		System.out.println(this.messageSource.getMessage("circle.points", new Object[]{center.getX(),center.getY()},"Default Circle Points", null));
		
		//System.out.println("Circle points are : ( "+circle.getX()+","+circle.getY()+")");
		//System.out.println("Circle points are : ( "+center.getX()+","+center.getY()+")");
		
		DrawEventHandler drawEventHandler=new DrawEventHandler(this);
		publisher.publishEvent(drawEventHandler);
	}

	@Override
	public void setApplicationEventPublisher(ApplicationEventPublisher publisher) {
		this.publisher=publisher;
		
	}

}
