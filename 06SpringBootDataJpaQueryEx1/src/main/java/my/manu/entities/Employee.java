package my.manu.entities;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Entity
@Table(name="Employee_Dept_Tab")
@AllArgsConstructor
@NoArgsConstructor
public class Employee
{
	@Id
	private Integer employeeId;
	
	private String employeeName;
	
	private Double employeeSalaty;
	
	private String employeeDept;
	
	
	

}
