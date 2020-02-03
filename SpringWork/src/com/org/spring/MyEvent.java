package com.org.spring;

import org.springframework.context.ApplicationEvent;

public class MyEvent extends ApplicationEvent{

	public MyEvent(Object source) {
		super(source);
	}

	public String toString(){
		return "This is the MyEvent Class";
		
	}
	
}
