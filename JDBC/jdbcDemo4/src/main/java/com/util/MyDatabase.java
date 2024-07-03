package com.util;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import com.model.Employee;

public class MyDatabase {

	public static Connection getConnection() {
		Connection con = null;
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
		  con = DriverManager.getConnection("jdbc:mysql://localhost:3306/jap67","root","prAvin@1234");
		} catch (SQLException | ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return con;
	}
	public static List<Employee>  employeeRowMapper(ResultSet rs ) {
		List<Employee> list = new ArrayList<>();
		
		try  {
			while(rs.next()) {
				Employee em = new Employee();
				em.setEid(rs.getInt("eid"));
				em.setEname(rs.getString("ename"));
				em.setEdesignation(rs.getString("edesignation"));
				em.setEcompany(rs.getString("ecompany"));
				em.setEsalary(rs.getDouble("esalary"));
				list.add(em);
		  }
			rs.close();
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return list;
	}
	
}
