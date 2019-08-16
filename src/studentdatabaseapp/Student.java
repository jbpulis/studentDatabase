package studentdatabaseapp;

import java.util.*;

public class Student {
	private String firstName;
	private String lastName;
	private int gradeYear;
	private String studentID;
	private String courses = null;
	private int tuitionBalance = 0;
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
	public void enroll() {
		// get inside a loop, user hits Q to exit
		do {	
			System.out.println("Enter course to enroll (Q to quit): ");
			Scanner in = new Scanner(System.in);
			String course = in.nextLine();
			if (!course.contentEquals("Q")) {
				courses = courses + "\n" + course;
				tuitionBalance = tuitionBalance + costOfCourse;
			}
			else { break; }
		} while ( 1 != 0 );
		
		System.out.println("ENROLLED IN: " + courses);
		System.out.println("TUITION BALLANCE: " + tuitionBalance);
	}
	
	// view balance and pay tuition
	
	
	// show status
	
	
	
}
