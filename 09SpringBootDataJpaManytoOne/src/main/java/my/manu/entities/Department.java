package my.manu.entities;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;


@AllArgsConstructor
@NoArgsConstructor
@Data
@Entity
@Table(name="dept")
public class Department
{
	@Id
	@Column(name="did")
	private Integer deptId;
	@Column(name="dname")
	private String deptName;
	@Column(name="dadmin")
	private String deptAdmin;
}
