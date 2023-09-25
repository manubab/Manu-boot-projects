package my.manu.runner;

import java.util.Arrays;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.Map;
import java.util.Set;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import my.manu.entities.Product;
import my.manu.repo.ProductRepository;

@Component
public class ProductObjRunner implements CommandLineRunner {

	@Autowired
	ProductRepository pob;
	
	public void run(String... manu) throws Exception {

		Product product = new Product();
		
		product.setProductId(112);
		product.setProductCode("Mouse");
		
		product.setColours(Arrays.asList("gn","rd","bl"));
		
		Map<String,String> map=new LinkedHashMap();
		
		map.put("D1", "ABC");
		map.put("D2", "BCD");
		
		Set<String> models= new LinkedHashSet<>();
		
		models.add("M1");
		models.add("LA");
		models.add("UI");
		
		product.setModels(models);
		product.setDetails(map);
		
		
		
		pob.save(product);
		
		
		
	}
	
	
}
