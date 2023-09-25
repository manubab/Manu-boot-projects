package com.naresh.it.course;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
//@ComponentScan("com.naresh.it")
public class SpringBeanScopeMainApplication {
	public static void main(String[] args) {
		AnnotationConfigApplicationContext ac = new AnnotationConfigApplicationContext();

		ac.scan("com.naresh.it");
		//ac.register(SpringBeanScopeMainApplication.class);
		ac.refresh();

		CourseDetails CD1 = ac.getBean(CourseDetails.class);

		System.out.println(CD1);

		CourseDetails CD2 = ac.getBean(CourseDetails.class);

		System.out.println(CD2);

	}

}
