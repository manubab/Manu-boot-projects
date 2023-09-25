package my.app;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class TestApp
{
	public static void main(String[] args) {
		
		AnnotationConfigApplicationContext ac=new AnnotationConfigApplicationContext();
		
		ac.register(MyAppConfig.class);
		ac.refresh();
		
//		 Object o1= ac.getBean("getRepo2",MyRepository.class);
//		 System.out.println(o1);
//		 
		 
		 Object o2= ac.getBean("get01",MyRepository.class);
		 System.out.println(o2);
		 
		
			Object o = ac.getBean(MyService.class);
			System.out.println(o);
		
	  
	
	}

}
