package com.hexaware;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletConfig;
import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
//import javax.servlet.http.HttpSession;


public class SecondServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
	public String name2 = "";
   
	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
	}

	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		PrintWriter out = response.getWriter();
		String phone = request.getParameter("n2");
		//HttpSession s = request.getSession();
		//String name2 = (String)s.getAttribute("n");
		Cookie[] cookies  = request.getCookies();
		for(Cookie c:cookies) {
			name2 = c.getValue();
			//out.println("<html><body><h3>Hello " + name2 +", Phone: " + phone +"</h3>");
		}
		out.println("<html><body><h3>Hello " + name2 +", Phone: " + phone +"</h3>");
		ServletConfig cfg  = getServletConfig();
		ServletContext cxt = getServletContext();
		String a1 = cfg.getInitParameter("p2");
		String a2 = cxt.getInitParameter("p1");
		out.println("<p>a1 = "+ a1 + ",a2= "+a2 +"</p>");
		//out.println("<h4>Session Id: " + s.getId()+"</h4>");
		out.print("</body></html>");
	}

}
