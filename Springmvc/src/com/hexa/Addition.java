package com.hexa;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class Addition {
	ModelAndView mv = new ModelAndView();
	
	@RequestMapping("/add")
	public ModelAndView sum(HttpServletRequest request, HttpServletResponse response) {
		System.out.println("Added");
		int a = Integer.parseInt(request.getParameter("n1"));
		int b = Integer.parseInt(request.getParameter("n2"));
		int result = a+b;
		
		//ModelAndView mv = new ModelAndView();
		mv.setViewName("display.jsp");
		mv.addObject("sum", result);
		return mv;
	}
	@RequestMapping("/validate")
	public ModelAndView validate(HttpServletRequest request, HttpServletResponse response) {
		//System.out.println("Added");
		String name = request.getParameter("n1");
		String password = request.getParameter("n2");
		if(name.equalsIgnoreCase("daksh") && password.equals("daksh123")) {
		mv.setViewName("display.jsp");
		mv.addObject("name", name);
		} else {
			mv.setViewName("display.jsp");
			mv.addObject("name", "Sorry");
		}
		return mv;
	}
		
	}

