package model;

import java.sql.ResultSet;
import java.sql.SQLException;

public class Students {
  private int rollNumber;
  private String name;
  private String gender;
  private int standard;
  private int age;
  private String emailId;
  private String mobileNumber;
  
  public Students(ResultSet resultSet) {
	 try {
		this.setRollNumber(resultSet.getInt(1));
		this.setName(resultSet.getNString(2));
		this.setGender(resultSet.getNString(3));
		this.setStandard(resultSet.getInt(4));
		this.setAge(resultSet.getInt(5));
		this.setEmailId(resultSet.getNString(6));
		this.setMobileNumber(resultSet.getNString(7));		
	} catch (SQLException e) {
		e.printStackTrace();
	}
  }
   public int getRollNumber() {
	 return rollNumber;
   }
   public void setRollNumber(int rollNumber) {
	 this.rollNumber = rollNumber;
   }
   public String getName() {
   	 return name;
   }
   public void setName(String name) {
	 this.name = name;
   }
   public String getGender() {
	 return gender;
   }
   public void setGender(String gender) {
	 this.gender = gender;
   }
   public int getStandard() {
	 return standard;
   }
   public void setStandard(int standard) {
	 this.standard = standard;
   }
   public int getAge() {
	 return age;
   }
   public void setAge(int age) {
	 this.age = age;
   }
   public String getEmailId() {
	 return emailId;
   }
   public void setEmailId(String emailId) {
	 this.emailId = emailId;
   }
   public String getMobileNumber() {
	 return mobileNumber;
   }
   public void setMobileNumber(String mobileNumber) {
	 this.mobileNumber = mobileNumber;
   }  
}
