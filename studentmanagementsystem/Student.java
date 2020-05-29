package studentmanagementsystem;

import java.util.Scanner;

class Student {
	private static int ID = 1000;
	private int Age;
	private int Level;
	private int costOfCost= 600;
	private int Balance;
	private String studentID;
	private String firstName;
	private String lastName;
	private String Department;
	private String Faculty;
	private String Email;
	private String Courses = "Enrolled Courses: " ;
	
	//Constructor: prompts to enter student details
	public Student() {
		Scanner input = new Scanner(System.in);
		System.out.print("Enter Student First Name: ");
		this.firstName	=	input.nextLine();
		System.out.print("Enter Student Last Name: ");
		this.lastName	=	input.nextLine();
		System.out.print("Enter Student Faculty: ");
		this.Faculty	=	input.nextLine();
		System.out.print("Enter Student Department: ");
		this.Department	=	input.nextLine();
		System.out.print("Enter Student Age: ");
		this.Age	=	input.nextInt();
		System.out.print("Enter Student Level: ");
		this.Level	=	input.nextInt();
		setStudentID();
		
		System.out.println("Student ID:\t" + this.studentID);
		System.out.println("Student Name\t" + this.firstName + " " + this.lastName);
		System.out.println("Age\t\t" + this.Age);
		System.out.println("Level\t\t" + this.Level);
		System.out.println("Faculty\t\t" + this.Faculty);
		System.out.println("Department\t" + this.Department);
		}
	
	
	
	//Generates Student ID
	private void setStudentID(){ 
		ID++;
		studentID = this.Level + "" + this.ID; 
		}
	
	//Enroll method.
	public void Enroll() {
	do {	
		Scanner input = new Scanner(System.in);
		input.reset();
		System.out.print("Enter course or Course to enroll student. (Q to Quit): ");
		String course = input.nextLine();
		if((course.equals("Q") || course.equals("q")))
			break;
		this.Courses += "\n" + course;
		System.out.println(Courses);
		
		}while(true);
	}

}
