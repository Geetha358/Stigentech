package com.employeeservlets;

import java.io.IOException;
import java.sql.SQLException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.employeedao.EmployeeDao;
import com.employeedao.EmployeeDaoImpl;
import com.employeedao.EmployeeDaoImpl;

@WebServlet("/register")
public class EmpoyeeReg extends HttpServlet{
	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		int id = Integer.parseInt(request.getParameter("id"));
		String name = request.getParameter("name");
		int age = Integer.parseInt(request.getParameter("age"));
		int salary = Integer.parseInt(request.getParameter("salary"));
		int dob = Integer.parseInt(request.getParameter("dob"));
		String designation = request.getParameter("designation");

		EmployeeDao edao = new EmployeeDaoImpl();
	
		int savedao = 0 ;
			try {
			savedao = edao.EmployeeRegistrtion(id, name, age, salary, dob, designation);
			
		} catch (SQLException e) {
			e.printStackTrace();
		}
		if(savedao == 1) {
			request.setAttribute("name", name);
			RequestDispatcher rd = request.getRequestDispatcher("profile.jsp");
			rd.forward(request, response);
		}else {
			request.setAttribute("notsuccess", true);
			RequestDispatcher rd = request.getRequestDispatcher("register.jsp");
			rd.forward(request, response);			
		}
	}	
	
}

			

