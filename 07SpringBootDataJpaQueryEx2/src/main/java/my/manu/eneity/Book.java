package my.manu.eneity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;


@AllArgsConstructor
@NoArgsConstructor
@Entity
@Data
@Table(name="bookDetails")
public class Book 
{
	@Id
	@Column(name="b_id")
	private Integer bookId;
	@Column(name="b_name")
	private String bookName;
	@Column(name="b_author")
	private String  bookAuthor;
	@Column(name="b_cast")
	private double bookCast;
	@Column(name="b_type")
	private String bookType;

}
