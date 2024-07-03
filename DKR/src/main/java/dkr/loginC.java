package dkr;

import java.io.IOException;
import java.io.PrintWriter;

import jakarta.servlet.ServletException;
import jakarta.servlet.ServletRequest;
import jakarta.servlet.ServletResponse;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
@WebServlet("/login")
public class loginC extends HttpServlet{
	public void service(HttpServletRequest req, HttpServletResponse res) throws IOException {
		String name =req.getParameter("name");
		
		int age= Integer.parseInt(req.getParameter("age"));
		long mob= Long.parseLong(req.getParameter("mob"));
		String email = req.getParameter("email");


		
		
PrintWriter output = res.getWriter();
output.print("Candidate name "+ name+ " Candidate Age " +age+ " Cnadidate mobNo. " +mob+ " Candidate Email_ID " +email) ;



}
	}
