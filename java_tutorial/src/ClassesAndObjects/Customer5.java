package ClassesAndObjects;

public class Customer5 {
	private String firstName;
	private String lastName;
	private Account5 acc;

	// Constructor with initialized values
	// public Customer5() {
	// firstName = "John";
	// lastName = "Doe";
	// }
	//
	// //Constructor with parameters
	public Customer5(String firstName, String lastName) {
		this.firstName = firstName;
		this.lastName = lastName;
	}

	public void addAccount(double initialBalance) {
		acc = new Account5();
		acc.accountId = Account4.getNextId();
		acc.balance = initialBalance;
		acc.display();
		System.out.println(firstName + " " + lastName);
	}

	public void addAccount() {
		addAccount(50);
	}

}
