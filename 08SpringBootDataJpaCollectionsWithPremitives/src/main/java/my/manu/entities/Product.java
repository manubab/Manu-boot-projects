package my.manu.entities;

import java.util.List;
import java.util.Map;
import java.util.Set;

import jakarta.persistence.ElementCollection;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Data;

@Data
@Entity
@Table(name="prod_tab")
public class Product
{
	@Id
	private Integer productId;
	private String productCode;
	
	@ElementCollection
	private List<String> colours;
	
	@ElementCollection
	private Set<String> models;
	
	@ElementCollection
	private Map<String,String> details;
}
