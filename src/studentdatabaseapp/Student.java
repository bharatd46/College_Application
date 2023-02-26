package studentdatabaseapp;

import java.util.Scanner;

public class Student {
	private String firstName;
	private String lastName;
	private int gradYear;
	private String studentID;
	private String courses;
	private int tutionBalance = 0;
	private static int costOfCourse = 600;
	private static int id = 1000;
	
	//constructer: prompt user to enter students name and year
	public Student() {
		Scanner in = new Scanner(System.in);
		System.out.print("enter student first name: ");
		this.firstName = in.nextLine();
		
		System.out.print("enter student last name: ");
		this.lastName = in.nextLine();
		
		System.out.print("1 - freshmen\n2 - Sophmore\n3 - Junior\n4 - Senior\nEnter student class level: ");
		this.gradYear = in.nextInt();
		
		setStudentID();
		System.out.println(firstName +" "+ lastName +" "+ gradYear + " " + studentID);
		
	}
	//Genrate an ID
	private void setStudentID() {
		//grad level + ID
		id++;
		this.studentID = gradYear + "" + id;
	}
	
	//enroll in courses
	public void enroll() {
		//get inside a loop, user hits 0
		do {
			System.out.print("Enter course to enroll (Q to quit): ");
			Scanner in = new Scanner(System.in);
			String course = in.nextLine();
			if (!course.equals("Q")) {
				courses = courses +"\n"+course;
				tutionBalance = tutionBalance + costOfCourse;
			}
			else {
				break;
				}
		}
		while (1!=0);
		System.out.println("Enrolled In: " + courses);
		}
	
	//view balance
	public void viewBalance() {
		System.out.println("your balance is: $" +tutionBalance);
		
	}
	
	//Pay tution
	public void payTuition() {
		viewBalance();
		System.out.print("Enter your payment: $");
		Scanner in = new Scanner(System.in);
		int payment = in.nextInt();
		tutionBalance = tutionBalance - payment;
		System.out.println("Thank you for your payment of $" + payment);
		viewBalance();	
	}
	
	//show status
	public String toString() {
		return "name: " +firstName+ " " +lastName +
				"\nGrade level: " +gradYear+
				"\nStudentID: " +studentID+
				"\nCourses Enrolled: " +courses+
				"\nBalance: $" +tutionBalance;
	}

}
