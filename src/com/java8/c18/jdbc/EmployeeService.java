package com.java8.c18.jdbc;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

public class EmployeeService {

	public static List<Employee> getAll(){
		
		List<Employee> employees = new ArrayList<>();
		String query = "SELECT * FROM EMPLOYEE";
		
		try(Connection conn = SQLiteConnection.getConnection();
			Statement stmt = conn.createStatement();
			ResultSet rs = stmt.executeQuery(query)){
			
			while(rs.next()){
				Employee emp = new Employee();
				emp.setId(rs.getInt(1));
				emp.setName(rs.getString(2));
				emp.setSalary(rs.getInt(3));
				emp.setIdDepartment(rs.getInt(5));
				employees.add(emp);
			}
			
		} catch (SQLException e) {
			e.printStackTrace();
		}
		
		return employees;
	}
}
