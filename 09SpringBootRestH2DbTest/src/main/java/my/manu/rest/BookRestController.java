package my.manu.rest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import my.manu.entity.Book;
import my.manu.repo.BookRepo;

@RestController
@RequestMapping("/book")
public class BookRestController 
{
	
	@Autowired
	public BookRepo repo;

	@PostMapping("/create")
	public String createBook(@RequestBody Book book)
	{
		repo.save(book);
		
		return "book details inserted";
	}
	
	
	
}
