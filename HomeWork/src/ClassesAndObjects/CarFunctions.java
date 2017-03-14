package ClassesAndObjects;

public class CarFunctions {
	
	/* HomeWork
	1) Create A car of you choice
	2) Car should be able to run at certain speed based off gears
	3) Car should have name and model
	4) Print out the Car name and model */
	
	public static void main(String[] args) {
		Car car1 = new Car();
		car1.setNameAndModel("Toyota", "Camry");
		car1.printCarNameAndModel();
		car1.startCar();
		car1.printCurrentState();
		car1.driveCar();
		car1.printCurrentState();
		car1.parkCar();
		car1.printCurrentState();
		car1.goReverse();
		car1.printCurrentState();
	}

}
