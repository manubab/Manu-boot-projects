package my.manu.runner;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.core.annotation.Order;
import org.springframework.data.domain.Example;
import org.springframework.stereotype.Component;

import my.manu.enties.Student;
import my.manu.repo.StudentRepository;

@Component
@Order(10)
public class TestObjRunner implements CommandLineRunner
{
	
	
	@Autowired
	StudentRepository sob;
	
	public void run(String ...args)throws Exception
	{
		
		SimpleDateFormat sdf = new SimpleDateFormat("dd/MMM/yy");
		String s = sdf.format(new Date());
		System.out.println(s);
		
		
		Student s1 = new Student();
		s1.setStudentId("J0019");
		s1.setStudentName("SAM");
		s1.setStudentFees(400.0);
		s1.setStudentCource("java");
		s1.setDate(new Date());
		sob.save(s1);
		
		
		
		
		List<Student> list = sob.findAll();
		System.out.println(list.getClass().getName());
		list.forEach(System.out::println);
		
		
		Student s4=new Student();
		
		s4.setStudentFees(400.0);
		s4.setStudentName("SAM");
		
		Example<Student> ex=Example.of(s4);
		
		sob.findAll(ex).forEach(System.out::println);
		
		
	}
	
	
	

}
