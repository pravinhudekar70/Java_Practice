package com.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

import com.demo.model.Employee;
import com.demo.service.EmployeeService;

@SpringBootApplication
public class App {

	public static void main(String[] args) {
		ApplicationContext contaxt = SpringApplication.run(App.class, args);

		EmployeeService ss = contaxt.getBean(EmployeeService.class);
		Employee e = new Employee();
		e.setEname("Ravi Shastri");
		e.setEcompany("TCS");
		e.setEdesignation("Software Developer");
		e.setEsalary(50000);

		System.out.println(ss.save(e));
	}

}
