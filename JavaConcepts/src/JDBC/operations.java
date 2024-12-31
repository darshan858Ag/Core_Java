package JDBC;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;


public class operations {

	//create a table
public static void createTable(Connection connection) throws SQLException 
{
	String createTablesql="create table if not exists employee(id int auto_increment primary key,name varchar(20),age int)";
	Statement statement=connection.createStatement();
	statement.execute(createTablesql);
	System.out.println("Table has been Created");
	statement.close();
}

public static void insertRecord(Connection connection, String name, int age) throws SQLException
{
	

	String insertSql="insert into employee(name,age) values(?,?)";
	PreparedStatement preparedStatement=connection.prepareStatement(insertSql);
	preparedStatement.setString(1, name);
	preparedStatement.setInt(2, age);
    preparedStatement.executeUpdate();
    preparedStatement.close();
	System.out.println("data has been inserted into the table");
	System.out.println("Statement object closed");
}

public static void readRecords(Connection connection) throws SQLException {
	
	String selectSql="select * from employee";
	Statement statement=connection.createStatement();
	ResultSet resultSet=statement.executeQuery(selectSql);
	while(resultSet.next())
	{
		int id=resultSet.getInt("id");
	String name= resultSet.getString("name");
	int age=resultSet.getInt("age");
	System.out.println(id+" "+name+" "+age);
	}
	resultSet.close();
	statement.close();
	
}

public static void deleteRecord(Connection connection, int id) throws SQLException {
	
	String deleteQuery = "delete from employee where id=?";
	PreparedStatement preparedStatement=connection.prepareStatement(deleteQuery);
	preparedStatement.setInt(1, id);
	preparedStatement.executeUpdate();
	preparedStatement.close();
	System.out.println("Data has been deleted");
}


	
	

}
