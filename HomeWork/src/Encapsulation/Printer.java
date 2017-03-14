package Encapsulation;

public class Printer {
	// Homework
	// Create a class and demonstate proper encapsulation techniques the class
	// will be called Printer
	// It will simulate a real Computer Printer
	// It should have fields for the toner Level, number of pages printed, and
	// also whether its a duplex printer (capable of printing on both sides of
	// the paper).
	// Add methods to fill up the toner (up to a maximum of 100%), another
	// method to
	// simulate printing a page (which should increase the number of pages
	// printed).
	// Decide on the scope, whether to use constructors, and anything else you
	// think is needed.

	private String nameOfPrinter;
	private int tonerLevel = 100;
	private int numOfPagesPrinted;

	public Printer(String name, int tonerLevel, int numOfPagesPrinted) {
		this.nameOfPrinter = name;

		if (tonerLevel > 0 && tonerLevel <= 100) {
			this.tonerLevel = tonerLevel;
		}

		this.numOfPagesPrinted = numOfPagesPrinted;
	}

	/*public void printName() {
		System.out.println("Name Of Printer : " + nameOfPrinter);
	}*/

	public void duplexPrinter( int tonerLevel) {

		if (tonerLevel <= 100) {
			this.tonerLevel = tonerLevel;
			System.out.println("Paper Printing On Both Sides");
			//System.out.println("Tonner is now 60 %");
		} 

	}

	public void fillUpTonner(int tonerLevel) {

		if (tonerLevel > 0 && tonerLevel <= 100) {
			tonerLevel = 100;
			System.out.println("Now Tonner is filled up and it is 100%");
		}
	}

	public void printingPages(int numOfPagesPrinted) {
		numOfPagesPrinted = numOfPagesPrinted + 1;
		System.out.println("Now Printing Pages : " + numOfPagesPrinted);
	}

}
