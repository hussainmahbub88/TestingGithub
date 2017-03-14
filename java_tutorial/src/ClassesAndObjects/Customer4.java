package ClassesAndObjects;

public class Customer4 {
	String firstName;
	String lastName;
	Account4 acc;

	public void addAccount(double initialBalance) {
		acc = new Account4();
		//acc.display();
		acc.accountId = Account4.getNextId();
		acc.balance = initialBalance;
		//System.out.println(acc.accountId + "added");
		//System.out.println("Account added for : " + firstName + " " + lastName);
		acc.display();
		
	}
	
	public void addAccount(){
		acc = new Account4();
		acc.accountId = Account4.getNextId();
		acc.balance = 50;
		acc.display();
	}

}
