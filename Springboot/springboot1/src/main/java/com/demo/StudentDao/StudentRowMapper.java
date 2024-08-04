package com.demo.StudentDao;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;

import com.demo.model.Student;

public class StudentRowMapper  implements RowMapper<Student>{

	@Override
	public Student mapRow(ResultSet rs, int rowNum) throws SQLException {
		Student s = new Student();
		s.setSid(rs.getInt("sid"));
		s.setSname(rs.getString("sname"));
		s.setScity(rs.getString("scity"));
		s.setSpercentage(rs.getDouble("spercentage"));
		return s;
	}

}
