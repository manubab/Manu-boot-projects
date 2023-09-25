package my.manu.runnner;

import java.util.Arrays;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;

import my.manu.entites.Employee;
import my.manu.repo.EmployeeRepository;

//@Component
@Order(10)
public class TestObjSaveRunner implements CommandLineRunner {

	@Autowired
	EmployeeRepository eob;

	public void run(String... args) throws Exception {
		eob.saveAll(Arrays.asList(

				new Employee("A121", "Janu", "Juni", 1000.0), new Employee("A122", "sona", "QA", 3000.23),
				new Employee("A123", "Manon", "Aws", 2000.0), new Employee("A124", "Rani", "Dev", 4000.0),

				new Employee("A109", "manu", "Juni", 1000.0)
				,
				new Employee("A143", "sonu", "Juni", 1000.0)
				
				
		));

	}

}
