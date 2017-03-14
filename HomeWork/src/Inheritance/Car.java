package Inheritance;


public class Car {
	String wheel;
	String stairing;
	String ring;
	String glass;
	 
	public void carCommonAttribute(String wheel,String stairing,String ring,String glass){
		this.wheel = wheel;
		this.stairing = stairing;
		this.ring = ring;
		this.glass = glass;
	}

	public void printCommonAttributes(){
		System.out.println("Common Attributes of the Car are as follows : " + wheel);
		System.out.println("Common Attributes of the Car are as follows : " + stairing);
		System.out.println("Common Attributes of the Car are as follows : " + ring);
		System.out.println("Common Attributes of the Car are as follows : " + glass);
	}
	
	
	
	
	
	
	
	

}
