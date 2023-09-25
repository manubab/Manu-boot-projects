package my.manu.repo;

import org.springframework.data.jpa.repository.JpaRepository;

import my.manu.entites.Product;

public interface ProductRepo extends JpaRepository<Product, Integer>{

}
