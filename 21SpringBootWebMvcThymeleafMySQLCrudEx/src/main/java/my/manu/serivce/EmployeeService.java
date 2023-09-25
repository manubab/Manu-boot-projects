package my.manu.serivce;

import java.util.List;
import org.springframework.stereotype.Service;
import my.manu.entity.Employee;
import my.manu.exception.EmployeeNotFound;

@Service
public interface EmployeeService 
{
	Integer saveEmployee(Employee e);
	
	void updateEmployee(Employee e);
	
	void deleteEmployee(Integer id) throws EmployeeNotFound;
	
	
	Employee getOneEmployee(Integer id) throws EmployeeNotFound;
	
	List<Employee> getAllEmployees();
	
//	List<Employee> getAllEmployees();
//	
//	Page<Employee> getAllEmployees(Pageable pegeable);
//	
	

	
}
