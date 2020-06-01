package bankaccountapp;

class Savings extends Account {
	//properties specific to Savings Account
	private int safetyDepositBoxID;
	private int safetyDepositBoxKey;
	
	Savings(String Name, String SSN, double initialDeposit){
		super(Name, SSN, initialDeposit);
		accountNumber = "1"+accountNumber;
		setSafetyDepositBox();
	}

	public void showInfo() {
		System.out.println("Account Type:\t"+"Savings");
		super.showInfo();
		System.out.println("Your savings account details\n"
				+ "\tSafety deposit box ID:\t"+safetyDepositBoxID +"\n"
							+ "\tSafety deposit box key:\t"+safetyDepositBoxKey);
	}
private void setSafetyDepositBox() {
	safetyDepositBoxID = (int) (Math.random()* Math.pow(10,3));
	safetyDepositBoxKey = (int) (Math.random()*Math.pow(10,4));
}

@Override
public void setRate() {
	
Rate = getBaseRate() * 0.15;	
}


}
