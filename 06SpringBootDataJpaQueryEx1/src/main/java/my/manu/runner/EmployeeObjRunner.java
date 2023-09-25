package my.manu.runner;

import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import my.manu.entities.Employee;
import my.manu.repo.EmployeeRepository;

@Component
public class EmployeeObjRunner implements CommandLineRunner
{
	
	@Autowired
	EmployeeRepository repo;

	public void run(String ...args)throws Exception
	{
		
		repo.saveAll(List.of(
				
				new Employee(111,"Manu",2300.0,"Dev"),
				new Employee(222,"Janu",4300.0,"Qa"),
				new Employee(333,"Madhan",2700.0,"AWS"),
				new Employee(555,"ram",4560.0,"Ui"),
				new Employee(777,"Rajan",8900.0,"Python"),
				new Employee(666,"Ravindra",8560.0,"Actnt"),
				new Employee(888,"Sonu",1100.0,"Java"),
				new Employee(999,"Tarun",9060.0,".Net")
				
	)
				
	);
		System.out.println(" Manu ur great persion ra");
		
		
//		repo.getAllDetails().forEach(System.out::println);
		
		
		repo.getAllEmployeeNames().forEach(System.out::println);
		
		System.out.println("All Names and salaries");
		
		
//	   Object[] o=	repo.getAllEmployeeNamesSalary();
//	
		
	List<Object []>	o=repo.fetchIdAndNames();
	
	
	Iterator<Object[]> it=o.iterator();
	
	while(it.hasNext())
	{
		System.out.println(Arrays.toString(it.next()));
	}
	
	Object[] o1=repo.fetchOurRequiredData(555);
	   
     	System.out.println(Arrays.deepToString(o1));

		}
}
