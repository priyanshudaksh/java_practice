package com.hexaware;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class TestServlet
 */
public class TestServlet extends HttpServlet {
	private static final long serialVersionUID = 1L; 
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		System.out.println("doGet() called!");
	}

	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String name = request.getParameter("n1");
		String pwd = request.getParameter("n2");
		PrintWriter pw = response.getWriter();
		 if(pwd.equals("servlet") && name.equals("daksh")){  
		        RequestDispatcher rd=request.getRequestDispatcher("WelcomeServlet");  
		        rd.forward(request, response);  
		    } 
		 else{  
		        pw.print("Sorry UserName or Password Error!");  
		        RequestDispatcher rd=request.getRequestDispatcher("/index.html");  
		        rd.include(request, response);  
		                      
		        }  
		/*pw.print("<html><body>");
		pw.print("<h3>Hello, "+ name +", password "+pwd+"</h3></body></html>");*/
		
	}
	}


