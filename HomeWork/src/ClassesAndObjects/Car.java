package ClassesAndObjects;

public class Car {
	String name;
	String model;
	Gear gearObject;
	
	public void setNameAndModel(String carName, String carModel){
		name = carName;
		model = carModel;
		gearObject = new Gear();
	}
	
	public void startCar(){
		gearObject.setGearParking();
	}
	
	public void driveCar(){
		gearObject.setGearDrive();
	}
	
	public void parkCar(){
		gearObject.setGearParking();
	}
	
	public void goReverse(){
		gearObject.setGearReverse();
	}
	
	public void printCurrentState(){
		System.out.println(gearObject.getCurrentGear() + " Mode with Speed " + gearObject.getCurrentSpeed());
	}
	
	public void printCarNameAndModel(){
		System.out.println("Car Name: " + name + " | Model: " + model);
	}
	
	
	
}
