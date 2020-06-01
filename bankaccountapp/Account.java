package bankaccountapp;

abstract class  Account implements BaseRate{
	//Shared properties of savings and checking
	
private String Name;
private String SSN;
protected String accountNumber;
private double Balance;
protected double Rate;
static int index = 10000;
	
	//constructor to initialize common account properties	
Account(String Name, String SSN, double initialDeposit){
		this.Name	=	Name;
		this.SSN	=	SSN;
		this.Balance	=	initialDeposit;
		accountNumber = setAccountNumber();
		setRate();
		
		index++;
	}
public abstract void setRate();
	
	//Account number generator
private String setAccountNumber() {
	//get last two SSN digits.
	String lastTwo = SSN.substring(SSN.length()-2,SSN.length());
	
	//Unique 5 digit number
	int uniqueNumber = index;
	
	//3 digit random number
	int randomNumber = (int) (Math.random()*Math.pow(10,3));
	
	
	return lastTwo+uniqueNumber+randomNumber;
}

public void showInfo() {
	System.out.println("Account Name:\t"	+	this.Name +	"\n"	+
						"Account Number:\t"	+	this.accountNumber +	"\n"	+
						"Balance:\t"		+	this.Balance);
}


//Transaction Methods

//Deposit method
public void Deposit(double Amount) {
	this.Balance += Amount;
	System.out.println("Successfully deposited\t\t $"+Amount);
	printBalance();
}

//Withdraw method
public void Redraw(double Amount) {
	this.Balance -= Amount;
	System.out.println("Successfully withdrawn\t\t $"+Amount);
	printBalance();
	
}

//Transfer method
public void transferMoney(String toWhere,double Amount) {
	this.Balance -= Amount;
	//toWhere.add(Amount);
	System.out.println("Successfully transferred\t $" +Amount+" to "+toWhere);
	printBalance();
}

public void printBalance() {
	System.out.println("Your Balance is\t\t\t $"+this.Balance);
}

}
