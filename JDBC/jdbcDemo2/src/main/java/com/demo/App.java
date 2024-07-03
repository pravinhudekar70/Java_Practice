package com.demo;

import java.util.List;

import com.dao.StudentDao;
import com.model.Student;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
    	//Insert
//        Student s = new Student();
//        s.setSname("rajesh Rane");
//        s.setScity("Dhule");
//        s.setSpercentage(55.80);
//        StudentDao sd = new StudentDao();
//        System.out.println("record insert: "+sd.insertStudent(s));
    	
    	// Delete by id 
//    	StudentDao sb =  new StudentDao();
//    	System.out.println("record delete: "+sb.deleteStudentById(1));
    	
//    	//find by id 
//    	StudentDao sb  = new StudentDao();
//    	System.out.println(sb.findStudentBySid(4));
  
 	// display all 
//    	StudentDao sb = new StudentDao();
//    	List<Student> list = sb.findAllStudent();
//    	for(Student s:list) {
//    		System.out.println(s);
//    	
//    	}
    	 StudentDao sb = new StudentDao();
    	 Student s = sb.findStudentBySid(3);
    	 //s.setSname("Rahul Jadhav");
    	 s.setSname("rajesh Rane");
    	 s.setScity("Dhule");
    	 s.setSpercentage(55.80);
    	 System.out.println(sb.updateStudent(s));
    	
    	
    	
    	
    }
}
