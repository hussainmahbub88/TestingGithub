package Encapsulation;

public class AttendenceSheet {

	public static void main(String[] args) {
		Student bobby = new Student();
		bobby.setFirstName("John");
		bobby.setLastName("Doe");

		if (bobby.getLastName().equals("Doe")) {
			System.out.println("He is going to present tomorrow in class");
		}

	}

}
