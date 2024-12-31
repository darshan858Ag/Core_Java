package JDBC;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class Class1 {
public static void main(String[] args) {
	
	String url="jdbc:mysql://localhost:3306/studdb";
	String user="root";
	String password="root";
	
	try
	{
		Class.forName("com.mysql.cj.jdbc.Driver");
		Connection con = DriverManager.getConnection(url,user,password);
		System.out.println("Connection done....");
		
	}catch (ClassNotFoundException e) {
		e.printStackTrace();
	}catch (SQLException e)
	{
		e.printStackTrace();
	}
}
}
