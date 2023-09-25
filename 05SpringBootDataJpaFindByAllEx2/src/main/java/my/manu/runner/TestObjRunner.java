package my.manu.runner;

import java.util.Arrays;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import my.manu.entites.Book;
import my.manu.repo.BookRepository;

@Component
public class TestObjRunner implements CommandLineRunner {

	@Autowired
	BookRepository bob;

	public void run(String... args) throws Exception {
		bob.saveAll(Arrays.asList(

				new Book("CAe1", "Venky", "CoreJava", "Backend", 1000.0),

				new Book("CLe1", "Chaithu", "CLan", "", 600.0),

				new Book("Ade1", "Venky", "Advance", "Backend", 1600.0),

				new Book("Spms", "Raghu", "SpringBoot&Microcervice", "Backend", 1000.0)

		));

		bob.findByBookPrice(1000.0).forEach(System.out::println);

		bob.findByBookAutor("Venky").forEach(System.out::println);

		Optional<Book> b = bob.findByBookName("CoreJava");

		if (b.isPresent()) {
			System.out.println(b.get());
		} else {
			System.out.println("No data Found");
		}

		Optional<Book> b2 = bob.findByBookId("CAe1");

		if (b2.isEmpty()) {
			System.out.println("Data not found");
		} else {
			System.out.println(b2.get());
		}
		
		bob.findByBookPriceLessThanEqual(600.0).forEach(System.out::println);
		
		
		bob.findByBookPriceGreaterThan(1000.0).forEach(System.out::println);
		
		
		bob.findByBookAutorLike("%V").forEach(System.out::println);
		
	}

}
