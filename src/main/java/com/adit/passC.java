package com.adit;

import java.io.IOException;
import java.io.PrintWriter;

import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

@WebServlet("/pass")
public class passC extends HttpServlet {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	public void doGet(HttpServletRequest req, HttpServletResponse res) throws IOException {
		
		String name2 = (String) req.getAttribute("name1");
		int age2 = (int) req.getAttribute("age1");
		
		PrintWriter out = res.getWriter();
		out.println("Name :" +name2);
		out.println("Age :" +age2);
	}

}
