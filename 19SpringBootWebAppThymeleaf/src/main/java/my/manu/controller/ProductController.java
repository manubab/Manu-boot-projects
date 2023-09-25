package my.manu.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/prod")
public class ProductController {

	@GetMapping("/data")
	public String showData(Model model) {

		model.addAttribute("prodCode", "SAMPLE -XE");

		return "ProductData";
	}

}
