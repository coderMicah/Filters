package com.Micah;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
//import javax.servlet.http.HttpSession;


@WebServlet("/JSTLDemo")
public class JSTLDemo extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
  
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		String name = "Micah";
//		HttpSession session = request.getSession();
//		session.setAttribute("label", name);
		
		request.setAttribute("name", name);
		
		RequestDispatcher rd = request.getRequestDispatcher("profile.jsp");
		rd.forward(request,response);
	}

	
}
