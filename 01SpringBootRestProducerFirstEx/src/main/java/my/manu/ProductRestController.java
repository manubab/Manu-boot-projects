package my.manu;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PatchMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/product")
public class ProductRestController 
{
	
	@GetMapping("/fetch")
	public ResponseEntity<String> getProduct()
	{
		
		 ResponseEntity<String> response =new ResponseEntity<String>("From Fetch Method ",HttpStatus.OK);
		
		return response;
	}
	
	
	@PostMapping("/save")
	public ResponseEntity<String> saveProduct()
	{
		
		 ResponseEntity<String> response =new ResponseEntity<String>("From save Method ",HttpStatus.OK);
		
		return response;
	}
	
	
	@PutMapping("/update")
	public ResponseEntity<String> updateProduct()
	{
		
		 ResponseEntity<String> response =new ResponseEntity<String>("From update Method ",HttpStatus.OK);
		
		return response;
	}
	
	
	@DeleteMapping("/delete")
	public ResponseEntity<String> deleteProduct()
	{
		
		 ResponseEntity<String> response =new ResponseEntity<String>("From delete Method ",HttpStatus.OK);
		
		return response;
	}
	
	
	@PatchMapping("/updateCost")
	public ResponseEntity<String> patchUpdateProduct()
	{
		
		 ResponseEntity<String> response =new ResponseEntity<String>("From patch Method ",HttpStatus.OK);
		
		return response;
	}
	
	
	
	
	
	
	

}
