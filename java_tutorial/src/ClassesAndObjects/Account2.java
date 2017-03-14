package ClassesAndObjects;

public class Account2 {
	double balance;

	public void deposit(double amount) {
		balance = balance + amount;
	}

	public void witdraw(double amount) {
		balance = balance - amount;
	}
}
