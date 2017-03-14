package ClassesAndObjects;

public class Account1 {
	double balance;
	
	public void deposit(double amount){
		balance = balance + amount;
	}
	
	public void withdraw(double amount){
		balance = balance - amount;
	}
	
	/*public void transfer(double amount){
		balance = balance - amount;
	}
*/
}
