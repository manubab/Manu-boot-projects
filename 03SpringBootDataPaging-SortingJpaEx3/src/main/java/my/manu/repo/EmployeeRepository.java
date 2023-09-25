package my.manu.repo;

import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.PagingAndSortingRepository;

import my.manu.entites.Employee;

public interface EmployeeRepository extends PagingAndSortingRepository<Employee, String>,CrudRepository<Employee, String> 
{
	

}	


