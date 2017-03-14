package ClassesAndObjects;

public class Gear {
	
	 String currentGear;
	 String currentSpeed;
	
	public void setGearParking(){
		currentGear = "Parking";
		currentSpeed = "0 miles";
	}
	
	public void setGearReverse(){
		currentGear = "Reverse";
		currentSpeed = "5 miles";
	}
	
	public void setGearDrive(){
		currentGear = "Drive";
		currentSpeed = "15 miles";
	}
	
	public String getCurrentGear(){
		return currentGear;
	}
	
	public String getCurrentSpeed(){
		return currentSpeed;
	}

}
