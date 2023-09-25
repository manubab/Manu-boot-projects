package my.app.main;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import my.app.ViewResolver;

public class AppMain
{
	
	public static void main(String[] args) 
	{
		ApplicationContext con=new ClassPathXmlApplicationContext("config.xml");
		
		ViewResolver ob=con.getBean("ob",ViewResolver.class);
		
		System.out.println(ob);
		
	}
	

}
