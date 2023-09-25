package my.app;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class MyTest
{
	public static void main(String[] args) {
		
		AnnotationConfigApplicationContext ac=new AnnotationConfigApplicationContext(MyAppConfig.class);
		
		Process p=ac.getBean("process",Process.class);
		
		System.out.println(p);
	
		}

}
