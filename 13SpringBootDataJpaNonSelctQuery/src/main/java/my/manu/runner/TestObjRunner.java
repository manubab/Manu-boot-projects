package my.manu.runner;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import my.manu.entites.Product;
import my.manu.repo.ProductRepo;
@Component
public class TestObjRunner implements CommandLineRunner
{
	
	@Autowired
	ProductRepo repo;

	@Override
	public void run(String... args) throws Exception {
	
		repo.save(new Product(111,"AA",300.0));
		
		int count=repo.updateNameById("BB", 111);
		
		System.out.println(count);
		
		
		
//		int count2 = repo.removeById(111);
//		System.out.println(count2);
		
	}
	
	

}
