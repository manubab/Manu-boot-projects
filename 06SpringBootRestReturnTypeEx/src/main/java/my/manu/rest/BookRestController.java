package my.manu.rest;

import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import my.manu.Book;

@RestController
@RequestMapping("/book")
public class BookRestController 
{
	
	
	@GetMapping("/obj/{id}")
	public ResponseEntity<?> findBookById(
			
			@PathVariable Integer id
			)
	{
		ResponseEntity<?> response=null;
		
		HttpHeaders headers=new HttpHeaders();
		
		if(id==200)
		{
			headers.add("found", "yes");
			
			response=new ResponseEntity<Book>(new Book(id,"Dummy",500.0),headers,HttpStatus.OK);
		}
		else
		{
			headers.add("found", "no");
			
			response=new ResponseEntity<String>("Soory ! No Book Found",headers,HttpStatus.BAD_REQUEST);
		}
		
		return response;
		
	}
	
	
	
	@GetMapping("/a")
	public String justBody() {
		return "Hello Book Data!";
	}
	
	
	
	@GetMapping("/b")
	public Book justBook() {
		return new Book(10,"AA",200.0);
	}
	
	
	
	
	@GetMapping("/data")
	public ResponseEntity<String> showInfo()
	{
		//ResponseEntity<String> response=new ResponseEntity<>(HttpStatus.OK);
		
		String body="Manu ur great ra";
		
		//ResponseEntity<String> response=new ResponseEntity<>(body,HttpStatus.OK);

		
		HttpHeaders hd=new HttpHeaders();
		
		hd.add("MyAppOne", "Activated-client");
		
	//	ResponseEntity<String> response=new ResponseEntity<>(hd,HttpStatus.OK);

		
		ResponseEntity<String> response=new ResponseEntity<>(body,hd,HttpStatus.OK);

		
		
		return response;
	}
	

}
