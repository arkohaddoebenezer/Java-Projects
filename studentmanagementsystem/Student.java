package studentmanagementsystem;

import java.util.Scanner;

class Student {
	private static int ID = 1000;
	private int Age;
	private int Level;
	private double costOfCourse = 600;
	private double tuitionFee;
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
		System.out.print("Enter Student E-mail: ");
		this.Email	=	input.nextLine();
		System.out.print("Enter Student Faculty: ");
		this.Faculty	=	input.nextLine();
		System.out.print("Enter Student Department: ");
		this.Department	=	input.nextLine();
		System.out.print("Enter Student Age: ");
		this.Age	=	input.nextInt();
		System.out.print("Enter Student Level: ");
		this.Level	=	input.nextInt();
		setStudentID();
		input.close();
		}
	
	
	
	//Generates Student ID
	private void setStudentID(){ 
		ID++;
		studentID = this.Level + "" + ID; 
		}
	
	//Enroll method.
	public void Enroll(int i) {
		Scanner in = new Scanner(System.in);
	do {	
		
		System.out.print("Enter course or Course code to enroll student "+(i+1 ) + ". (Q to Quit): ");
		String course = in.nextLine();
		if((course.equals("Q") || course.equals("q")))
			break;
		this.Courses += "\n" + course;
		this.tuitionFee += costOfCourse;
		System.out.println(Courses);
		System.out.println("Course enrolled successfully");
		checkBalance();
		
		}while(true);
	in.close();
	}
	
	public void checkBalance() {
		System.out.println("Total Tuition Fee:\t"+this.tuitionFee);
	}
	
	
	public void PayTuitionFee(double amount) {
		tuitionFee -= amount;
		System.out.println(amount + " paid successfully");
		checkBalance();
	}
	
	public void showInfo() {
		System.out.println("Student ID:\t" + this.studentID);
		System.out.println("Student Name\t" + this.firstName + " " + this.lastName);
		System.out.println("Age\t\t" + this.Age);
		System.out.println("Email\t\t" + this.Email);
		System.out.println("Level\t\t" + this.Level);
		System.out.println("Faculty\t\t" + this.Faculty);
		System.out.println("Department\t" + this.Department);
		System.out.println("Balance:\t\t"+this.tuitionFee);
		System.out.println(this.Courses);
	}
	
	
	

}
