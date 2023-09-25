package my.manu.repo;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import my.manu.entities.Employee;

public interface EmployeeRepository extends JpaRepository<Employee, Integer>
{
	  
	 
	  
//	  @Query("select e from Employee e")
//      public List<Employee> getAllDetails();
	  
	  @Query("select e.employeeName from Employee e")
	  public List<String> getAllEmployeeNames();
	  
	  
	  @Query("select e.employeeName,e.employeeSalaty from Employee e")
	  public Object [] getAllEmployeeNamesSalary();
	  
	  
	  
	  @Query("SELECT e.employeeId, e.employeeName FROM Employee e")
		public List<Object[]> fetchIdAndNames();
	
		
		
		@Query("SELECT  e.employeeId , e.employeeName from Employee e where e.employeeId=:id")                      
		public Object [] fetchOurRequiredData(Integer id);

}