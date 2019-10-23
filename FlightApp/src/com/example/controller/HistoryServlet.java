package com.example.controller;

import java.io.IOException;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.example.pojo.Orders;
import com.example.service.OrderService;
import com.example.service.OrderServiceImpl;

@WebServlet("/HistoryServlet")
public class HistoryServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		System.out.println("Get Called  !!!!!!!");
		HttpSession session = request.getSession();
		int id = (int)session.getAttribute("id");
		System.out.println(id);
		OrderService os = new OrderServiceImpl();
	    List<Orders> orders = os.findbyId(id);
	    if( orders != null) {
	    	request.setAttribute("ord", orders);
	    	request.getRequestDispatcher("history.jsp").forward(request, response);
	    }
	    
		
	}

	

}
