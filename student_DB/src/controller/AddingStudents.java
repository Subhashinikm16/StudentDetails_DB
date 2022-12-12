package controller;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class AddingStudents {
	DBConnection dbConnection=new DBConnection();
	int rows=0;
	public void addNewStudent(String name, String gender, int standard, int age, String emailId, String mobileNumber) {
		dbConnection.connection();
		try {
			PreparedStatement preparedStatement=DBConnection.connect.prepareStatement("INSERT INTO studentInformations (name,gender,standard,age,emailId,mobileNumber) VALUES(?,?,?,?,?,?)");
		    preparedStatement.setString(1, name);
			preparedStatement.setString(2, gender);
			preparedStatement.setInt(3, standard);
			preparedStatement.setInt(4, age);
			preparedStatement.setString(5,emailId);
			preparedStatement.setString(6, mobileNumber);
			rows=preparedStatement.executeUpdate();
			if(rows>0)System.out.println("Successfully Added New Student");
			System.out.println(rows+" rows affected");
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
