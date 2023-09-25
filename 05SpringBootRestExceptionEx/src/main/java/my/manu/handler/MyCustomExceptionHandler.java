package my.manu.handler;

import java.util.Date;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;

import my.manu.bean.MyErrorResponse;
import my.manu.exception.ProductNotFoundException;

@RestControllerAdvice
public class MyCustomExceptionHandler
{
	/*@ExceptionHandler(ProductNotFoundException.class)
	public ResponseEntity<String> showCustomException(
			
			ProductNotFoundException pnfg
			
			)
	{
		
		return new ResponseEntity<String>(
				pnfg.getMessage(),HttpStatus.INTERNAL_SERVER_ERROR
				);
	}*/
	
	@ExceptionHandler(ProductNotFoundException.class)
	public ResponseEntity<MyErrorResponse> showCustResponse(
			
			ProductNotFoundException pnfg)
	{
		
		return new ResponseEntity<MyErrorResponse>( new MyErrorResponse(
				
				new Date().toString(),"Exception In Process",500,pnfg.getMessage()),HttpStatus.INTERNAL_SERVER_ERROR);
				
		
	}

}
