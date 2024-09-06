package com.demo.controller;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.demo.entity.Student;

@RestController
@RequestMapping("/student")
public class StudentController {
	@GetMapping("/")
	public String m1() {
		return "Welcome to home page";
	}
	
	@GetMapping("1")
	public int m2() {
		return 45;
	}
	
	@GetMapping("2")
	public int [] m3() {
	
		return new int[] {45, 18, 100, 77};
	}
	
	@GetMapping("3")
	public Student m4() {
		Student s1 = new Student().setSid(1).setSname("Ram").setScity("Nagpur").setSpercentage(89.00);
		return s1;
	}
	@GetMapping("4")
	public List<Student> m5(){
		List<Student> al = new ArrayList<>();
		Student s1 = new Student().setSid(1).setSname("Ram").setScity("Nagpur").setSpercentage(89.00);
		Student s2 = new Student().setSid(2).setSname("Denesh").setScity("Pune").setSpercentage(78.00);
		Student s3 = new Student().setSid(3).setSname("Pratik").setScity("Delhi").setSpercentage(69.00);
		Student s4 = new Student().setSid(4).setSname("Mohan").setScity("Hydrabad").setSpercentage(84.00);
		al.add(s1);
		al.add(s2);
		al.add(s3);
		al.add(s4);
		return al;
	}
	
	@GetMapping("5")
	public Map<String, List> m6(){
		Map<String , List> map = new HashMap();
		
		List<Student> al = new ArrayList<>();
		Student s1 = new Student().setSid(1).setSname("Ram").setScity("Nagpur").setSpercentage(89.00);
		Student s2 = new Student().setSid(2).setSname("Denesh").setScity("Pune").setSpercentage(78.00);
		Student s3 = new Student().setSid(3).setSname("Pratik").setScity("Delhi").setSpercentage(69.00);
		Student s4 = new Student().setSid(4).setSname("Mohan").setScity("Hydrabad").setSpercentage(84.00);
		al.add(s1);
		al.add(s2);
		al.add(s3);
		al.add(s4);
		map.put("engineeringStudent", al);
		
		
		List<Student> al2 = new ArrayList<>();
		Student ss1 = new Student().setSid(1).setSname("Dilip").setScity("Nashik").setSpercentage(89.00);
		Student ss2 = new Student().setSid(2).setSname("Harsh").setScity("Pune").setSpercentage(78.00);
		Student ss3 = new Student().setSid(3).setSname("Rush").setScity("Delhi").setSpercentage(69.00);
		Student ss4 = new Student().setSid(4).setSname("Abhi").setScity("Goa").setSpercentage(84.00);
		al2.add(ss1);
		al2.add(ss2);
		al2.add(ss3);
		al2.add(ss4);
		map.put("medicalStudent", al2);
		
	
		List<String> al3 = new ArrayList();
			al3.add("Cricket");
			al3.add("Football");
			al3.add("batmenten");
			al3.add("KhoKho");
			al3.add("Gotya");
		map.put("hobbies", al3);
		
		return map;
	}
	

}
