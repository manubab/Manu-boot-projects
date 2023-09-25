package my.app;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main 
{
	public static void main(String[] args) {
		
		
		ApplicationContext ac=new ClassPathXmlApplicationContext("config.xml");
		
		
		OracleCon con=ac.getBean("con",OracleCon.class);
		
		
		System.out.println(con);
		
	}

}
