package my.manu.entities;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name="usertab")
public class User {
	@Id
	@Column(name="uid")
	private Integer userId;
	@Column(name="uname")
	private String userName;
	
	@ManyToOne
	//@JoinColumn(name="ridFk",unique = true,nullable = false)
	@JoinColumn(name="ridFk",unique = true)
	private Role rob;
}	