package my.manu.repo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;

import jakarta.transaction.Transactional;
import my.manu.entites.Product;

public interface ProductRepo extends JpaRepository<Product, Integer> 
{
	@Transactional
	@Modifying
	@Query("update Product set productName=:productName where productId=:productId")
	int updateNameById(String productName,Integer productId);
	
	
	@Transactional //we need to define on top of service layer
	@Modifying
	@Query("DELETE Product WHERE productId=:productId")
	int removeById(Integer productId);
}

