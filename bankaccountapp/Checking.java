package bankaccountapp;

class Checking extends Account {
	//properties specific to Checking account
	private int debitCardNumber;
	private int debitCardPin;
	
	//Constructor to initialize checking account properties
	Checking(String Name, String SSN, double initialDeposit){
		super(Name, SSN, initialDeposit);
		accountNumber = "2"+accountNumber;
		setDebitCard();
	}
	
	public void showInfo() {
		System.out.println("Account Type:\t"+"Checking");
		super.showInfo();
		System.out.println("Your Checking account details\n"
				+ "\tDebit card number:\t"+debitCardNumber +"\n"
							+ "\tDebit card pin:\t\t"+debitCardPin);
			
	}
	
private void setDebitCard() {
	debitCardNumber	=	(int) (Math.random()* Math.pow(10,12));
	debitCardPin	=	(int) (Math.random()* Math.pow(10,4));
}

@Override
public void setRate() {
	
Rate = getBaseRate() - 0.25;	
}

}
