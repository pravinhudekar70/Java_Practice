package com.jdbcDemo;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.Random;
import com.dao.EmployeeDao;
import com.model.Employee;

public class App 
{
    public static void main( String[] args )
    {
//        // Insert Employee
//    	Employee em = new Employee();
//        em.setEname("Sham bhau");
//        em.setEcompany("cognizant");
//        em.setEdesignation("Software Developer");
//        em.setEsalary(60000.00);
//        
//        EmployeeDao ed = new EmployeeDao();
//        System.out.println("Record inserted: "+ed.insertEmployee(em));

    	
//    	//insert random employee
//    	addRandomEmployee();
    	
//    	//delete by id 
//    	EmployeeDao ed = new EmployeeDao();
//    	System.out.println("Record delete: "+ed.deleteEmployeeByEid(1));
//        
    	
//    	//find by employee id 
//    	EmployeeDao ed  = new EmployeeDao();
//    	System.out.println(ed.findEmployeeByEid(2));
// 
    	
//    	//find by employee by esalary 
//    	EmployeeDao ed  = new EmployeeDao();
//    	System.out.println(ed.findEmployeeByEsalary(34341.07));
//  
    	
//    	//find all Employee
//    	EmployeeDao ed  = new EmployeeDao();
//    	for(Employee e:ed.findAllEmployee()) {
//    		System.out.println(e);
//    	}
    	
//    	//update employee
//    	Employee em = new Employee();
//    	EmployeeDao ed = new EmployeeDao();
//    	em = ed.findEmployeeByEid(2);
//    	em.setEname("Ram Bhau");
//    	System.out.println("Updated record: "+ed.updateEmployee(em));
//    	
    	
//    	// find employee by name
//    	EmployeeDao ed = new EmployeeDao();
//    	for(Employee e: ed.findEmployeeByEname("Ram Bhau")) {
//    		System.out.println(e);
//    	}
    
//    	// find employee by ename and edesignation
//    	EmployeeDao ed = new EmployeeDao();
//    	for(Employee e: ed.findEmployeeByEnameAndEdesignation("PPQANSLWWUTYXHN", "NKVNNEXIOLKOQLD")) {
//    		System.out.println(e);
//    	}
    	
//    	// find employee by ename or edesignation
//    	EmployeeDao ed = new EmployeeDao();
//    	for(Employee e: ed.findEmployeeByEnameOrEdesignation("PPQANSLWWUTYXHN", "CUVFYMRPAEOXDJA")) {
//    		System.out.println(e);
//    	}
    	
//    	//find  employee by salary less than
//    	EmployeeDao ed  = new EmployeeDao();
//    	for(Employee e :ed.findEmployeeByEsalaryLessThan(5000)) {
//    		System.out.println(e);
//    	}

//    	//find employee salary between low and high
//    	EmployeeDao  ed = new EmployeeDao();
//    	for(Employee e :ed.findEmployeeByEsalaryBetween(4000, 10000)) {
//    		System.out.println(e);
//    	}
    	
//    	//find employee by salary not between low and high
//    	EmployeeDao  ed = new EmployeeDao();
//    	for(Employee e :ed.findEmployeeByEsalaryNotBetween(4000, 10000)) {
//    		System.out.println(e);
//    	}
    	
//    	//find Employee By Ename Like 
//    	EmployeeDao ed = new EmployeeDao();
//    	for(Employee e :ed.findEmployeeByEnameLike("AA")) {
//    		System.out.println(e);
//    	}
//    	
//    	//find Employee By Eid In(List<Integer> id)
//    	EmployeeDao ed  = new EmployeeDao();
//    	List<Integer> id = new ArrayList<Integer>();
//    	id.add(3);
//    	id.add(4);
//    	id.add(5);
//    	id.add(6);
//    	id.add(7);
//    	for(Employee e:ed.findEmployeeByEidIn(id)) {
//    		System.out.println(e);
//    	}
    	
//    	//find employee by like string 
//    	EmployeeDao ed = new EmployeeDao();
//    	for(Employee e:ed.findEmployeeByLikeString("AB")){
//    		System.out.println(e);
//    	}
    	
//    	//find by any
//    	EmployeeDao ed = new EmployeeDao();
//    	for(Employee e:ed.findByAny("59")) {
//    		System.out.println(e);
//    	}
    	
    	//find list of Employee by name contains or designation contains
    	EmployeeDao ed = new EmployeeDao();
    	Map<String, List<Employee>> map =
    			ed.findEnployeeListLikeByEnameOrListByEdesignation("ZZ", "ABC");
    	//by ename
    	for(Employee e: map.get("ename")) {
    		System.out.println(e);
    	}
    	System.out.println("--------------------------------------------");
    	// by edesignation
    	for(Employee e:map.get("edesignation")) {
    		System.out.println(e);
    	}
    }
    public static void addRandomEmployee() {
    	for(int i =1; i<=4000;i++) {
    		Employee e  = new Employee();
    		StringBuilder name = new StringBuilder();
    		StringBuilder designation = new StringBuilder();
    		StringBuilder company = new StringBuilder();
    		for(int j =1;j<=15;j++) {
    			name.append((char)(new Random().nextInt(26)+65));
    			designation.append((char)(new Random().nextInt(26)+65));
    			company.append((char)(new Random().nextInt(26)+65));
     		}
    		e.setEname(name.toString());
    		e.setEdesignation(designation.toString());
    		e.setEcompany(company.toString());
    		e.setEsalary(new Random().nextDouble()*1000000);
    		System.out.println(new EmployeeDao().insertEmployee(e));	
    		}
    	}
  }

