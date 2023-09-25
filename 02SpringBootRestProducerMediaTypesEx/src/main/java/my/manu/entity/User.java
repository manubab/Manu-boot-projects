package my.manu.entity;

import java.util.Map;
import java.util.Set;

import com.fasterxml.jackson.annotation.JsonProperty;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;


@Data
@NoArgsConstructor
@AllArgsConstructor
public class User
{
//	@JsonProperty("user-id")
	private String userId;
	private String userName;
	private String uerdept;
//	@JsonIgnore
	private String password;
	
	
	private Set<String> permissions;
	
	private Map<String,String> models;

}
