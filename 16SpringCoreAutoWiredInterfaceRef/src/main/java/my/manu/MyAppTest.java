package my.manu;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class MyAppTest
{
	public static void main(String[] args) 
	{
		AnnotationConfigApplicationContext ac=new AnnotationConfigApplicationContext(MyAppConfig.class);
	   Format format= ac.getBean(Format.class);	
		format.processDoneOrNot();
	}

}
