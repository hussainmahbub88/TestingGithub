package Encapsulation;

import java.util.Scanner;

public class PrinterFunction {
	public static void main(String[] args) {		
		Printer prnt = new Printer("Cannon", 1,1);
		prnt.duplexPrinter(2);
		prnt.fillUpTonner(3);
		prnt.printingPages(6);
	    
	   
	}
}
