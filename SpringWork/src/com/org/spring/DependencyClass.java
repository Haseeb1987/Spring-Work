package com.org.spring;

import java.util.List;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.BeanNameAware;
import org.springframework.beans.factory.DisposableBean;
import org.springframework.beans.factory.InitializingBean;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationContextAware;

public class DependencyClass implements ApplicationContextAware, BeanNameAware, InitializingBean, 
	DisposableBean, IDoDo{
	private String depend;
	private String go;
	private int down;
	private NewObject newObject;
	private NewObject newObject2;
	private List<NewCollection> newCollection;
	private ApplicationContext context;
	
	public List<NewCollection> getNewCollection() {
		return newCollection;
	}

	public void setNewCollection(List<NewCollection> newCollection) {
		this.newCollection = newCollection;
	}

	public NewObject getNewObject2() {
		return newObject2;
	}

	public void setNewObject2(NewObject newObject2) {
		this.newObject2 = newObject2;
	}

	public NewObject getNewObject() {
		return newObject;
	}

	@Autowired
	public void setNewObject(NewObject newObject) {
		this.newObject = newObject;
	}

	public DependencyClass(int down){
		this.down = down;
	}
	
	public String getDepend() {
		return depend;
	}

	public void setDepend(String depend) {
		this.depend = depend;
	}
	
	public String getGo() {
		return go;
	}

	public void setGo(String go) {
		this.go = go;
	}

	public int getDown() {
		return down;
	}

	public void setDown(int down) {
		this.down = down;
	}

	public void show(){
		System.out.println("The depend is : " + getDepend() + " and the down is : " + getDown() +
				" and Let Go is : " + getGo());
		System.out.println("NewObject A : " + getNewObject().getX() + " NewObject B : " + getNewObject().getY());
		System.out.println("NewObject A : " + getNewObject2().getX() + " NewObject B : " + getNewObject2().getY());
		for(NewCollection col : newCollection){
			System.out.println("A is : " + col.getA() + " B is : " + col.getB() + " C is : " + col.getC());
		}
	}
	
	public int valueGo(){
		return down;
	}

	@Override
	public void setBeanName(String name) {
		name = "Blank Name";
		System.out.println("Bean name is : " + name);
	}

	@Override
	public void setApplicationContext(ApplicationContext applicationContext)
			throws BeansException {
		this.context = applicationContext;
		System.out.println("Context is : " + context);
	}

	@Override
	public void destroy() throws Exception {
		System.out.println("Destory of Disposal Called ...");
	}

	@Override
	public void afterPropertiesSet() throws Exception {
		System.out.println("Initializer Called ...");
	}
	
	public void myInit(){
		System.out.println("My function myInit Called ...");
	}

	public void myDestroy(){
		System.out.println("My own function myDestory Called ...");
	}

	@Override
	public void must() {
		System.out.println("This is Dependency Class ...");
	}
}
