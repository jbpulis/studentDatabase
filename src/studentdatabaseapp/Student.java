package studentdatabaseapp;

import java.util.*;

public class Student {
	private String firstName;
	private String lastName;
	private int gradeYear;
	private String studentID;
	private String courses;
	private int tuitionBalance;
	private static int costOfCourse = 600;
	private static int id = 1000;
	
	// Constructor: prompt user to enter name and year
	public Student() {
		Scanner in = new Scanner(System.in);
		System.out.println("Enter student first name: ");
		this.firstName = in.nextLine();
		
		System.out.println("Enter student last name: ");
		this.lastName = in.nextLine();
		
		System.out.println("1 - Freshman\n2 - Sophmore\n3 - Junior\n4 - Senior\nEnter student class level: ");
		this.gradeYear = in.nextInt();
		
		setStudentID();
		
		System.out.println(firstName + " " + lastName + " " + gradeYear + " " + studentID);
	}
	
	// generate an ID
	private void setStudentID() {
		// grade level + ID
		id++;
		this.studentID = gradeYear + "" + id;
	}
	
	// enroll in courses
	
	
	// view balance and pay tuition
	
	
	// show status
	
	
	
}
