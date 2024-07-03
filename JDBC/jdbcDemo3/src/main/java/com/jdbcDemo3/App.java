package com.jdbcDemo3;

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
       // Insert
//    	Student s1 = new Student();
//        s1.setSname("Jayesh Buke");
//        s1.setScity("Wardha");
//        s1.setSpercentage(77.89); 
//        StudentDao  sb = new StudentDao();
//        System.out.println("record insert: "+sb.insertStudent(s1));
    	
    	// delete by id 
//    	StudentDao sb = new StudentDao();
//    	System.out.println("record deleted: "+ sb.deleteStudentBySid(2));
    
    	//find by id
//    	StudentDao sb = new StudentDao();
//    	System.out.println(sb.findStudentBySid(5));
    	
    	//find All Student
    	StudentDao  sb = new StudentDao();
    	for(Student s:sb.findAllStudent()) {
    		System.out.println(s);
    	}
    	
//    	//update
//    	StudentDao  sb  = new StudentDao();
//    	Student s = sb.findStudentBySid(4);
//    	s.setSname("Raju Rao");
//    	System.out.println("updated record: "+ sb.updateStudent(s));
//    	
    	
    }
}
