package my.manu.rest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import my.manu.entity.Product;
import my.manu.exception.ProductNotFoundException;
import my.manu.service.ProductService;

@RestController
@RequestMapping("/pro")
public class ProductRestController {

	@Autowired
	private ProductService service;

	
	/*
	@GetMapping("/one/{id}")
	public ResponseEntity<String> getProductId(

			@PathVariable("id") Integer id) {

		if (id == 150) {
			return new ResponseEntity<String>("Product Exit", HttpStatus.OK);
		} else {
			throw new ProductNotFoundException("Product Not Found " + id);
		}

	}
	*/

	@GetMapping("/one/{id}")
	public ResponseEntity<Product> getProductById(
			@PathVariable("id") Integer id) {
		ResponseEntity<Product> response = null;
		try {
			Product pob = service.getOneProductById(id);
			response = new ResponseEntity<Product>(pob, HttpStatus.OK);
		} catch (ProductNotFoundException pnfg) {
			pnfg.printStackTrace();
			throw new ProductNotFoundException("Product Not Found " + id);
		}
		return response;

	}

}
