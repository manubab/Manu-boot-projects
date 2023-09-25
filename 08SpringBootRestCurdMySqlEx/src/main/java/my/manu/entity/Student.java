package my.manu.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import jakarta.validation.constraints.Size;
import lombok.Data;

@Data
@Entity
@Table(name="stdtab")
public class Student
{
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer sid;
	
	private String sname;
	
	//@NotNull(message="Name can not be empty")
//	@NotEmpty(message="STUDENT NAME CAN NOT BE EMPTY")
	
	//@NotBlank(message="STUDENT gen CAN NOT BE EMPTY")
	
	
	@Size(min = 2,max = 20,message = "NAME MUST BE 2-6 CHARS ONLY")
	private String sgen;
	
	private String stdCourse;
	
	private String strAddr;

}
