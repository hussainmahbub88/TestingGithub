
public class SwitchStatement {

	public static void main(String[] args) {

		String nameOfMonths = "Dec";

		switch (nameOfMonths) {
		case "Dec":
		case "Jan":
		case "Feb":
			System.out.println("It's Winter here");
			break;
		case "Mar":
		case "Apr":
		case "May":
		case "Jun":
			System.out.println("It's Spring here");
			break;

		case "Jul":
		case "Aug":
		case "Sep":
		case "Oct":
		case "Nov":
			System.out.println("It's Autumn here");
			break;
		default :
			System.out.println("The Day is Invalid");

		}

	}

}
