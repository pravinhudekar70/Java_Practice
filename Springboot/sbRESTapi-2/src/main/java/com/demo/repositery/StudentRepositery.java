package com.demo.repositery;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.demo.entity.Student;

@Repository
public interface StudentRepositery extends JpaRepository<Student, Integer> {
	public Student save(Student s);
	public List<Student> findAll();
	public void deleteBySid(int sid);
	
	@Query(value = "select * from Student where sid =?1 or sname like %?1% or scity like %?1% or spercentage =?1",nativeQuery = true )
	public List<Student> findByAny(String str);
	
	
	
}
