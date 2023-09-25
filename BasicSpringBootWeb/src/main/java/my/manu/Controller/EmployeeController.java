package my.manu.Controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import my.manu.bean.Employee;

@Controller
@RequestMapping("/emp")
public class EmployeeController
{
	
	@GetMapping("/show")
	public String showFrom()
	{
		return "EmployeeFrom";
	}
	
	@PostMapping("/get")
	public String getData(@ModelAttribute Employee employee,
			Model model)
	{
		model.addAttribute("data", employee);
		return "GetData";
		
	}

}
