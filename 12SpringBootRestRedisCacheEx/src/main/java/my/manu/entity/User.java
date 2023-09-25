package my.manu.entity;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.Id;

import lombok.Data;

@Data
@Entity
public class User implements Serializable
{
	@Id
	private Integer UserId;
	
	private String name;
	
	private String role;

}
