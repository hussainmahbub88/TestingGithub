public class HomeWorkOnIfElse {

	public static void main(String[] args) {
		     

		 /**	 Homework

		          * I want to be able to put car on P mode, D mode, N mode, R mode
		           
		          * If i am on P mode and parking type is parallel then i can park between two cars

		          * If i am on D mode I can put drive type to Snow type, Sport Type or Regular type

		          * If i am on N mode i can put car in car wash station

		          * If i am on R mode I can only reverse the car and car will activate back camera

		          * If mode is incorrect then print me invalid mode type, please check your car mode

		          */
		String carDriveMode = "D Mode";
		String typeOfMode = "Sport";

		if (carDriveMode.equals("P Mode")) {
			if (typeOfMode.equals("Parallel")) {
				System.out.println("I can Park between two Cars");
			} else {
				System.out.println("I cannot Park between two Cars ");
			}
		} else if (carDriveMode.equals("D Mode")) {
			if (typeOfMode.equals("Snow")) {
				System.out.println("It's Snowing today drive slowly");
			} else if (typeOfMode.equals("Sport")) {
				System.out.println("The Car is in Sport Mode");
			} else if (typeOfMode.equals("Regular")) {
				System.out.println("The Car is in Regular Mode");
			} else {
				System.out.println("The Car is not in any type");
			}
		} else if (carDriveMode.equals("N Mode")) {
			System.out.println("I can put Car on Car Wash Station");
		} else if (carDriveMode.equals("R Mode")) {
			System.out.println("I can only reverse the car and car will activate back camera");
		} else {
			System.out.println("Invalid mode type, please check your car mode");
		}
	}

}
