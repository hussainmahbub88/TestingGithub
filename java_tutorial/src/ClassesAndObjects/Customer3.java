package ClassesAndObjects;

public class Customer3 {
	String firstName;
	String lastName;
	Account3 acc;

	public void addAccount(double initialBalance) {
		acc = new Account3();
		acc.accountId = "ACCT ID = " + Account3.nextId++;
		acc.balance = initialBalance;
		//System.out.println(acc.accountId + "added");
		System.out.println("Account added for : " + firstName + " " + lastName);
		
		
	}
}
