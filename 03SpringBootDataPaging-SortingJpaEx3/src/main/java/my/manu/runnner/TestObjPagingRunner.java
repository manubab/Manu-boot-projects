package my.manu.runnner;

import java.awt.print.Pageable;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.core.annotation.Order;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.stereotype.Component;

import my.manu.entites.Employee;
import my.manu.repo.EmployeeRepository;

@Order(50)
@Component
public class TestObjPagingRunner implements CommandLineRunner {
	@Autowired
	EmployeeRepository eob;

	public void run(String... args) throws Exception {

		PageRequest p = PageRequest.of(4, 4);

		// output
		Page<Employee> page = eob.findAll(p);
        
	
		
		page.getContent().forEach(System.out::println);
		
		System.out.println(page.isFirst());
		System.out.println(page.isLast());
		System.out.println(page.isEmpty());
		System.out.println(page.hasNext());
		System.out.println(page.hasPrevious());
		System.out.println(page.getTotalPages());
		System.out.println(page.getTotalElements());
		System.out.println(page.getSize());
		System.out.println(page.hasContent());
	}
	

}
