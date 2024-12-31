package JDBC;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class Class3 {
	public static void main(String[] args) throws SQLException, ClassNotFoundException 
	{
	String url="jdbc:mysql://localhost:3306/studdb";
	String user="root";
	String password="root";
	
	Class.forName("com.mysql.cj.jdbc.Driver");
	Connection connection = DriverManager.getConnection(url,user,password);
	System.out.println("Connection done....");
	
	//create a table
	//operations.createTable(connection);
	
	//insert a record
	//operations.insertRecord(connection,"Rajesh",01);
	//operations.insertRecord(connection,"Vandana",02);
	
	//read and display records
	//operations.readRecords(connection);
	
	//delete a record
	operations.deleteRecord(connection, 2);
	
	connection.close();
	System.out.println("All objects closed");

	
}
}
