
public class MethodExample {

    public static void main(String[] args) {

//      String studentOneName = getFullName("John", "Doe");

//      String studentTwoName = getFullName("Kevin", "Smith");

//      double sizeOfMac = getSize(10.0, 11.0);

//      if(sizeOfMac == 17.9) {

//          //Do something here

//      }

      double square = getSqrt(49);
       
      if (square == 49){
    	  System.out.println("Hello World");
      } else {
    	  System.out.println("Hello Mars");
      }

//      double batSize = getSize(12.1, 3.5);

//      double iPhoneSize = getSize(9.95, 10.0);

//      

//      if (iPhoneSize == batSize) {

//          printToConsole();

//      } else {

//          System.out.println("Invalid size");

//      }

      

 /*     String jackFullName = getFullName("Jack", "Yoon");

      System.out.println(jackFullName);*/

  }

    public static double getSqrt(double a ) {

        double root = Math.sqrt(a);

        return root;

    }

 /* public static void printToConsole() {

      System.out.println("Welcome to class");

  }

//  

  public static String getFullName(String enterFirstName, String enterLastName) {

      String fullName = enterFirstName + " " + enterLastName;

      return fullName;

  }

  

     public static double getSize(double length , double width) {

        double size = length * width;

        return size;

    }*/
}
