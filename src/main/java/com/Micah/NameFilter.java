package com.Micah;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.Filter;
import javax.servlet.FilterChain;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.annotation.WebFilter;
import javax.servlet.http.HttpFilter;
import javax.servlet.http.HttpServletRequest;


@WebFilter("/addAlien")
public class NameFilter extends HttpFilter implements Filter {
       
 
	private static final long serialVersionUID = 1L;

	public void doFilter(ServletRequest request, ServletResponse response, FilterChain chain) throws IOException, ServletException {
		
		PrintWriter out = response.getWriter();
		HttpServletRequest req = (HttpServletRequest) request;
		String str = req.getParameter("aname");
		
		if(str.length() >= 3)
			chain.doFilter(request, response);
		else
			out.println("Name must have atleast 3 char");
	}

	

}
