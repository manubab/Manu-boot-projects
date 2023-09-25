package my.manu.controler;

import java.util.Arrays;
import java.util.List;
import java.util.Map;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import my.manu.bean.User;

@Controller

public class UserControler 
{
	@RequestMapping(value="/home",method = RequestMethod.GET)
	public String showUserPage(
			//Model model
			//ModelMap model
			Map<String,Object> model
			)
	{
		System.out.println(model.getClass().getName());
		model.put("uname","Manu");
		model.put("cname", "Java");
		return "UserHome";
	}
	@RequestMapping(value="/obj",method = RequestMethod.GET)
	public String showUserObj(Model model)
	{
		User user=new User(111,"Manu","TAG-SY");
		model.addAttribute("user",user);
		List<User> list = Arrays.asList(
				new User(10,"AA","XYZ"),
				new User(11,"AB","XYZ"),
				new User(12,"AC","MNO"),
				new User(13,"AD","MNO")
				);
		model.addAttribute("listObj", list);
		return "UserData";
	}

}
