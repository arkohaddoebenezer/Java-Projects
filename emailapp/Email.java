package emailapp;

import java.util.Scanner;

class Email {
private String firstName;
private String Password;
private String lastName;
private String Department;
private String Email;
private String alternateEmail;
private String companySuffix = "companyname.com";
private int mailBoxCapacity = 500;


//constructor to receive first name and last name

 public Email(String firstName, String lastName) {
	 this.firstName = firstName;
	 this.lastName	= lastName;
	 
	 // call setDepartment method
	 this.Department = setDepartment();
	 
	 //call randomPassword method
	 this.Password = randomPassword(8);
	 
	 //generate company's email.
	 this.Email = this.firstName.toLowerCase() + this.lastName.toLowerCase() + "@" + this.Department + "." + this.companySuffix;
 }
 
//setter Methods
 
 //set department method
 private String setDepartment() {
	 System.out.print("Enter Department\n1.Sales\n2.Development\n3.Accounting\n0.None\n");
	 var input = new Scanner(System.in); 
	 try {
	 int department = input.nextInt();
	 if(department==1) {return "Sales";}
	 else if(department==2) {return "Development";}
	 else if(department==3) {return "Accounting";}
	 else if(department==0) {return "None";}
	 else {System.out.println("Choose from the options below"); return setDepartment();}
	 }
	 finally {
		 input.close();
	 }
 }
 
 //Set random password method
 private String randomPassword(int length) {
	 String passwordSet ="ABCD1234EFGHIJKLM567890NOPQRSTUVWXYZabcdef!@#$%^&ghijklmnopqr*()_~:?><stuvwxyz";
	 char[] password = new char[length];
	 for (int i = 0; i < length; i++) {
		int rand = (int) (Math.random() * passwordSet.length());
		password[i] = passwordSet.charAt(rand); }
	 return new String(password) ;
}
 
 //Set Alternate Email
 public void setAlternateEmail(String alternateEmail) { this.alternateEmail = alternateEmail; }
 
 //Set new password
 public void changePassword(String Password) { this.Password = Password; }
 
 //set mailbox capacity
 public void mailBoxCapacity(int capacity) { this.mailBoxCapacity = capacity;}
 
 //Getter methods
 public String getAlternateEmail() { return this.alternateEmail; }
 public int getEmailCapacity() { return this.mailBoxCapacity; }
 
 public String showInfo() {
	 return  "Display Name:\t" + this.firstName + " " + this.lastName + "\n" +
			 "Department:\t" + this.Department +"\n"+
			 "Company Email:\t" + this.Email + "\n" +
			 "Password:\t" + this.Password + "\n" +
			 "Mail Capacity:\t" + this.mailBoxCapacity + "\n";
		 
 }

}
