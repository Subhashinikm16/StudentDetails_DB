package view;

import java.util.Scanner;

import controller.AddingStudents;
import controller.SearchStudent;
import controller.ViewAllStudents;

public class HomePage {
	public void start() {
		Scanner scanner=new Scanner(System.in);
		boolean starting=true;
		while(starting) {
			System.out.println("Enter Any Option:");
			System.out.println("1.Add a Student Details\n2.View All Student Details\n3.View Particular Student Details\n4.Exit");
			int choice=scanner.nextInt();
			switch(choice) {
			case 1:{
				AddingStudents addNewStudent=new AddingStudents();
				System.out.print("Enter Student's Name:");
				String name=scanner.next();
				System.out.print("Enter Gender:");
				String gender=scanner.next();
				System.out.print("Enter Standard:");
				int standard=scanner.nextInt();
				System.out.print("Enter Age:");
				int age=scanner.nextInt();
				System.out.print("Enter Email Id:");
				String emailId=scanner.next();
				System.out.print("Enter Mobile Number:");
				String mobileNumber=scanner.next();
				addNewStudent.addNewStudent(name,gender,standard,age,emailId,mobileNumber);
			}
			break;
			case 2:{
				ViewAllStudents viewAllStudents=new ViewAllStudents();
				viewAllStudents.allStudents();
			}
			break;
			case 3:{
				SearchStudent searchingStudent=new SearchStudent();
				System.out.println("Enter Student's Name and Mobile Number to get details:");
				System.out.println("Name:");
				String name=scanner.next();
				System.out.println("MobileNumber:");
				String mobileNumber=scanner.next();
				searchingStudent.searchStudent(name,mobileNumber);
			}
			break;
			case 4:{
				starting=false;
			}
			}
		}
	}
}
