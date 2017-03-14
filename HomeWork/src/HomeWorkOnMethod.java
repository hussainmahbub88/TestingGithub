import java.util.Scanner;

public class HomeWorkOnMethod {

	public static void main(String[] args) {
		/*Homework:
			1. Create a method that allows user to set address
			2. Create a method that returns age based on the age passed on the parameter
			3. Create a method allows user to pass full name
			4. Create a method the return Celsius based on Fahrenheit passed in as parameter
			5. Create a method the return Fahrenheit based on Celsius passed in as parameter  			
			6. Describe following OOP concepts in your own words

			1. Object                
			2. Class                  
			3. Encapsulation  
			4. Polymorphism  
			5. Abstraction        
			6. Inheritance */   
			
		System.out.println("HomeWork :");
		System.out.println("1.Creating a method that allows us to set address");
		String fullAddress = getAddress("425 E 105 ST Apt 2C NY,NY");
		System.out.println("Full Address is : " + fullAddress);
	
		
		System.out.println("2.Creating a method that returns age based on the age passed on the parameter");
		int currentAge = getAge(25);
		System.out.println("Age is : " + currentAge);
		
		
		System.out.println("3. Creating a method that allows us to pass full name");
		String myFullName = getFullName("Mahbub", "Mamun");
	    System.out.println("My Full Name is : " + myFullName);
	    
	    
	    System.out.println("4. Creating a method that returns Celsius based on Fahrenheit passed in as parameter");
	   /* double celsius = getCelsius(70);
	    System.out.println("Value of Calsius is : " + celsius);*/
	    System.out.println("Please enter the Fahrenheit Value : ");
	    Scanner scan = new Scanner(System.in);
	    double actualFahrenheit = scan.nextDouble();
        double expectedFahrenheit = getCelsius(actualFahrenheit);
        System.out.println("Value of Calsius is : "+expectedFahrenheit);
        

	    System.out.println("5. Creating a method that returns Fahrenheit based on Celsius passed in as parameter");
	   /* double fahrenheit = getFahrenheit(20);
	    System.out.println("Value of Fahrenheit is : " + fahrenheit);*/
	    System.out.println("Please enter the Fahrenheit Value : ");
	    Scanner scan1 = new Scanner(System.in);
	    double actualCelcius = scan1.nextDouble();
        double expectedCelcius = getCelsius(actualCelcius);
        System.out.println("Value of Fahrenheit is : "+expectedFahrenheit);
	    
	    
      
	 
	}

	public static String getAddress(String address){
		String houseAddress = address;
		return houseAddress;
	}
	
	public static int getAge(int age){
		int currentAge = age;
		return currentAge;
	}
	
	 public static String getFullName(String enterFirstName, String enterLastName) {
	    String fullName = enterFirstName + " " + enterLastName;
	    return fullName;
	 }
	 
	 public static double getCelsius(double fahrenheit){
		double actualCelsius =  (fahrenheit - 32) * 5/9 ;
		return actualCelsius;
	 }
	 
	 public static double getFahrenheit(double celsius){
		double actualFahrenheit = celsius *  9/5 + 32 ;
		return actualFahrenheit;
		 }

}
