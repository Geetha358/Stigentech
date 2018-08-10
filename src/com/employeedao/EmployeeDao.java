package com.employeedao;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;

public interface EmployeeDao {
	
	public Connection createConnection();
	
	public int EmployeeRegistrtion(int id, String name, int age, int salary, int dob, String designation) throws SQLException;
	
	public ResultSet getEmployeeDetails(int id) throws SQLException;
	
	public ResultSet getAllEmployeeDetails() throws SQLException;


}
