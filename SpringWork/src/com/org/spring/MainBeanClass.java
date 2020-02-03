package com.org.spring;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.core.io.FileSystemResource;

import com.org.spring.dao.HibernateDaoImpl;

public class MainBeanClass {
	public static void main (String...args){
		
//		BeanFactory beanFactory = new XmlBeanFactory(new FileSystemResource("spring.xml"));
		ApplicationContext context = new ClassPathXmlApplicationContext("spring.xml");
//		context.registerShutdownHook();
//		DependencyClass dependencyClass = (DependencyClass) context.getBean("dependent");
//		dependencyClass.show();
//		System.out.println(dependencyClass.getDown());
		
//		NewCollection collection = (NewCollection) context.getBean("inh3");
//		collection.collectionShow();
//		
//		IDoDo doo = (IDoDo) context.getBean("newObjectGo");
//		doo.must();
//		System.out.println(context.getMessage("gop", null, "Default Go !!!", null));
		
		HibernateDaoImpl daoImpl = context.getBean("hibernateDaoImpl", HibernateDaoImpl.class);
		System.out.println(daoImpl.getProject());
		
	}
}
