package my.manu.Controller;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.Set;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import my.manu.entity.Role;
import my.manu.entity.User;



@RestController
@RequestMapping("/user")
public class UserRestController 
{
	
	@GetMapping("/one")
	public ResponseEntity<User> getData()
	{
		
		User ob=new User("101","ABC","Dev","Password",Set.of("Manu","dad","bro","mom"),
				Map.of("Father","Rangadu","Mother","Pullamma")
				);
		
		ResponseEntity<User> reponse =new ResponseEntity<User>(ob,HttpStatus.OK);
		
		return reponse;
		
	}
	@GetMapping("list")
	public ResponseEntity<List<Role>> getRoles()
	{
		List<Role> roles=Arrays.asList(
				
				new Role(1011,"Dav"),
				new Role(2002,"Qa"));
		
		ResponseEntity<List<Role>> response =new ResponseEntity<>(roles,HttpStatus.OK);
		
		return response;
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	

}
