package com.app;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class TestApp 
{
	public static void main(String[] args) {
		
		ApplicationContext ac=new AnnotationConfigApplicationContext(MyAppConfig.class);
		
		Object o=ac.getBean("conObj");
		
		System.out.println(o);
		
	}

}
