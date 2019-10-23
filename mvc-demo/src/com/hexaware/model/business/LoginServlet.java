package com.hexaware.model.business;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.hexaware.ObjectFactory;
import com.hexaware.model.bean.User;

/**
 * Servlet implementation class LoginServlet
 */
@WebServlet("/LoginServlet")
public class LoginServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		int uid = Integer.parseInt(request.getParameter("n1"));
		String pwd = request.getParameter("n2");
		ObjectFactory factory = new ObjectFactory();
		UserService service = (UserService)factory.createObject("service");
		//UserService service = new UserServiceImpl();
		User user = service.login(uid, pwd);
		System.out.println(user);
		if(user!=null) {
			request.setAttribute("msg", user);
			
			
			request.getRequestDispatcher("Success.jsp").forward(request, response);
		}
		else {
			request.setAttribute("data2", "Invalid credential");
			request.getRequestDispatcher("login.jsp").forward(request, response);

		}
		

}
}
