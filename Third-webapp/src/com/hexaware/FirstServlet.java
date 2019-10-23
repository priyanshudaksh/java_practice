package com.hexaware;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletConfig;
import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
//import javax.servlet.http.HttpSession;

import sun.print.PrinterJobWrapper;


public class FirstServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		PrintWriter out = response.getWriter();
		String name = request.getParameter("n1");
		//HttpSession s = request.getSession();
		//s.setAttribute("n", name);
		Cookie c1 = new Cookie("n", name);
		response.addCookie(c1);
		RequestDispatcher rd = request.getRequestDispatcher("second.html");
		out.println("<html><body><h3>Hello "+ name + "</h3>");
		ServletConfig cfg  = getServletConfig();
		ServletContext cxt = getServletContext();
		String a1 = cfg.getInitParameter("p2");
		String a2 = cxt.getInitParameter("p1");
		out.println("<p>a1 = "+ a1 + ",a2= "+a2 +"</p>");
		//out.println("<h4>Session Id: " + s.getId()+ "</h4>");
		out.println("</body></html>");
		rd.include(request, response);
	}

}
