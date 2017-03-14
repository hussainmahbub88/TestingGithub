package Inheritance;

public class Toyota extends Car{
	String name;
	String model;
	int year;
	
	public void getCarNameModelAndYearForToyota(){
		name = "Toyota";
		model = "Camry";
		year = 2017;
	}
	
	public void printToyota(){
		System.out.println("Name of the Car : " + name);
		System.out.println("Model of the Car : " + model);
		System.out.println("Year of the Manufacture : " + year);
	}

}
