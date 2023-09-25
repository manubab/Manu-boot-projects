package my.manu.enties;

import java.util.Date;

import org.springframework.stereotype.Component;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import jakarta.persistence.Temporal;
import jakarta.persistence.TemporalType;
import lombok.Data;

@Data
@Entity
@Table(name="Student_Document")
@Component
public class Student 
{
	
	@Id
	private String studentId;
	
	private String studentName;
	private String studentCource;
	private double studentFees;
	
	
	@Temporal(TemporalType.TIMESTAMP)
	private Date date;

}
