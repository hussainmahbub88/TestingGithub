package Inheritance;

public class Honda extends Car {

	String name;
	String model;
	int year;
	
	public void getCarNameModelAndYearForHonda(){
		name = "Honda";
		model = "V6";
		year = 2016;
	}
	
	public void printHonda(){
		System.out.println("Name of the Car : " + name);
		System.out.println("Model of the Car : " + model);
		System.out.println("Year of the Manufacture : " + year);
	}
	
	
}
