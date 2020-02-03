package com.org.spring;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationEventPublisher;
import org.springframework.context.ApplicationEventPublisherAware;
import org.springframework.context.MessageSource;
import org.springframework.stereotype.Component;

@Component
public class GoGo implements IDoDo, ApplicationEventPublisherAware{
	
	private NewObject newObjectGo;
	@Autowired
	private MessageSource messageSource;
	private ApplicationEventPublisher applicationEventPublisher;
	
	public MessageSource getMessageSource() {
		return messageSource;
	}
	public void setMessageSource(MessageSource messageSource) {
		this.messageSource = messageSource;
	}
	public NewObject getNewObjectGo() {
		return newObjectGo;
	}
	@Autowired
	public void setNewObjectGo(NewObject newObjectGo) {
		this.newObjectGo = newObjectGo;
	}

	@Override
	public void must() {
		System.out.println("This is a GoGo call ...");
		System.out.println(this.messageSource.getMessage("go", null, "GoGo Class", null));
		MyEvent event = new MyEvent(this);
		applicationEventPublisher.publishEvent(event);
		
		
	}
	@Override
	public void setApplicationEventPublisher(
			ApplicationEventPublisher applicationEventPublisher) {
		this.applicationEventPublisher=applicationEventPublisher; 
		
	}

}
