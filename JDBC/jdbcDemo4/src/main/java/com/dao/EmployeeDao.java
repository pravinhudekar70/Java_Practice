package com.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import com.model.Employee;
import com.util.MyDatabase;

public class EmployeeDao {
		
	public int insertEmployee(Employee e ) {
		int check = 0;
		String sql ="insert into employee(ename,edesignation,ecompany,esalary)values(?,?,?,?)";
		try(Connection con = MyDatabase.getConnection() ;
				PreparedStatement pst = con.prepareStatement(sql);) {
			
			pst.setString(1, e.getEname());
			pst.setString(2, e.getEdesignation());
			pst.setString(3, e.getEcompany());
			pst.setDouble(4, e.getEsalary());
			check = pst.executeUpdate();
		} catch (SQLException e1) {
			e1.printStackTrace();
		}
		return check;
	}
	public int deleteEmployeeByEid(int eid) {
		int check = 0;
		String sql ="delete from employee where eid =?";
		try (Connection con = MyDatabase.getConnection();
				PreparedStatement pst = con.prepareStatement(sql)){
			pst.setInt(1, eid);
			check = pst.executeUpdate();
		} catch (SQLException e1) {
			e1.printStackTrace();
		}
		return check;
	}
	
	public Employee findEmployeeByEid(int eid) {
		Employee em = new Employee();
		String sql ="select eid, ename, edesignation, ecompany, esalary from employee where eid = ?";
		try (Connection con = MyDatabase.getConnection();
				PreparedStatement pst  = con.prepareStatement(sql);){
			pst.setInt(1, eid);
			ResultSet rs = pst.executeQuery();
			List<Employee> list = MyDatabase.employeeRowMapper(rs);
			if(!list.isEmpty()) {
				em = list.get(0);
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return em;
	}
	public Employee findEmployeeByEsalary(double esalary) {
		Employee em = new Employee();
		String sql ="select eid, ename, edesignation, ecompany, esalary from employee where esalary = ?";
		try (Connection con = MyDatabase.getConnection();
				PreparedStatement pst  = con.prepareStatement(sql);){
			pst.setDouble(1, esalary);
			ResultSet rs = pst.executeQuery();
			List<Employee> list = MyDatabase.employeeRowMapper(rs);
			if(!list.isEmpty()) {
				em = list.get(0);
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return em;
	}
	
	public List<Employee> findAllEmployee(){
		List<Employee> list  = new ArrayList<>();
		String sql ="select eid, ename ,edesignation, ecompany, esalary from employee";
		try (Connection con = MyDatabase.getConnection();
				PreparedStatement pst = con.prepareStatement(sql);
				ResultSet rs = pst.executeQuery()){
			list = MyDatabase.employeeRowMapper(rs);
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return list;
	}
	public int updateEmployee (Employee e) {
		int check = 0;
		String sql = "update employee set ename =?, edesignation =?, ecompany =?, esalary =? where eid =?";
		try(Connection con  = MyDatabase.getConnection();
				PreparedStatement pst =con.prepareStatement(sql)) {
			pst.setString(1, e.getEname());
			pst.setString(2, e.getEdesignation());
			pst.setString(3, e.getEcompany());
			pst.setDouble(4, e.getEsalary());
			pst.setInt(5, e.getEid());
			check = pst.executeUpdate();	
		} catch (SQLException e2) {
			e2.printStackTrace();
		} 
		return check;
	}
	
	public List<Employee> findEmployeeByEname(String ename){
		List<Employee> list = null;
		String sql ="select eid, ename, edesignation, ecompany, esalary from employee where ename =?";
		try(Connection con = MyDatabase.getConnection();
				PreparedStatement pst = con.prepareStatement(sql)) {
			pst.setString(1, ename);
			ResultSet rs  = pst.executeQuery();
			list =MyDatabase.employeeRowMapper(rs);
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return list;
	}
	
	public List<Employee> findEmployeeByEdesignation(String edesignation){
		List<Employee> list = null;
		String sql ="select eid, ename, edesignation, ecompany, esalary from employee where edesignation =?";
		try(Connection con = MyDatabase.getConnection();
				PreparedStatement pst = con.prepareStatement(sql)) {
			pst.setString(1, edesignation);
			ResultSet rs  = pst.executeQuery();
			list =MyDatabase.employeeRowMapper(rs);
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return list;
	}
	
	public List<Employee> findEmployeeByEcompany(String ecompany){
		List<Employee> list = null;
		String sql ="select eid, ename, edesignation, ecompany, esalary from employee where ecompany =?";
		try(Connection con = MyDatabase.getConnection();
				PreparedStatement pst = con.prepareStatement(sql)) {
			pst.setString(1, ecompany);
			ResultSet rs  = pst.executeQuery();
			list =MyDatabase.employeeRowMapper(rs);
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return list;
	}
	
	public List<Employee> findEmployeeByEnameAndEdesignation(String ename, String edesignation){
		List<Employee> list  = null;
		String sql = "select eid, ename ,edesignation, ecompany, esalary from employee where ename =? and edesignation =?";
		try(Connection con = MyDatabase.getConnection();
				 PreparedStatement pst  = con.prepareStatement(sql)) {
			pst.setString(1, ename);
			pst.setString(2, edesignation);
			ResultSet rs = pst.executeQuery();
			list = MyDatabase.employeeRowMapper(rs);	
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return list;	
	}
	
	public List<Employee> findEmployeeByEnameOrEdesignation(String ename, String edesignation){
		List<Employee> list  = null;
		String sql = "select eid, ename ,edesignation, ecompany, esalary from employee where ename =? or edesignation =?";
		try(Connection con = MyDatabase.getConnection();
				 PreparedStatement pst  = con.prepareStatement(sql)) {
			pst.setString(1, ename);
			pst.setString(2, edesignation);
			ResultSet rs = pst.executeQuery();
			list = MyDatabase.employeeRowMapper(rs);	
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return list;	
	}
	
	
	public List<Employee> findEmployeeByEsalaryLessThan(double esalary){
		List<Employee> list  = null;
		String sql ="select eid, ename ,edesignation, ecompany, esalary from employee where esalary<?";
		try(Connection con  = MyDatabase.getConnection();
				PreparedStatement pst = con.prepareStatement(sql)) {
			pst.setDouble(1, esalary);
			ResultSet rs  = pst.executeQuery();
			list  = MyDatabase.employeeRowMapper(rs);
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return list ;
	}
	
	public List<Employee> findEmployeeByEsalaryBetween(double low , double high){
		List<Employee> list  = null;
		String sql ="select eid,ename,edesignation,ecompany,esalary from employee where esalary between ? and ?";
		try (Connection con  = MyDatabase.getConnection();
				PreparedStatement pst  = con.prepareStatement(sql)){
			pst.setDouble(1, low);
			pst.setDouble(2, high);
			ResultSet rs  = pst.executeQuery();
			list = MyDatabase.employeeRowMapper(rs);
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return  list ;
	}
	
	public List<Employee> findEmployeeByEsalaryNotBetween(double low , double high){
		List<Employee> list  = null;
		String sql ="select eid,ename,edesignation,ecompany,esalary from employee where esalary not between ? and ?";
		try (Connection con  = MyDatabase.getConnection();
				PreparedStatement pst  = con.prepareStatement(sql)){
			pst.setDouble(1, low);
			pst.setDouble(2, high);
			ResultSet rs  = pst.executeQuery();
			list = MyDatabase.employeeRowMapper(rs);
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return  list ;
	}
	
	public List<Employee> findEmployeeByEnameLike(String ename){
		List<Employee> list = null;
		String sql ="select eid,ename,edesignation,ecompany,esalary from employee where ename like ?";
		try(Connection con = MyDatabase.getConnection();
				PreparedStatement pst =con.prepareStatement(sql)) {
//			pst.setString(1, ename+"%");
//			pst.setString(1, "%"+ename);
			pst.setString(1,"%"+ename+"%");
			System.out.println(sql);
			ResultSet rs  = pst.executeQuery();
			list = MyDatabase.employeeRowMapper(rs);
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return list;
	}
	
	public List<Employee> findEmployeeByEdesignationLike(String edesignation){
		List<Employee> list = null;
		String sql ="select eid,ename,edesignation,ecompany,esalary from employee where edesignation like ?";
		try(Connection con = MyDatabase.getConnection();
				PreparedStatement pst =con.prepareStatement(sql)) {
			pst.setString(1,"%"+edesignation+"%");
			System.out.println(sql);
			ResultSet rs  = pst.executeQuery();
			list = MyDatabase.employeeRowMapper(rs);
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return list;
	}
	
	public List<Employee> findEmployeeByEidIn(List<Integer> id){
		List<Employee> list =  null;
		StringBuilder sql = 
				new StringBuilder("select eid,ename,edesignation,ecompany,esalary from employee where eid in (");
		 if(id.isEmpty()) {
			 sql.append("0)");
		 }else {
			 for(int i=0;i<id.size();i++) {
				 sql.append(id.get(i));
				 if(i<id.size()-1)
					 sql.append(",");
			 }
			 sql.append(")");
		 }
		try(Connection con  = MyDatabase.getConnection(); 
				PreparedStatement pst  = con.prepareStatement(sql.toString()) ) {
			ResultSet rs  = pst.executeQuery();
			list =MyDatabase.employeeRowMapper(rs);
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return list ;
	}
	
	public List<Employee> findEmployeeByLikeString(String str){
		List<Employee> list = null;
		String sql ="select eid,ename,edesignation,ecompany,esalary from employee"
				+ " where ename like ? or edesignation like ? or ecompany like ? ";
		try(Connection con = MyDatabase.getConnection();
				PreparedStatement pst =con.prepareStatement(sql)) {
			pst.setString(1,"%"+str+"%");
			pst.setString(2,"%"+str+"%");
			pst.setString(3,"%"+str+"%");
			System.out.println(sql);
			ResultSet rs  = pst.executeQuery();
			list = MyDatabase.employeeRowMapper(rs);
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return list;
	}
	
	public List<Employee> findByAny(String s){
		List<Employee> list =new ArrayList<Employee>();
		if(isEid(s)){
			list.add(findEmployeeByEid(Integer.parseInt(s)));
		}else if(isEsalary(s)){
			list.add(findEmployeeByEsalary(Double.parseDouble(s)));
		}else {
			list = findEmployeeByLikeString(s);
		}
		return list;
	}
	 public static boolean isEsalary(String s) {
	        try {
	         Double.parseDouble(s);
	            return true;
	        } catch (NumberFormatException e) {
	            return false;
	        }  
	 }
	 public static boolean isEid(String s) {
	        try {
	         Integer.parseInt(s);
	            return true;
	        } catch (NumberFormatException e) {
	            return false;
	        }
	 }
	 public Map<String , List<Employee>> 
	 findEnployeeListLikeByEnameOrListByEdesignation(String ename, String edesignation){
		 Map<String, List<Employee>> map = new HashMap<>();
		 map.put("ename", findEmployeeByEnameLike(ename));
		 map.put("edesignation", findEmployeeByEdesignationLike(edesignation));
		 return map;
	 }
}
