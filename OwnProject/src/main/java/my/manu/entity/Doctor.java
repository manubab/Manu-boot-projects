package my.manu.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Data;

@Entity
@Data
@Table(name="doctor_data")
public class Doctor 
{
	@Id
	private String doctorId;
	
	private String doctorName;
	
	private String doctorDepatment;
	
	private String  doctorhospitalName;
	

}
