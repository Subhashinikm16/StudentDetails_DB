package controller;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import model.Students;

public class SearchStudent {
	DBConnection dbConnection=new DBConnection();
	PreparedStatement preparedStatement=null;
	ResultSet resultSet=null;
	public void searchStudent(String name, String mobileNumber) {
		// TODO Auto-generated method stub
		dbConnection.connection();
		try {
			preparedStatement=DBConnection.connect.prepareStatement("Select * from studentInformations where name='"+name+"' and mobileNumber='"+mobileNumber+"'");
			resultSet=preparedStatement.executeQuery();
		if(resultSet.next())
			{
			System.out.println("**************************************Student Detail*****************************************");
			System.out.println("+----------------------------------------------------------------------------------------------------------------------------+");
			System.out.printf("%-14s %-25s %-15s %-10s %-15s %-20s %-20s","Roll Number","Name","Gender","Standard","Age","Email Id","Mobile Number");
			System.out.println();
			System.out.println("+----------------------------------------------------------------------------------------------------------------------------+");
			
				Students stuObj=new Students(resultSet);
				do{
					System.out.printf("%-14s %-25s %-15s %-10s %-15s %-20s %-20s",stuObj.getRollNumber(),stuObj.getName(),stuObj.getGender(),stuObj.getStandard(),stuObj.getAge(),stuObj.getEmailId(),stuObj.getMobileNumber());
					System.out.println();
					System.out.println("+----------------------------------------------------------------------------------------------------------------------------+");
				}while(resultSet.next());
			}
			else
			{
				System.out.println("Record Not Found...");
			}
		} catch (SQLException e) {
			
			e.printStackTrace();
		}
	}
}
