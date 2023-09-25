package my.manu.enties;

import org.springframework.stereotype.Component;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Data;

@Entity
@Component
@Data
@Table(name="Manu_data")
public class Student 
{
	@Id
	private String sId;
	private String sName;
	private String sBranch;

}
