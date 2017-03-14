
public class HelloWorld {

	static double averageOfStudentsAge;

	final static int johnAge = 60;

	public static void main(String[] args) {

		int jackAge = 22;

		averageOfStudentsAge = 22.6;

		System.out.println("Before Jack's age, Students averaged age: " + averageOfStudentsAge);

		System.out.println("Jack's age is: " + jackAge);

		averageOfStudentsAge = 23.4;

		System.out.println("After Jack's age, Students averaged age: " + averageOfStudentsAge);

	}

}
