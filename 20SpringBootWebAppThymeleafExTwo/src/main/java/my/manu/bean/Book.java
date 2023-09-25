package my.manu.bean;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class Book
{
	private Integer bookId;
	private String bookName;
	private String bookAuth;
	private Double bookCost;
	
	
	

}
