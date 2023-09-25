package my.manu.entites;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Entity
@Table(name="Book")
@AllArgsConstructor
@NoArgsConstructor
public class Book
{
	@Id
	private String bookId;
	private String bookAutor;
	private String bookName;
	private String boookType;
	private double bookPrice;

}
