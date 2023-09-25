package my.manu.rest;

import java.util.Enumeration;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestHeader;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import jakarta.servlet.http.HttpServletRequest;

@RestController
@RequestMapping("product")
public class ProductRestController {

	
	
	
	@GetMapping("/dataa")
	public ResponseEntity<String> showDataA(

			@RequestParam("pid") Integer id, @RequestParam("pname") String s) {

		System.out.println("PID :" + id + " pname " + s);

		return new ResponseEntity<String>("PID :" + id + "Pname :" + s, HttpStatus.OK);
	}
	
	@GetMapping("/datab/{id}/{name}")
	public ResponseEntity<String> showDataB(
			
			@PathVariable("id") Integer id,
			@PathVariable("name") String name
			)
	{
		
		return new ResponseEntity<String>("pid :"+id+"pname :"+name,HttpStatus.OK);	
	}
	
	@PostMapping("/details")
	public ResponseEntity<String> showHeaders(
			@RequestHeader("Content-Type")String type,
			@RequestHeader("Content-Length")String len,
			@RequestHeader("Authorization")String auth,
			
			HttpServletRequest req
			) 
	{
		System.out.println(auth);
		Enumeration<String> headerNames = req.getHeaderNames();
		while (headerNames.hasMoreElements()) {
			String hdr =  headerNames.nextElement();
			System.out.println(hdr + " " + req.getHeader(hdr));
		}
		System.out.println("Data " + type +" - "+ len);
		
		
		System.out.println("data" + type +"length :"+len);
		return new ResponseEntity<>("CHECK",HttpStatus.OK);
	}
	
	

}
