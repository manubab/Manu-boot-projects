package my.manu.runner;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import my.manu.entities.DeparmentRepo;
import my.manu.entities.Department;
import my.manu.entities.Employee;
import my.manu.entities.EmployeeRepo;

@Component
public class TestObjRunner implements CommandLineRunner
{
	
	
	@Autowired
	DeparmentRepo dob;
	
	@Autowired
	EmployeeRepo eob;

	
	public void run(String...manu) throws Exception
	{
		
		System.out.println(dob.getClass().getName());
		
		System.out.println(eob.getClass().getName());
		
		Department d1 = new Department(1054,"DEV","AJAY");
		Department d2 = new Department(1055,"QA","SAM");
		Department d3 = new Department(1056,"BA","KUMAR");
		dob.save(d1);
		dob.save(d2);
		dob.save(d3);
		
		
		
		Employee e1 = new Employee(10, "SAM", 500.0, d1);
		Employee e2 = new Employee(11, "RAM", 600.0, d2);
		Employee e3 = new Employee(12, "SYED", 700.0, d3);
		Employee e4 = new Employee(13, "AJAY", 700.0, null);
		
		eob.save(e1);
		eob.save(e2);
		eob.save(e3);
		eob.save(e4);
		
	}

}
