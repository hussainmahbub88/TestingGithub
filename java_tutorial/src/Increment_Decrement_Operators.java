
public class Increment_Decrement_Operators {

	public static void main(String[] args) {

		// Post Increment
		int age = 1;
		age++;
		System.out.println("Age =" + age);

		// Pre Decrement
		int dogAge = 1;
		--dogAge;
		System.out.println("Dog Age : " + dogAge);

		int i = 3;
		i++;
		System.out.println(i++);// post increment
		System.out.println(i);
		System.out.println(++i);// pre increment
		System.out.println(i++);

	}

}
