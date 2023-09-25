package my.manu.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import my.manu.entity.Employee;
import my.manu.exception.EmployeeNotFound;
import my.manu.serivce.EmployeeService;

@Controller
@RequestMapping("/emp")
public class EmployeeController {

	@Autowired
	EmployeeService ser;

	@GetMapping("/register")
	public String showRegPage() {

		return "EmployeeRegister";
	}

	@PostMapping("/save")
	public String saveData(@ModelAttribute Employee employee, Model model) {

		Integer id = ser.saveEmployee(employee);
		String message = new StringBuffer().append(" Employee'").append(id).append("' CREATED").toString();

		model.addAttribute("message", message);

		return "EmployeeRegister";

	}

	@GetMapping("/show")
	public String showData(Model model, @RequestParam(value = "message", required = false) String message) {

		List<Employee> list = ser.getAllEmployees();

		model.addAttribute("list", list);

		return "EmployeeData";

	}

	@GetMapping("/delete")
	public String deleteData(

			@RequestParam("id") Integer employeeId, RedirectAttributes attributes) {
		String msg = null;

		try {
			ser.deleteEmployee(employeeId);
			msg = "Employee'" + employeeId + "'Deleted";
		} catch (EmployeeNotFound e) {
			e.printStackTrace();

			msg = e.getMessage();
		}

		attributes.addAttribute("msg", msg);

		return "redirect:show";
	}

	
	
	
//	@GetMapping("/edit")
//	public String showEdit(
//
//			@RequestParam("id") Integer employeeId, Model model, RedirectAttributes attributes) {
//		String page = null;
//		try {
//
//			Employee employee = ser.getOneEmployee(employeeId);
//
//			model.addAttribute("employee", employee);
//
//			page = "EmployeeEdit";
//
//		} catch (EmployeeNotFound e) {
//
//			e.printStackTrace();
//			attributes.addAttribute("msg", e.getMessage());
//
//			page = "redirect:show";
//		}
//		return page;
//
//	}
//	
//	@PostMapping("/update")
//	public String updateData(@ModelAttribute Employee employee,
//			RedirectAttributes attributes) {
//		ser.updateEmployee(employee);
//		attributes.addAttribute("msg","Employee '"+employee.getEmployeeId()+"'updated");
//		return "redirect:show";
//	}
	
	
	
	
	
	@GetMapping("/edit")
	public String showEdit(
			@RequestParam("id") Integer employeeId,
			Model model,
			RedirectAttributes attributes
			) 
	{
		String page = null;
		try {
			Employee employee = ser.getOneEmployee(employeeId);
			model.addAttribute("employee", employee);
			//for dynamic drop down
			
			page = "EmployeeEdit";
		} catch (EmployeeNotFound e) {
			e.printStackTrace();
			attributes.addAttribute("message", e.getMessage());
			page = "redirect:all";
		}
		return page;
	}
	
	
	//6. Update Form data and submit
	@PostMapping("/update")
	public String updateData(
			@ModelAttribute Employee employee,
			RedirectAttributes attributes
			) 
	{
		ser.updateEmployee(employee);
		attributes.addAttribute("message", "Employee '"+employee.getEmployeeId()+"' Updated!");
		return "redirect:all";
	}
	
	

}
