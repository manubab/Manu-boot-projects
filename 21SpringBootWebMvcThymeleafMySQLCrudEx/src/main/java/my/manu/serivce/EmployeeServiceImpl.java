package my.manu.serivce;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

import my.manu.entity.Employee;
import my.manu.repo.EmployeeRepo;
@Service
@Component
public class EmployeeServiceImpl implements EmployeeService {

	
	@Autowired
	EmployeeRepo repo;
	
	@Override
	public Integer saveEmployee(Employee e) {
		e=repo.save(e);
		
		return e.getEmployeeId();
	}

	@Override
	public void updateEmployee(Employee e) {
	
	  repo.save(e);
    
	}

	@Override
	public void deleteEmployee(Integer id) 
	{
		
	  repo.delete(this.getOneEmployee(id));
	

	}
	
	
	public Employee getOneEmployee(Integer id)
	{
	Optional<Employee> e=	repo.findById(id);
	
	return e.get();
	


	
	}

	@Override
	public List<Employee> getAllEmployees() {
		List<Employee> list=repo.findAll();
		return list;
	}
	
	
	
	
	
//		@Override
//	public List<Employee> getAllEmployees() {
//	
//	return null;
//}
//
//@Override
//public Page<Employee> getAllEmployees(Pageable pegeable) {
//	
//	return null;
//}

}
