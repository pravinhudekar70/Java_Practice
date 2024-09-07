package com.demo.service;

import java.util.List;

import com.demo.entity.Student;

public interface StudentService {
	public Student save(Student s);
	public List<Student> findAll();
	public void deleteBySid(int sid);
	public List<Student> findByAny(String str);
}
