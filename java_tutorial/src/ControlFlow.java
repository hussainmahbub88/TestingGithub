
public class ControlFlow {

	public static void main(String[] args) {
		//
		// int age = 13;
		//
		// if (age > 13 && age < 17) {
		// System.out.println("You can watch A movies");
		// } else if (age >= 7 && age <= 13) {
		// System.out.println("You can watch B movies");
		// } else if (age >= 17) {
		// System.out.println("You can watch C movies");
		// } else if (age >= 1 && age <= 7) {
		// System.out.println("You can watch D movies");
		// } else {
		// System.out.println("I am inside Else only");
		// }
		//
		// System.out.println("I am Outside Everything");
		//

		String weatherCondtion1 = "warm";
		String weatherCondtion2 = "rain";

		if (weatherCondtion1.equals("snow")) {
			if (weatherCondtion2.equals("rain")) {
				System.out.println("Please take umbrealla cause its raining");
			} else {
				System.out.println("Its not raining, its only snowing");
			}
			System.out.println("Please wear boots cause its snowing");
		} else if (weatherCondtion1.equals("warm")) {
			if (weatherCondtion2.equals("hot")) {
				System.out.println("Please take a water bottle with you");
			} else if (weatherCondtion2.equals("rain")){
				System.out.println("Take am umbrella cause its raining");
			} else {
				System.out.println("Its not hot outside");
			}
			System.out.println("Dont wear a jacket cause its warm out side");
		} else {
			System.out.println("Incorrect weather condtion");
		}
		System.out.println("I run after the if statement");
	}

}
