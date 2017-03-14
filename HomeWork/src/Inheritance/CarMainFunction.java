package Inheritance;

public class CarMainFunction {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Car cr = new Car();
		cr.carCommonAttribute("32 inches", "Circle", "Circle", "White");
		
		
		Honda hn = new Honda();
		hn.getCarNameModelAndYearForHonda();
		hn.printHonda();
		cr.printCommonAttributes();
		
		Toyota ty = new Toyota();
		ty.getCarNameModelAndYearForToyota();
		ty.printToyota();
		cr.printCommonAttributes();
		
		
		
	}

}
