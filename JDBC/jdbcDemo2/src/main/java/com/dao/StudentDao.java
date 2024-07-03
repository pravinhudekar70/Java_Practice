package com.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import com.model.Student;

public class StudentDao {
		
	
	
	public int insertStudent(Student s) {
		int check =0;
		Connection con = null;
		PreparedStatement pst  = null;
		
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			con = DriverManager.getConnection("jdbc:mysql://localhost:3306/jap67","root","prAvin@1234");
			String sql = "Insert into student(sname,scity,spercentage) values(?,?,?)";
			pst = con.prepareStatement(sql);
			pst.setString(1, s.getSname());
			pst.setString(2, s.getScity());
			pst.setDouble(3, s.getSpercentage());
			check = pst.executeUpdate();
			
		} catch (ClassNotFoundException | SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}finally {
			try {
				pst.close();
				con.close();
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		
		return check;
	}
	
	public int  deleteStudentById(int sid) {
		int check =0;
		Connection con = null;
		PreparedStatement pst = null;
		
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			con = DriverManager.getConnection("jdbc:mysql://localhost:3306/jap67","root","prAvin@1234");
			String sql = "delete from student where sid =?";
			pst = con.prepareStatement(sql);
			pst.setInt(1, sid);
			check = pst.executeUpdate();
		} catch (ClassNotFoundException | SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}finally {
			try {
				pst.close();
				con.close();
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
	
		}
		return check;
	}
	
	public Student findStudentBySid(int sid) {
		Student s;
		Connection con = null;
		PreparedStatement pst = null;
		ResultSet rs = null;
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			con = DriverManager.getConnection("jdbc:mysql://localhost:3306/jap67","root","prAvin@1234");
			String sql = "select sid ,sname, scity, spercentage from student where sid  = ?";
			pst = con.prepareStatement(sql);
			pst.setInt(1, sid);
			rs = pst.executeQuery();
			while(rs.next()) {
			s = new Student();
			s.setSid(rs.getInt("sid"));
			s.setSname(rs.getString("sname"));
			s.setScity(rs.getString("scity"));
			s.setSpercentage(rs.getDouble("spercentage"));
			return s;
			}
		} catch (ClassNotFoundException | SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}finally {
			try {
				rs.close();
				pst.close();
				con.close();
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		return null;
	}
	
	public List<Student> findAllStudent(){
		List<Student> list = new ArrayList<>();
		Student s;
		Connection con = null;
		PreparedStatement pst =null;
		ResultSet rs = null;
		
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			con = DriverManager.getConnection("jdbc:mysql://localhost:3306/jap67","root","prAvin@1234");
			String sql = "select sid, sname, scity, spercentage from student";
			pst = con.prepareStatement(sql);
			rs = pst.executeQuery();
			while(rs.next()) {
				s = new Student();
				s.setSid(rs.getInt("sid" ));
				s.setSname(rs.getString("sname"));
				s.setScity(rs.getString("scity"));
				s.setSpercentage(rs.getDouble("spercentage"));
				list.add(s);
			}
		} catch (ClassNotFoundException | SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}finally {
			try {
				rs.close();
				pst.close();
				con.close();
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		return list;
	}
	public int updateStudent(Student s) {
		int check = 0;
		Connection con = null;
		PreparedStatement pst =null;
		 try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			con = DriverManager.getConnection("jdbc:mysql://localhost:3306/jap67","root","prAvin@1234");
			String sql ="update student set sname =?, scity =?, spercentage =? where sid =?";
			pst =con.prepareStatement(sql);
			pst.setString(1, s.getSname());
			pst.setString(2, s.getScity());
			pst.setDouble(3, s.getSpercentage());
			pst.setInt(4, s.getSid());
			check = pst.executeUpdate();
			
		} catch (ClassNotFoundException | SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}finally {
			try {
				pst.close();
				con.close();
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		
		return check;
	}
}
