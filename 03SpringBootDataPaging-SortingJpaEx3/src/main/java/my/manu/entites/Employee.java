package my.manu.entites;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.NonNull;
import lombok.RequiredArgsConstructor;

@Data
@Table(name="Emp_data")
@Entity
@AllArgsConstructor
@NoArgsConstructor
public class Employee 
{
	@Id
	private String empployeeId;

	private String employeeName;
	
	private String employeeDesgnation;

	private Double employeeSalary;

}
