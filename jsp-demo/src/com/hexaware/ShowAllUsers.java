package com.hexaware;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


@WebServlet("/ShowAllUsers")
public class ShowAllUsers extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		List<Person> personList = new ArrayList<>();
		Person p1 = new Person("Alex", 34);
		Person p2 = new Person("Bruce", 32);
		Person p3 = new Person("Charles", 31);
		personList.add(p1);
		personList.add(p2);
		personList.add(p3);
		request.setAttribute("persons", personList);
		request.getRequestDispatcher("jstldemo.jsp").forward(request, response);
		
	}

}
