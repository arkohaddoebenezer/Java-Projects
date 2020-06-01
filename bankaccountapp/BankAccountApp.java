package bankaccountapp;

import java.util.LinkedList;
import java.util.List;

class BankAccountApp {

	public static void main(String[] args) {
		String File = "D:\\Eclipse\\JavaProjects\\src\\NewAccounts.csv";
		List <Account> accounts = new LinkedList<Account>();
		
		//Read CSV File and Create new account with that data.
		
		List <String[]> accountHolders = utilities.CSV_Reader.Read(File);
		for (String[] accountHolder : accountHolders) {
			String Name	=	accountHolder[0];
			String SSN	=	accountHolder[1];
			String accountType	=	accountHolder[2];
			double initialDeposit	= Double.parseDouble(accountHolder[3]);
			
			if(accountType.equals("Savings")) {
				accounts.add(new Savings(Name, SSN, initialDeposit));
				
			}else if(accountType.equals("Checking")) {
				accounts.add(new Checking(Name, SSN, initialDeposit));
				
			}else {
				System.out.println("Invalid Account Type "+Name+" account creation aborted");
			}
		}
		
		for(Account acc : accounts) {
			acc.showInfo();
		}

	}

}
