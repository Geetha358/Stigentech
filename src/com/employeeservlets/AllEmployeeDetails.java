package com.employeeservlets;

import java.io.IOException;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import java.util.TreeSet;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.employeedao.Employee;
import com.employeedao.EmployeeDao;
import com.employeedao.EmployeeDaoImpl;
import com.util.EmployeeCustomSort;


@WebServlet("/allemployeedetails")
public class AllEmployeeDetails extends HttpServlet {

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		RequestDispatcher rd = request.getRequestDispatcher("allemployeedetails.jsp");
		rd.forward(request, response);
			}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		
		EmployeeDao edao = new EmployeeDaoImpl();
		List l = null;
		
		try {
			ResultSet rs = edao.getAllEmployeeDetails();
			l = new ArrayList();
			
				while(rs.next()){
					Employee e = new Employee();
				
				int id= rs.getInt("id");
				//request.setAttribute("id", id);
				e.setId(id);
				
				String name = rs.getString("name");
				//request.setAttribute("name", name);
				e.setName(name);
				
				int age= rs.getInt("age");
				//request.setAttribute("age", age);
				e.setAge(age);
				
				int salary = rs.getInt("salary");
				//request.setAttribute("salary", salary);
				e.setSalary(salary);
				
				int dob = rs.getInt("dob");
				//request.setAttribute("salary", salary);
				e.setDob(dob);
				
				String designation = rs.getString("designation");
				//request.setAttribute("designation", designation);
				e.setDesignation(designation);
				
				l.add(e);	
			}
			
		} catch (SQLException e) {
			e.printStackTrace();
			
		} 
		
		TreeSet ts = new TreeSet(new EmployeeCustomSort());
		ts.addAll(l);
		
		request.setAttribute("list", ts);
		RequestDispatcher rd = request.getRequestDispatcher("allrecords.jsp");
		rd.forward(request, response);
	}
}

