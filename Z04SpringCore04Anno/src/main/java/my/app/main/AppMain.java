package my.app.main;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import my.app.HandlerInfo;


public class AppMain
{
	public static void main(String[] args) {
		
		
		AnnotationConfigApplicationContext ac=	new AnnotationConfigApplicationContext();
		
		ac.scan("my.*");
		ac.refresh();
		
	HandlerInfo hob=ac.getBean("hob",HandlerInfo.class);
	
	System.out.println(hob);
		
		
	}

}
