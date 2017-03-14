package ClassesAndObjects;

public class Account5 {

	public double balance;
	public String accountId;
	public static int nextId = 0;
	public static final int ROUTING_NUMBER = 123456;
	protected String address;

	
	public void deposit(double amount) {
		balance = balance + amount;
	}

	public void witdraw(double amount) {
		balance = balance + amount;
	}

	public void display() {
		System.out.println("*** Account Information ***");
		System.out.println(" ID: " + accountId);
		System.out.println("Balance: " + balance);
	}

	public static String getNextId() {
		return "ACCT# " + Account4.nextId;
	}

}
