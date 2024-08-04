package com.demo.service;

import java.util.List;

import com.demo.model.Student;

public interface StudentService {

	Student save(Student s);

	void deleteById(int sid);

	Student findBySid(int sid);

	List<Student> findAll();

	List<Student> findByScity(String scity);

	List<Student> findBySname(String sname);

	List<Student> findBySidAndSname(int sid, String sname);

	List<Student> findBySidOrSname(int sid, String sname);

	List<Student> findBySidLessThan(int sid);

	List<Student> findBySidBetween(int low, int high);

	List<Student> findBySpercentageBetween(int low, int high);

	List<Student> findBySidIn(int [] arr);
	
	List<Student> findBySidNotIn(List<Integer> list);
	
	List<Student> findBySnameStartsWith(String s1);
	
	List<Student> findBySnameEndsWith(String s1);
	
	List<Student> findBySnameContains(String s1);

}
