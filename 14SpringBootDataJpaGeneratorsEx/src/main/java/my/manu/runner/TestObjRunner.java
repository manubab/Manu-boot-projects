package my.manu.runner;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import my.manu.entites.Product;
import my.manu.repo.ProductRepo;
@Component
public class TestObjRunner implements CommandLineRunner{


	@Autowired
	private ProductRepo repo;
	
	
	public void run(String... args) throws Exception 
	{
		
		Product p1=new Product();
		
		p1.setProdName("Pen");
		p1.setProdCost(300.0);
		
		p1=repo.save(p1);
		
		System.out.println(p1.getProdId());
	
	}

}
