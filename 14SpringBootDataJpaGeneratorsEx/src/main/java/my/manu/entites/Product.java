package my.manu.entites;

import org.hibernate.annotations.GenericGenerator;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Data;

@Data
@Entity
@Table(name="product_table")
public class Product
{
	
	
	@Id
	//@GeneratedValue(strategy = GenerationType.AUTO)
	@GeneratedValue(generator = "test")
	@GenericGenerator(name="test",strategy = "my.manu.gen.MyCustomGen")                                              
	private String prodId;
	
	private String prodName;
	
	private Double prodCost;

}
