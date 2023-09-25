package my.app.main;

import org.springframework.context.support.ClassPathXmlApplicationContext;

import my.app.*;

import org.springframework.context.ApplicationContext;

public class AppMain 
{
	public static void main(String[] args) {
		
		
		ApplicationContext ac=new ClassPathXmlApplicationContext("config.xml");
		
		System.out.println(ac.getBean("ser",Service.class));
	}

}
