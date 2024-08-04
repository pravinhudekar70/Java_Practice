package com.demo.service;

import org.springframework.beans.factory.annotation.Autowired;

import com.demo.dao.StudentDao;

public class StudentServiceImpl implements StudentService {

	@Autowired
	private StudentDao sd;
}
