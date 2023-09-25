package my.manu.repo;

import org.springframework.data.jpa.repository.JpaRepository;

import my.manu.enties.Product;

public interface ProductRepository extends JpaRepository<Product, String> {

}
