package my.manu.repo;

import org.springframework.data.jpa.repository.JpaRepository;

import my.manu.entity.Employee;

public interface EmployeeRepo extends JpaRepository<Employee, Integer>
{
	
}


