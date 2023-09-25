package my.manu.enties;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Entity
@Table(name="Product_tab")
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class Product 
{
	@Id
	private String productId;
	private String productName;
	private double productPrice;

}
