package com.hexaware.controller;

import java.io.IOException;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.hexaware.ObjectFactory;
import com.hexaware.model.bean.User;
import com.hexaware.model.business.UserService;
import com.hexaware.model.business.UserServiceImpl;

/**
 * Servlet implementation class StoreServlet
 */
@WebServlet("/StoreServlet")
public class StoreServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;     
   
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		User user = new User(-1, request.getParameter("n1"), request.getParameter("n2"), null);
		DateTimeFormatter dtf = DateTimeFormatter.ofPattern("d/MM/yyyy");
		LocalDate dob = LocalDate.parse(request.getParameter("n3"), dtf);
		user.setDob(dob);
		ObjectFactory factory = new ObjectFactory();
		//UserService service = new UserServiceImpl();
		UserService service = (UserService)factory.createObject("service");
		int status = service.store(user);
		
		if (status > 0) {
			request.setAttribute("msg", "stored successfully");
			request.getRequestDispatcher("login.jsp").forward(request, response);
		} else {
			request.setAttribute("msg", "Sorry User not stored");
			request.getRequestDispatcher("register.jsp").forward(request, response);
			
		}
	}

}
