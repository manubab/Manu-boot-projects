package my.app.test;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import my.app.config.MyAppConfig;

public class TestApp 
{
	public static void main(String[] args) {
		
//		ClassPathXmlApplicationContext ac=new ClassPathXmlApplicationContext("beans.xml");
		
		
		AnnotationConfigApplicationContext  ac=new AnnotationConfigApplicationContext(MyAppConfig.class);
      //  ac.refresh();
        Object ob=ac.getBean("eobj");
        System.out.println(ob);
        
        ac.close();
	}

}
