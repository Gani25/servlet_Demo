package com.sprk.demo;

import java.io.IOException;
import java.util.List;

import com.sprk.entity.Student;
import com.sprk.utility.Util;

import jakarta.servlet.RequestDispatcher;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

@WebServlet("/students")
public class StudentServlet extends HttpServlet {
	
	
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		Util util = new Util();
		List<Student> students = util.getStudents();
		
		req.setAttribute("studentLists", students);
		
		RequestDispatcher rd  = req.getRequestDispatcher("/dashboard.jsp");
		rd.forward(req, resp);
	}

}
