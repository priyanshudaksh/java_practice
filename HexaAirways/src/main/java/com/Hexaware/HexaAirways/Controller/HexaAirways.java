package com.Hexaware.HexaAirways.Controller;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;


import com.Hexaware.HexaAirways.Pojo.Flight;
import com.Hexaware.HexaAirways.Pojo.User;



@Controller
public class HexaAirways {

	@Autowired
	UserInterface uif;
	
	@Autowired
	FlightInterface fif;
	
	@RequestMapping("/home")
	public String homeData() {
		return "index";
	}
	@RequestMapping("/Register")
	public String Register() {
		return "Register";
	}
	@RequestMapping(value="/Login")
	public String Login(String email, String password,HttpSession session) {
		
		User user = uif.finduser(email, password);
		if(user !=  null) {
			session.setAttribute("name",user.getName());
			return "logged";
		}
		
		
		return "login";
	} 
	@RequestMapping(value="/bookflight")
	public String BookFlight(String source,String destination ,CharSequence doj,String category,String passangers ,HttpSession session) {
		LocalDate dob = LocalDate.parse(doj);
		int nob = Integer.parseInt(passangers);
		List<Flight> flight = fif.findflight(source, destination, dob, category, nob);
		System.out.println(flight);
		if(flight != null) {
			session.setAttribute("flight", flight);
			return "flightresult";
			
		}
		
		
		return "logged";
		
		
		
		
	}
	
		//@RequestMapping(value="/login", method = RequestMethod.POST)
//    public String showWelcomePage(ModelMap model, @RequestParam String name, @RequestParam String password){
//
//        boolean isValidUser = service.validateUser(name, password);
//
//        if (!isValidUser) {
//            model.put("errorMessage", "Invalid Credentials");
//            return "login";
//        }
//
//        model.put("name", name);
//        model.put("password", password);
//
//        return "welcome";
//    }
	
	@RequestMapping("/Admin")
	public String Admin() {
		return "adminlogin";
	}
	@RequestMapping("/RegisterDetails")
	public String RegisterDetails(User user) {
		uif.save(user);
		return "login";
	}
	
}
