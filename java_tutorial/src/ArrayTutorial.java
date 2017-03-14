public class ArrayTutorial {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String[] cars = new String[11];

		cars[0] = "Ferrari";
		cars[1] = "Lamborgini";
		cars[2] = "Audi";
		cars[3] = "BMW";
		cars[4] = "Infiniti";
		cars[5] = "Tesla";
		cars[6] = "Porshe";
		cars[7] = "Acura";
		cars[8] = "Lexus";
		cars[9] = "Marcedez Benz";
		cars[10] = "Kia";

		int size = cars.length;
		System.out.println("1. The Array length is " + size);

		String[] Months = new String[12];

		Months[0] = "January";
		Months[1] = "February";
		Months[2] = "March";
		Months[3] = "April";
		Months[4] = "May";
		Months[5] = "June";
		Months[6] = "July";
		Months[7] = "August";
		Months[8] = "September";
		Months[9] = "October";
		Months[10] = "November";
		Months[11] = "December";

		System.out.println("2. Asked month's Name " + Months[7]);

		String[] months = { "January", "February", "March", "April", "May","June", "July", "August", "September", "October", "November","December" };

		String[] days = { "Saturday", "Sunday", "Monday", "Tuesday","Wednesday","Thursday", "Friday" };

		boolean b;

		b = months.equals(days);
		System.out.println("3. Is array Months equal to array Days?? " + b);

	}

}