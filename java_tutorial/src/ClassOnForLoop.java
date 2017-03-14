import java.util.Scanner;

public class ClassOnForLoop {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		/*
		 * for (int i=1; i<100;i+=2){ System.out.println(i); }
		 */

		// Simple password validation for login system

		/**
		 * 
		 * Classwork:
		 * 
		 * Create a system that checks valid username and password
		 * 
		 * And if they both are valid then only system displays homepage
		 * 
		 * User can only try upto 5 times with invalid login details
		 * 
		 * if it reaches 5 times then system should be locked for 10 min
		 * 
		 */
		System.out.println("Please enter your Username");
		Scanner scan = new Scanner(System.in);
		String actualUsername = scan.nextLine();
		String expectedUsername = "Mamun";
		System.out.println("Please enter your password");

		Scanner pass = new Scanner(System.in);
		String actualPassword = pass.nextLine();
		String expectedPassword = "techno1234";

		for (int i = 1; i < 6; i++) {
			if (!actualUsername.equals(expectedUsername)) {
				int count = 4 - i;

				System.out.println("Please enter the valid username");

				System.out.println("You have " + count + " more tries");

				actualPassword = scan.nextLine();

				if (i == 4) {

					System.out.println(
							"You account will be locked for 10 minuets due to maximum tries in userneme and password");

				}

			} else if (!actualPassword.equals(expectedPassword)) {

				int countt = 4 - i;

				System.out.println("Please enter the valid password");

				System.out.println("You have " + countt + " more tries");

				actualPassword = pass.nextLine();

				if (i == 4) {

					System.out.println(
							"You account will be locked for 10 minuets due to maximum tries in userneme and password");

				}

			} else {

				System.out.println("You Have succesfully entered into your account");
				System.out.println("Welcome to Home Page");

				break;

			}

		}

	}
	// int[] numbers = { 10, 20, 30, 40, 50 };

	// for (int i = 0; i < numbers.length; i++) {

	// System.out.println("Element: " + numbers[i]);

	// }

	// newer form

	// for (int element : numbers) {

	// System.out.println("Element: " + element);

	// }

	//

	// /*

	// Classic for-loop counting up from 0 to 99

	// 0, 1, 2, 3, ... 99

	// -init int i = 0

	// -test i<100

	// -increment i++

	// */

	// for (int i= 0; i < 100; i++) {

	// System.out.println(i);

	// }

	// /*

	// For-loop to print the values

	// 0, 2, 4, 6, .. 98

	// -increment by i+=2, instead of i++

	// (same as i = i + 2)

	// */

	// int i = 0;

	// for (i=0; i<100; i+=2) {

	// System.out.println(i);

	// }

	//

	// /*

	// For-loop from 99 down to 0

	// 99, 98, 97, ... 0

	// -init i=99

	// -test i>=0

	// -increment i--

	// */

	// for (int i=99; i>=0; i--) {

	// System.out.println(i);

	// }

	// /*

	// For-loop from 0 to 100 by 5's

	// 0, 5, 10, 15, .. 100

	// -test i<=100

	// -increment i+=5

	// */

	// for (int i=0; i<=100; i+=5) {

	// System.out.println(i);

	// }

	/*
	 * 
	 * Loop with if condition
	 * 
	 */

	// int student;

	//

	// for (student = 0; student < 10; student++) {

	// if (student < 5) {

	// System.out.println("I am smaller half of the class");

	// } else {

	// System.out.println("I am bigger half of the class");

	// }

	// }

	//

	/*
	 * String[] names = { "James", "Larry", "Tom", "Lacy" };
	 * 
	 * for (String students : names) {
	 * 
	 * boolean isJames = students.equals("James");
	 * 
	 * if (isJames == true) {
	 * 
	 * System.out.println("James is part of the class");
	 * 
	 * break;
	 * 
	 * }
	 * 
	 * }
	 */

}
