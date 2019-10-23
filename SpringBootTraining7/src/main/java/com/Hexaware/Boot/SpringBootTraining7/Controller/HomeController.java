package com.Hexaware.Boot.SpringBootTraining7.Controller;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import com.Hexaware.Boot.SpringBootTraining7.Model.Employee;

@Controller
public class HomeController {
	@Autowired
	EmployeeInterface eif;
	
	@RequestMapping("/eform")
	public String edetails(Employee eobj) {
		eif.save(eobj);
		return "success";
	}
	
	@RequestMapping("/home")
	public String homeData() {
		return "Welcome";
	}
	@RequestMapping("/fetch") 
		public String fetchpage() {
			return "Fetch";
		}
	@RequestMapping("/fetchid")
	public ModelAndView fetchData(@RequestParam int eid) {
		Employee empl = eif.findById(eid).orElse(new Employee());
		ModelAndView mv = new ModelAndView();
		mv.addObject("eobj", empl);
		mv.setViewName("Retreive");
		return mv;
	}
	}
	

