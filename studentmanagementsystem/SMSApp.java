package studentmanagementsystem;

import java.util.Scanner;

class SMSApp {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
	System.out.println("\t\t\tStudent Management System\n");
	System.out.print("Enter number of Students to Enroll");
	int numOfStudent = input.nextInt();
	Student [] Students = new Student[numOfStudent];
	
	
	for (int i = 0; i < numOfStudent; i++) {
		Students[i] = new Student();
		Students[i].Enroll(i);
		Students[i].showInfo();
		System.out.print("Enter amount to pay tuition fee: ");
		double fee = input.nextDouble();
		Students[i].PayTuitionFee(fee);
	}
	
	
	
	input.close();
	}

}
