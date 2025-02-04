package com.sprk.demo;

import java.io.IOException;

import com.sprk.entity.Student;

import jakarta.servlet.RequestDispatcher;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

@WebServlet("/process")
public class ProcessForm2 extends HttpServlet {
	
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

		String firstName = req.getParameter("first-name");
		String lastName = req.getParameter("last-name");
		
		Student student = new Student();
		student.setFirstName(firstName);
		student.setLastName(lastName);
		
		req.setAttribute("studentObj", student);
		
		// View Page
		RequestDispatcher rd = req.getRequestDispatcher("student-response.jsp");
		rd.forward(req, resp);
	}

}
