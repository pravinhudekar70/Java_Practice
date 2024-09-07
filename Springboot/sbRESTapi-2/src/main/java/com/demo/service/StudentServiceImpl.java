package com.demo.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.demo.entity.Student;
import com.demo.repositery.StudentRepositery;

@Service
@Transactional
public class StudentServiceImpl implements StudentService {

	@Autowired
	StudentRepositery sr ;
	
	@Override
	public Student save(Student s) {
		return sr.save(s) ;
	}

	@Override
	public List<Student> findAll() {
		return sr.findAll();
	}

	@Override
	public void deleteBySid(int sid) {
		sr.deleteBySid(sid);
	}

	@Override
	public List<Student> findByAny(String str) {
		return sr.findByAny(str);
	}

}
