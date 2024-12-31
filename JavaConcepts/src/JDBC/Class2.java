package JDBC;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class Class2 {
public static void main(String[] args) throws ClassNotFoundException, SQLException {
	String url="jdbc:mysql://localhost:3306/studdb";
	String user="root";
	String password="root";
	
	Class.forName("com.mysql.cj.jdbc.Driver");
	Connection con = DriverManager.getConnection(url,user,password);
	System.out.println("Connection done....");
	
	Statement statement=con.createStatement();
	String query="select * from employee";
	
	ResultSet resultset=statement.executeQuery(query);
	while(resultset.next())
	{
		System.out.println(resultset.getString("name")+" "+resultset.getInt("age"));
	}
	resultset.close();
	statement.close();
	con.close();
	System.out.println("All objects closed");
}
}
