package my.app;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Test 
{
	public static void main(String[] args) {
		
		
		AnnotationConfigApplicationContext ac=new AnnotationConfigApplicationContext(MyConfig.class);
		
		Object ob=ac.getBean("dbcon");
		
		System.out.println(ob);
	}

}
