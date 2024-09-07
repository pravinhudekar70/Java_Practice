package com.demo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.demo.entity.Student;
import com.demo.service.StudentService;

@RestController
@RequestMapping( value = "/student")
public class StudentController {
	@Autowired
	StudentService sc ;
	
	@GetMapping( value = "/")
	public String m1() {
		return "Welcome to my site";
	}
	
	@PostMapping( value = "/save")
	public Student m2(@RequestBody Student s) {
		return sc.save(s);
	}
	
	@GetMapping( value = "/findAll")
	public List<Student> m3(){
		return sc.findAll();
	}
	@DeleteMapping(value = "/deleteById")
	public String m4(@RequestParam int sid) {
				sc.deleteBySid(sid);
				return "Student delete Successfully";
	}
	
	@GetMapping(value = "/findByAny/{str}")
	public List<Student> m4(@PathVariable String str){
		return sc.findByAny(str);
	}

	
}
