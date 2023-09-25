package my.manu.rest;

import java.util.List;
import java.util.Map;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import my.manu.entity.Address;
import my.manu.entity.Employee;


@RestController
@RequestMapping("/emp")
public class EmployeeRestController 
{
	@GetMapping("/find")
	public ResponseEntity<Employee> getOneEmployee()
	{
		Employee employee=new Employee(101,"AAAA",300.0,new Address("A/44","Amt,Hyd"),List.of("M1","m2","m3"),Map.of("M1","M111"));
		return new ResponseEntity<>(employee,HttpStatus.OK);
	}
	
	@PostMapping("/create")
	public ResponseEntity<String> createEmployee(	
			@RequestBody Employee employee)
	{
		String s=employee.toString();
		ResponseEntity<String> response=new ResponseEntity<String>(s,HttpStatus.OK);
		return response;
		
	}
	

}
