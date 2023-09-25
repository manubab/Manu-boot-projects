package my.manu.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("prod")
public class ProdController 
{
	@GetMapping("/data")
	public String showProd()
	{
		return "ProdData";
	}

}
