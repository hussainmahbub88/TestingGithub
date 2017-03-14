
public class HomeWorkOnForLoop {

	public static void main(String[] args) {
		/*
		 * Homework:
		 * 
		 * 1. Create and array with name of all months and use enhanced for loop
		 * to iterate through the months and print out the season for each
		 * months.
		 * 
		 * 2. Create a for loop to count your age from 0 to now, and print few
		 * accomplishment you have achieved along the way
		 * 
		 * 3. Create a for loop the itarates you class duration in days. Days
		 * total = 30, Print out that first 10 days covers QA testing concept,
		 * middle 10 days covers java programming, last 10 days covers Selenium
		 * Automation
		 * 
		 * 4. Create and array of all days in a week and continue if days equals
		 * to Tuesday and break if days equals to Thursday
		 */

		System.out.println("Home Work");
		System.out.println(
				"1.Creating an array for all the months and using enhance for loop to print the name of the season.  ");
		String[] namesOfMonths = { "Jan", "Feb", "Mar", "Arp", "May", "Jun", "Jul", "Aug", "Sep", "Oct", "Nov", "Dec" };

		for (String months : namesOfMonths) {
				switch (months) {
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
				default:
					System.out.println("The Day is Invalid");

			}
		}

		System.out.println("2.Creating a for loop to count the ages from 0 till now. ");
		for (int age = 0; age <= 26; age++) {
			if (age == 15) {
				System.out.println("I finished My School");
			} else if (age == 18) {
				System.out.println("I finished My High School");
			} else if (age == 22) {
				System.out.println("I finished My College");
			}
		}

		/*System.out.println("3.Creating a for loop the itarates you class duration in days. ");
		for (int days = 1; days <= 30; days++) {
			if (days ==10) {
				System.out.println("First 10 days cover QA testing concept");
			} else if (days == 20) {
				System.out.println("Middle 10 days covers java programming");
			} else if (days == 30) {
				System.out.println("Last 10 days covers Selenium Automation");
			}

		}*/ //This will only print day 10,20 and 30 but not 1-10,11-20 and 21-30.
		
		System.out.println("3.Creating a for loop the itarates you class duration in days. ");
		for (int days = 1; days <= 30; days++) {
			if (days <= 10) {
				System.out.println("First 10 days cover QA testing concept");
			} else if (days <= 20) {
				System.out.println("Middle 10 days covers java programming");
			} else if (days <= 30) {
				System.out.println("Last 10 days covers Selenium Automation");
			}

		}

		System.out.println("4.Creating an array of all days in a week. ");
		String[] namesOfDays = { "Mon", "Tue", "Wed", "Thur", "Fri", "Sat", "Sun" };

		for (String days : namesOfDays) {

			if (days.equals("Tue")) {
				System.out.println("It's Tuesday");
				continue;
			} else if (days.equals("Thur")) {
				System.out.println("It's Thursday");
				break;
			}
			System.out.println("Invalid days");
		}
		
		/*String[] namesOfDays = { "Mon", "Tue", "Wed", "Thur", "Fri", "Sat", "Sun" };
		 
		for (int days=1; days<=7; days++){	
			if (days == 2) {
				System.out.println("It's Tuesday");
				continue;
			} else if (days == 4) {
				System.out.println("It's Thursday");
				break;
			}
		}*/
		
			
		}
		
	}


