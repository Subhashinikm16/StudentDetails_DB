package controller;

import java.sql.Connection;
import java.sql.DriverManager;

public class DBConnection {
	static Connection connect=null;
	public void connection() {
		try {
			connect= DriverManager.getConnection("jdbc:mysql://localhost:3306/studentDetails", "root", "Subha@16");
		} catch (Exception e) {
			e.printStackTrace();
		}	
    }
}
