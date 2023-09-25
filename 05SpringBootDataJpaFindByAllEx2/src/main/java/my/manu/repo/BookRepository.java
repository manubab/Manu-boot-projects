package my.manu.repo;

import java.util.List;
import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;

import my.manu.entites.Book;

public interface BookRepository extends JpaRepository<Book, String> 
{
	List<Book> findByBookPrice(double bookPrice);
	
	
	//List<Book> findByBookAutor1(String bookAutor);
	
	List<Book> findByBookAutor(String bookAutor);
	
	Optional<Book> findByBookName(String bookName);
	
	Optional<Book> findByBookId(String bookId);
	
	
	//List<Book> fingByBookPriceGreaterThan(double bookPrice);
	
	List<Book> findByBookPriceLessThanEqual(Double bookPrice);
	
	
	
	List<Book> findByBookPriceGreaterThan(Double bookPrice);
	
	
	List<Book> findByBookAutorLike(String expression);
	

}
