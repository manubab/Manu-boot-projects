package my.app;

import org.springframework.context.annotation.*;

public class MyApp
{
	public static void main(String[] args) {
		
		
		AnnotationConfigApplicationContext ac=new AnnotationConfigApplicationContext(MyConfig.class);
		
		
		
		Object ob1=ac.getBean("cob");
		
		Object ob2=ac.getBean("vob");
		
		System.out.println(ob1);
		
		System.out.println(ob2);
		
	}

}
