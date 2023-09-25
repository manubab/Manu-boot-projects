package my.manu.service;

import org.springframework.stereotype.Service;

import my.manu.entity.Product;
import my.manu.exception.ProductNotFoundException;

@Service
public class ProductService 
{
	
	public Product getOneProductById(Integer id)
	{
		if(id==150)
		{
			return new Product(id,"Dummy");		
	    }
	    else
	    {
	    	throw new ProductNotFoundException("Product '"+id+"'Not Exit");
		
	    }
	}

}
