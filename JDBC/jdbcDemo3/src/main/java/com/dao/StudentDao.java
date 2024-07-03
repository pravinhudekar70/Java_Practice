package com.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import com.model.Student;
import com.util.MyDatabase;

public class StudentDao {
		
		public int insertStudent(Student s) {
			int check = 0;
			String sql ="insert into student (sname, scity, spercentage) values(?, ?, ?)";
			try (Connection con  = MyDatabase.getConnection();
					PreparedStatement pst = con.prepareStatement(sql) )
			{
			pst.setString(1, s.getSname());
			pst.setString(2, s.getScity());
			pst.setDouble(3, s.getSpercentage());
			check = pst.executeUpdate();
			} catch ( SQLException e) {
				e.printStackTrace();
			}
			return check;
		}
		public int deleteStudentBySid(int sid) {
			int check =0;
			String sql = "delete from Student where sid =?";
			try(Connection con = MyDatabase.getConnection();
					PreparedStatement pst = con.prepareStatement(sql)) {
				pst.setInt(1, sid);
				check = pst.executeUpdate();
			} catch (SQLException e) {
				e.printStackTrace();
			}
			return check ;
		}
		
		public Student findStudentBySid(int sid) {
			Student s = null;
			ResultSet rs;
			String sql = "select sid, sname, scity, spercentage from student where sid = ?";
			try(Connection con = MyDatabase.getConnection();
					PreparedStatement pst = con.prepareStatement(sql); ) {
				pst.setInt(1, sid);
				rs = pst.executeQuery();
				List<Student> list =MyDatabase.studentRowMapper(rs);
				if(!list.isEmpty()) {
					s=list.get(0);
				}
			} catch (SQLException e) { 
				e.printStackTrace();
			}
			return s;
		}
		
		public List<Student> findAllStudent(){
			List<Student>list = null;
			String sql = "select * from Student";
			try(Connection con = MyDatabase.getConnection();
					PreparedStatement pst = con.prepareStatement(sql); 
					ResultSet rs= pst.executeQuery(); ) {
				list = MyDatabase.studentRowMapper(rs);
			} catch (SQLException e) { 
				e.printStackTrace();
			}
			return list;
		}
		public int updateStudent (Student s) {
			int check =0;
			String sql ="update Student set sname = ?, scity =?, spercentage =? where sid =?";
			try(Connection con = MyDatabase.getConnection();
					PreparedStatement pst = con.prepareStatement(sql); ) {
				pst.setString(1, s.getSname());
				pst.setString(2, s.getScity());
				pst.setDouble(3, s.getSpercentage());
				pst.setInt(4, s.getSid());
				check = pst.executeUpdate();
				
			} catch (SQLException e) { 
				e.printStackTrace();
			}
			
			return check;
		}
}
