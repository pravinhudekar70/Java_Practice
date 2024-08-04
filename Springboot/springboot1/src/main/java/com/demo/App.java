package com.demo;


import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

import com.demo.StudentDao.StudentDao;
import com.demo.model.Student;

@SpringBootApplication
public class App {

	public static void main(String[] args) {
	 ApplicationContext context = SpringApplication.run(App.class, args);
	 
	 StudentDao sd= context.getBean(StudentDao.class);
	 
	 //insert Student
//	 Student s1 = new Student();
//	 s1.setSname("Rahul Bhobhe");
//	 s1.setScity("Bhilaspur");
//	 s1.setSpercentage(88.6);
//	 System.out.println(sd.insertStudent(s1));
	 
	 //delete Student by sid
	 System.out.println(sd.deleteStudentBySid(15));
	 
	 //find student by sid;
	 System.out.println(sd.findStudentBySid(14));
	 
	 //find All Students 
	 for(Student s:sd.findAllStudent()) {
		 System.out.println(s);
	 }
	 
	 //update Student
	 Student s = sd.findStudentBySid(14);
	 	s.setSname("Rajesh Lad");
	 	s.setScity("Buldhana");
	 	s.setSpercentage(89.8);
	 	System.out.println(sd.updateStudent(s));
	 	System.out.println(sd.findStudentBySid(14));
	 	
	}

}
