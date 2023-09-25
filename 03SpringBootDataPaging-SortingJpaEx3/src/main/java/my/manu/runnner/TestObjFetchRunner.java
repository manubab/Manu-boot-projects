package my.manu.runnner;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.core.annotation.Order;
import org.springframework.data.domain.Sort;
import org.springframework.data.domain.Sort.Direction;
import org.springframework.data.domain.jaxb.OrderAdapter;
import org.springframework.stereotype.Component;

import jakarta.persistence.OrderBy;
import my.manu.entites.Employee;
import my.manu.repo.EmployeeRepository;

@Order(30)
//@Component
public class TestObjFetchRunner implements CommandLineRunner {


	@Autowired
	private EmployeeRepository eob;
	
	
	public void run(String... args) throws Exception {
	
	//	eob.findAll().forEach(System.out::println);
		
		
//		Iterable<Employee> list2  = eob.findAll(Sort.by("employeeDesgnation"));                           // order by esal asc
//		list2.forEach(System.out::println);
		
		
		
		//eob.findAll(Sort.by(Direction.DESC, "employeeDesgnation")).forEach(System.out::println);
		
		
		//eob.findAll(Sort.by("employeeDesgnation","employeeSalary")).forEach(System.out::println);
		
		
		//eob.findAll(Sort.unsorted()).forEach(System.out::println);
		
		
		eob.findAll(Sort.by(org.springframework.data.domain.Sort.Order.asc("employeeSalary").desc("employeeName"))).forEach(System.out::println);;
		
		
		
		
		
	}

}
