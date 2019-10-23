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
 * Servlet implementation class SearchUserServlet
 */
@WebServlet("/SearchUserServlet")
public class SearchUserServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public SearchUserServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		response.getWriter().append("Served at: ").append(request.getContextPath());
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		System.out.println("H");
		System.out.println("post");
		int uid = Integer.parseInt(request.getParameter("n1"));
		ObjectFactory factory = new ObjectFactory();
		UserService service = (UserService)factory.createObject("service");
		//UserService service = new UserServiceImpl();
		User user = service.findById(uid);
		System.out.println(user.getName());
		if(user!=null) {
		request.setAttribute("u", user);
		
		request.getRequestDispatcher("foundid.jsp").include(request, response);
		}
	}

}
