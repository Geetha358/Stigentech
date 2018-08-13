package com.employeedao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class EmployeeDaoImpl implements EmployeeDao {
	
		public Connection createConnection() {
			String url="jdbc:mysql://localhost:3306/student";
			String user="root";
			String pwd="root";
			
			Connection con=null;
			try {
				Class.forName("com.mysql.jdbc.Driver");
				con = DriverManager.getConnection(url, user, pwd);
			}
			catch (ClassNotFoundException e) {
				e.printStackTrace();
			} catch (Exception e) {

				e.printStackTrace();
			}	
			return con;
		}
		
		public int EmployeeRegistrtion(int id, String name,  int age, int salary, int dob, String designation)throws SQLException {
			
			Connection con = createConnection();
			System.out.println(">>>>>>>dob"+dob);
			String sql="insert into employee(id,name,age,salary,dob,designation) values(?, ?, ?, ?, ?, ?)";
			
			PreparedStatement ps = con.prepareStatement(sql);
			ps.setInt(1, id);
			ps.setString(2, name);
			ps.setInt(3, age);
			ps.setInt(4, salary);
		    ps.setInt(5, dob);
		    ps.setString(6, designation);
			
			int result = ps.executeUpdate();
			con.close();
			return result;
		
		}
		public ResultSet getEmployeeDetails(int id) throws SQLException {
		
		Connection con = createConnection();
		
		String sql = "select name,age,salary,dob,designation from employee where id =" + "'" +id+ "'";
		
		Statement stm = con.createStatement();
		
		ResultSet result = stm.executeQuery(sql);
		
		return result;
	}
		
		public ResultSet getAllEmployeeDetails() throws SQLException {
			
			Connection con = createConnection();
			String sql = "select * from employee";
			
			Statement stm = con.createStatement();
			ResultSet result = stm.executeQuery(sql);
			System.out.println("executed");
			return result;
					}
}