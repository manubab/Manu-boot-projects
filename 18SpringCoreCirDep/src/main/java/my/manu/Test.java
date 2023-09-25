package my.manu;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Test 
{
	public static void main(String[] args) {
		
		AnnotationConfigApplicationContext ac=new AnnotationConfigApplicationContext("D:\\Ashok iT\\18SpringCoreCirDep\\src\\main\\java\\my\\manu\\resources\\beans.xml");
		Employee e= ac.getBean(Employee.class);
		System.out.println(e);
	}

}
