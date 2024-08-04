package com.demo.StudentDao;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import com.demo.model.Student;

@Repository
public class StudentDao {
	@Autowired
	private JdbcTemplate j;
	
	public int insertStudent(Student s) {
		String sql ="insert into student(sname,scity,spercentage) values(?,?,?)";
		return j.update(sql,new Object[] { s.getSname(), s.getScity(),s.getSpercentage()});
	}
	
	public int deleteStudentBySid(int sid) {
		String sql ="delete from student where sid =?";
		return j.update(sql,sid);
	}
	
	public Student findStudentBySid(int sid) {
		String sql ="select sid, sname, scity, spercentage from student where sid =?";
		List<Student> list = j.query(sql, new StudentRowMapper(),sid);
		return(!list.isEmpty()?list.get(0):null);
	}

	public List<Student> findAllStudent(){
		String sql ="select sid, sname, scity, spercentage from student";
		return j.query(sql, new StudentRowMapper());
	}
	
	public int updateStudent(Student s) {
		String sql = "update student set sname =?, scity = ?, spercentage =? where sid =?  ";
		return j.update(sql, new Object[] {s.getSname(), s.getScity(), s.getSpercentage(),s.getSid()});
	}
}
