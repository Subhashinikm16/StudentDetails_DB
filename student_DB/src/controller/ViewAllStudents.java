package controller;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import model.Students;

public class ViewAllStudents {
	DBConnection dbConnection=new DBConnection();
	PreparedStatement preparedStatement=null;
	ResultSet resultSet=null;
	public void allStudents() {
		// TODO Auto-generated method stub
		dbConnection.connection();
		try {
			preparedStatement=DBConnection.connect.prepareStatement("SELECT * FROM studentInformations");// WHERE student_id=?
			resultSet=preparedStatement.executeQuery();
			System.out.println("**************************************Student Detail*****************************************");
			System.out.println("+----------------------------------------------------------------------------------------------------------------------------+");
			System.out.printf("%-14s %-25s %-15s %-10s %-15s %-20s %-20s","Roll Number","Name","Gender","Standard","Age","Email Id","Mobile Number");
			System.out.println();
			System.out.println("+----------------------------------------------------------------------------------------------------------------------------+");
			while(resultSet.next())
			{
				Students stuObj=new Students(resultSet);
				System.out.printf("%-14s %-25s %-15s %-10s %-15s %-20s %-20s",stuObj.getRollNumber(),stuObj.getName(),stuObj.getGender(),stuObj.getStandard(),stuObj.getAge(),stuObj.getEmailId(),stuObj.getMobileNumber());
				System.out.println();
				System.out.println("+----------------------------------------------------------------------------------------------------------------------------+");
				
			}	
		} catch (SQLException e) {
			
			e.printStackTrace();
		}
	}

}
