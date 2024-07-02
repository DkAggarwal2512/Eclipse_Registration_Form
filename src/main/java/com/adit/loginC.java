package com.adit;

import java.io.IOException;

import jakarta.servlet.RequestDispatcher;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

@WebServlet("/login")
public class loginC extends HttpServlet{
	
	
	/**
	 * 
	 */
	
	
	private static final long serialVersionUID = 1L;

	public void service(HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException {
		
		String Name = req.getParameter("name");
		int Age = Integer.parseInt(req.getParameter("age"));
		
		req.setAttribute("name1", Name);
		req.setAttribute("age1", Age);
		
		RequestDispatcher rd = req.getRequestDispatcher("pass");
		rd.forward(req, res);
	}

}
