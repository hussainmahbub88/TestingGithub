
public class ClassWork1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String months[] = new String[12];

		months[0] = "Jan";
		months[1] = "Feb";
		months[2] = "Mar";
		months[3] = "Apr";
		months[4] = "May";
		months[5] = "Jun";
		months[6] = "July";
		months[7] = "Aug";
		months[8] = "Sep";
		months[9] = "Oct";
		months[10] = "Nov";
		months[11] = "Dec";

		int sizeOfMonths = months.length;
		System.out.println("Size of Array for Months: " + sizeOfMonths);
		System.out.println("Print Month: " + months[7]);

		String days[] = new String[7];

		days[0] = "Mon";
		days[1] = "Tue";
		days[2] = "Wed";
		days[3] = "Thur";
		days[4] = "Fri";
		days[5] = "Sat";
		days[6] = "Sun";

		int sizeOfDays = months.length;
		System.out.println("Size of Array for Days: " + sizeOfDays);

		boolean compair;
		compair= months.equals(days);
		System.out.println("Is array Months equal to array Days?? " + compair);
		
		/*int value1 = 4;
		int value2 = 8;
		value2 *= value1;
		System.out.println("Value1 is: "+value1);
		System.out.println("Value2 is: "+value2);
		
		value2 += value1;
		System.out.println("Value1 is: "+value1);
		System.out.println("Value2 is: "+value2);
		
		value2 -= value1;
		System.out.println("Value1 is: "+value1);
		System.out.println("Value2 is: "+value2);*/
		
		/*int value3 = 4;
		int value4 = 9;
		value4 %= value3;
		System.out.println("Value1 is: "+value3);
		System.out.println("Value2 is: "+value4);*/
		
		int length = 12;
		int width = 20;
		int height = 25;
		
		boolean result;
		result = length <= 12 && width != 12 && height == 25;
		System.out.println("The Statement is: " + result);
	}
}
