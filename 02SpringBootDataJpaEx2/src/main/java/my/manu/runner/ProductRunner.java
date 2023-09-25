package my.manu.runner;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import my.manu.enties.Product;
import my.manu.repo.ProductRepository;

@Component
public class ProductRunner implements CommandLineRunner {

	@Autowired
	ProductRepository repo;

	public void run(String... args) throws Exception {
		System.out.println(repo.getClass().getName());

//		Product p1=new Product("E121","EggBoiler",340.0);
//		
//		Product p2=new Product("S321","Bag",990.0);
//		
//		Product p3=new Product("E121","Mirrer",50.0);
//		
//		
//		repo.saveAll(Arrays.asList(p1,p2,p3));
//		

//		System.out.println(repo.count());

//		Iterable<Product> list = repo.findAll();
//
//		list.forEach(System.out::println);

		// System.out.println(repo.existsById("S321"));

		Optional<Product> opl = repo.findById("E121");

		if (opl.isPresent()) {
			System.out.println(opl.get());
		}
		
		repo.deleteAll();

	}

}
