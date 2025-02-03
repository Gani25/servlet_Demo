package com.sprk.demo;

import java.io.IOException;
import java.io.PrintWriter;

import jakarta.servlet.GenericServlet;
import jakarta.servlet.Servlet;
import jakarta.servlet.ServletConfig;
import jakarta.servlet.ServletException;
import jakarta.servlet.ServletRequest;
import jakarta.servlet.ServletResponse;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

@WebServlet("/save")
public class DemoServlet extends HttpServlet {

	
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		String firstName = req.getParameter("first-name");
		String lastName = req.getParameter("last-name");
		
		resp.setContentType("text/html");
		PrintWriter out = resp.getWriter();
		
		out.print("<html>");
		out.print("<head><title>Student Confirm</title></head>");
		out.print("<body>");
		out.print("<h1>Student is Confirmed</h1>");
		out.printf("<p>Full Name = %s</p>",(firstName+" "+lastName));
		out.print("</body>");
		out.print("</html>");
	}


}
