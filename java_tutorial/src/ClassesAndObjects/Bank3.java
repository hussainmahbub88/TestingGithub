package ClassesAndObjects;

public class Bank3 {
	public static void main(String[] args) {
		Customer2 customer = new Customer2();
		customer.firstName = "John";
		customer.lastName = "Doe";
		customer.addAccount(250.0);
		
		Customer2 customer1 = new Customer2();
		customer1.firstName = "Raihan";
		customer1.lastName = "Hossain";
		customer1.addAccount(500.0);
		
		Customer3 customer2 = new Customer3();
		customer2.firstName = "Mohammed";
		customer2.lastName = "Muntakim";
		customer2.addAccount(300.0);
	}
}
