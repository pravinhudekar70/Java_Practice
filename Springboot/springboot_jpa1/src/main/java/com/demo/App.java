package com.demo;


import java.util.Arrays;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

import com.demo.model.Student;
import com.demo.service.StudentService;

@SpringBootApplication
public class App {

	public static void main(String[] args) {
		
		 ApplicationContext context = SpringApplication.run(App.class, args);
		 StudentService ss = context.getBean(StudentService.class);
		
//		 Student s1 = new Student();
//		 s1.setSname("Rushi Jadhav");
//		 s1.setScity("Nashik");
//		 s1.setSpercentage(89.88);
//		 System.out.println(ss.save(s1));
		 
//		 for(int i =1; i<5000; i++) {
//		 Student s1 = new Student();
//		 StringBuilder sname = new StringBuilder();
//		 StringBuilder scity = new StringBuilder();
//		 
//		 for(int j =1; j<=15;j++) {
//			 sname.append((char)(new Random().nextInt(26)+65));
//			 scity.append((char)(new Random().nextInt(26)+65));
//		 }
//		 
//		 s1.setSname(sname.toString());
//		 s1.setScity(scity.toString());
//		 s1.setSpercentage(new Random().nextDouble()*100);
//		 System.out.println(ss.save(s1));
//		 }
		 //ss.deleteById(2);
		 
		// System.out.println(ss.findBySid(2));
		 
//		 for(Student s:ss.findAll()) {
//			 System.out.println(s);
//		 }
		 
//		 for(Student s: ss.findBySname("KEQRBSTWTSETLQV")) {
//		 System.out.println(s);
//		 }
		 
//		 for(Student s: ss.findByScity("SBAABVMXOQJDXAS")) {
//			 System.out.println(s);
//		 }
		 
//		 for(Student s: ss.findBySidAndSname(3, "LFIDFPRWBSFVKWQ")){
//			 System.out.println(s);
//		 }
		 
//		 for(Student s: ss.findBySidOrSname(3, "UTOJNXYYEVQFQEN")) {
//			 System.out.println(s);
//		 }
		 
//		 for(Student s: ss.findBySidLessThan(100)) {
//			 System.out.println(s);
//		 }
		 
//		 for(Student s: ss.findBySidBetween(19, 39)) {
//			 System.out.println(s);
//		 }
		 
//		 for(Student s:ss.findBySpercentageBetween(40, 50)) {
//			 System.out.println(s);
//		 }
		 
		 
//		 for(Student s: ss.findBySidIn(new int []{1,2,3,4})){
//			 System.out.println(s);
//		 }
		 
//		 for(Student s: ss.findBySidNotIn(Arrays.asList(1,2,3,4))) {
//			 System.out.println(s);
//		 }
		 
		 for(Student s: ss.findBySnameStartsWith("DD")){
			 System.out.println(s);
		 }
		 
		 for(Student s: ss.findBySnameEndsWith("XYZ")) {
			 System.out.println(s);
		 }
		 
		 for(Student s: ss.findBySnameContains("ABC")) {
			 System.out.println(s);
		 }
		 
		 
	}

}
