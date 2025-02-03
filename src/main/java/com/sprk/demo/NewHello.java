package com.sprk.demo;

import java.io.IOException;
import java.io.PrintWriter;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class NewHello
 */
@WebServlet("/Hello")
public class NewHello extends HttpServlet {

	@Override
	protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		response.setContentType("text/html");
		PrintWriter out = response.getWriter();
		
		out.print("<html>");
		out.print("<head><title>Hello Servlet</title></head>");
		out.print("<body>");
		out.print("<h1>Hello World 123</h1>");
		out.print("</body>");
		out.print("</html>");
	}
}
