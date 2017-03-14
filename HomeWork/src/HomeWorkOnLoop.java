
public class HomeWorkOnLoop {

	public static void main(String[] args) {
		
		System.out.println("Home Work :");
		System.out.println("1.Swich statement is created and it shows what i do each day in a week :");
		
		String nameOfDays = "Thursday";
		switch (nameOfDays) {
		case "Monday":
			System.out.println("I go to Gym");
			break;
		case "Tuesday":
			System.out.println("I go to Class");
			break;
		case "Wednesday":
			System.out.println("I go and have fun with friends");
			break;
		case "Thursday":
			System.out.println("I go out with my Parents");
			break;
		case "Friday":
			System.out.println("I go to work");
			break;
		case "Saturday":
			System.out.println("I go Class");
			break;
		case "Sunday":
			System.out.println("I go to work");
			break;
		

		}
		
		System.out.println("2. Created a while loop and describing at age 64 :");
		  
		int currentAge = 60;
		while (currentAge <= 65) {
			System.out.println("Age is: " + currentAge);
			if (currentAge == 64) {
				System.out.println("You have one more year to retire");
			}
			currentAge++;
		}
		
		
		System.out.println("3. Created a do while loop :");
  
		int depositAmount = 500;
        do {
            System.out.println("Amount is: " + depositAmount);
            if (depositAmount == 8000) {
				System.out.println("You have $2000 more to save");
			}
            depositAmount=depositAmount+500;
            
        } while (depositAmount <= 10000);
		

		System.out.println("4. Created infinite while loop :");
		
		/*int count = 51;
		while (count > 50) {
			count++;
			System.out.println("Count is: " + count);
		}*/ // or we can do it this way
		
		while (true){
			System.out.println("I am an infinity While Loop : " );
			
		}
	}

}
