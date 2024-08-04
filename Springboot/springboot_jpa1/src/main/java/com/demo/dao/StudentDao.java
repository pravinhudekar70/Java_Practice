package com.demo.dao;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.demo.model.Student;

@Repository
public interface StudentDao extends JpaRepository<Student, Integer> {
	@SuppressWarnings("unchecked")
	Student save(Student s);

	void deleteById(Integer id);

	Student findBySid(int sid);

	List<Student> findAll();

	List<Student> findByScity(String scity);

	List<Student> findBySname(String sname);

	List<Student> findBySidAndSname(int sid, String name);

	List<Student> findBySidOrSname(int sid, String sname);

	List<Student> findBySidLessThan(int sid);

	List<Student> findBySidBetween(int low, int high);

	List<Student> findBySpercentageBetween(int low, int high);

	List<Student> findBySidIn(int[] arr);

	List<Student> findBySidNotIn(List<Integer> list);
	
	List<Student> findBySnameStartsWith(String s1);
	
	List<Student> findBySnameEndsWith(String s1);
	
	List<Student> findBySnameContains(String s1);
	
	// using @Quere Annotation 
	 
	
 
}
