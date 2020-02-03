package com.org.spring;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

import org.springframework.beans.factory.annotation.Autowired;

public class NewCollection implements IDoDo{
	private int a;
	private int b;
	private int c;
	private NewObject newObject;
		
	@Autowired
	public NewObject getNewObject() {
		return newObject;
	}
	public void setNewObject(NewObject newObject) {
		this.newObject = newObject;
	}
	public int getA() {
		return a;
	}
	public void setA(int a) {
		this.a = a;
	}
	public int getB() {
		return b;
	}
	public void setB(int b) {
		this.b = b;
	}
	public int getC() {
		return c;
	}
	public void setC(int c) {
		this.c = c;
	}
	public void collectionShow(){
		System.out.println("This is NewCollection" );
		System.out.println("A is : " + getA() + " B is : " + getB()+" C is "+getC() );
	}
	
	@Override
	public void must() {
		System.out.println("This is NewCollection Class ...");
	}
	
	@PostConstruct
	public void myInit(){
		System.out.println("My function myInit Called of NewCollection ...");
	}
	@PreDestroy
	public void myDestroy(){
		System.out.println("My own function myDestory Called of NewCollection ...");
	}
}
