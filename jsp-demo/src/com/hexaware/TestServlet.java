package com.hexaware;

import java.io.IOException;

import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;


@WebServlet("/TestServlet")
public class TestServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
    
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		Person p1 = new Person();
		p1.setName(request.getParameter("n1"));
		p1.setAge(Integer.parseInt(request.getParameter("n2")));
		
		Person p2 = new Person();
		p2.setName("Zaheer");
		p2.setAge(45);
		
		Person p3 = new Person();
		p3.setName("Sachin");
		p3.setAge(48);
		
		request.setAttribute("data1", p1);
		HttpSession s = request.getSession();
		s.setAttribute("data2", p2);
		
		ServletContext appctx = getServletContext();
		appctx.setAttribute("data3", p3);
		
		request.getRequestDispatcher("second.jsp").forward(request, response);
	}

}
