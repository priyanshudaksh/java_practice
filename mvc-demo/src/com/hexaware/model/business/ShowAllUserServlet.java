package com.hexaware.model.business;

import java.awt.List;
import java.io.IOException;
import java.util.ArrayList;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


import com.hexaware.ObjectFactory;
import com.hexaware.model.bean.User;

/**
 * Servlet implementation class ShowAllUserServlet
 */
@WebServlet("/ShowAllUserServlet")
public class ShowAllUserServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		//java.util.List<User> userList = new ArrayList<>();
		ObjectFactory factory = new ObjectFactory();
		UserService service = (UserService)factory.createObject("service");
		java.util.List<User> user = service.findAll();
		System.out.println(user);
		for (User u:user) {
			System.out.println(u.getName() + u.getUserId() + u.getDob());
		}
		
		
		
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		System.out.println("post");
	}

}
