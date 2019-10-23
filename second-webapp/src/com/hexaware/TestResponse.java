package com.hexaware;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class TestResponse extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    
   
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		System.out.println("do post() called!!");
		String nam = request.getParameter("n1");
		String pw = request.getParameter("n2");
		String gender = request.getParameter("n3");
		String[] skills = request.getParameterValues("n4");
		String stream = request.getParameter("n5");
		String add = request.getParameter("add");
		if(pw.equals("servlet")) {
			System.out.println("Logged in");
		}
		PrintWriter aw = response.getWriter();
		RequestDispatcher rd=request.getRequestDispatcher("/login.html"); 
		 rd.include(request, response); 
		aw.print("<html><body>");
		aw.print("<h3>Hello, "+ nam +", password "+pw+ ", Gender "+ gender + ", Stream " + stream + ", Adress "+ add + ", Skills"+"</h3></body></html>");
		if (skills.length > 0) {
            for (String sk : skills) {
            	aw.print("<html><body>");
            	aw.print("<h3>" + sk + "</h3></body></html>");
            }
        }
		
	}

}
