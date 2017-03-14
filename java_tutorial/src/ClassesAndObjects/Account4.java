package ClassesAndObjects;

public class Account4 {
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
	
	public void display(){
		System.out.println("***Account Information***");
		System.out.println(" ID : " + accountId);
		System.out.println("Balance : " + balance);
	}
	
	public static String getNextId(){
		return "ACCT# " + Account4.nextId++;
	}

}
