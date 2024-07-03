package com.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        System.out.println( "Program started " );
        
        Connection con = null;
        PreparedStatement pst = null;
        int check = 0;
        try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			System.out.println("Diver loaded successfully");
			
			con = DriverManager.getConnection("jdbc:mysql://localhost:3306/jap67","root","prAvin@1234");
			
			String query = "insert into student(sName, sCity) values(?,?)";
			
			pst = con.prepareStatement(query);
			pst.setString(1,"Rahul");
			pst.setString(2, "Akola");
			
			check = pst.executeUpdate();
			System.out.println("recort update: "+ check);
			
		} catch (ClassNotFoundException | SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
        finally {
			try {
				pst.close();
				con.close();
				
			} catch (SQLException e2) {
				// TODO: handle exception
			}
		}
        
    }
}
