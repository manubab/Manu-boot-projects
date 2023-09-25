package my.manu.entity;

import java.util.List;
import java.util.Map;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class Employee 
{ 
	
	private Integer employeeId;
	private String employeeName;
	private Double employeeSalary;
	
	
	private Address addr;
	
	private List<String> projects;
	
	private Map<String,String> codes;
	
	

}
