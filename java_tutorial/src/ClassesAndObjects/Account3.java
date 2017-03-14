package ClassesAndObjects;

public class Account3 {
	double balance;
	String accountId;
	static int nextId = 0;
	static final int ROUTING_NUMBER = 12345;
	

	public void deposit(double amount) {
		balance = balance + amount;
	}

	public void witdraw(double amount) {
		balance = balance - amount;
	}

}
