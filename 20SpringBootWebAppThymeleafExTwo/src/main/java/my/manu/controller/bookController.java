package my.manu.controller;

import java.util.Arrays;
import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import my.manu.bean.Book;

@Controller

@RequestMapping("/book")
public class bookController {

	@GetMapping("/show")
	public String showData(Model model) {
		Book book1 = new Book(111, "Core Java", "Raghu", 200.0);
		model.addAttribute("book1", book1);
		return "BookData";
	}

	@GetMapping("/list")
	public String bookList(Model model) {

		List<Book> list = Arrays.asList(

				new Book(10, "AA", "XYZ", 200.0), new Book(11, "AB", "XYZ", 300.0), new Book(12, "AC", "XYZ", 400.0),
				new Book(13, "AD", "MNO", 500.0)

		);

		model.addAttribute("list", list);
		return "BookList";

	}

}
