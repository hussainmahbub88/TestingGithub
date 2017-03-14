
public class Variable {

	final static int SSN = 623121233; // final variable
	static int houseNumber = 1322; // field variable

	public static void main(String[] args) {

		int mamunAge = 25; // local variable
		double mamunWeight = 60; // local variable
		double mamunHeight = 5.5;// local variable

		System.out.println("Mamun's Age is: " + mamunAge + " " + "Years");
		System.out.println("Mamun's Weight is: " + mamunWeight + " " + "lbs");
		System.out.println("Mamun's Height is: " + mamunHeight + " " + "feet");
		System.out.println("Mamun's SSN is: " + SSN);
		System.out.println("Mamun's House Number is: " + houseNumber + "\n");
		
		houseNumber = 6547;
		System.out.println("Mamun moving to a new House Today");
		System.out.println("Mamun's New House Number is: " + houseNumber);

	}

}
