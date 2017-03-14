
public class StringTutorial {

	public static void main(String[] args) {

		/**
		 * 
		 * Class work:
		 * 
		 * 1. String myStatment = "I am a good programmer"
		 * 
		 * 2. Find the length of of "myStatment"
		 * 
		 * 3. Convert all values to lowercase
		 * 
		 * 4. See if statment contains mohammad
		 * 
		 * 5. find the 5th index of the statement
		 * 
		 * 6. find if the statment is empty
		 * 
		 * 7. compare the "myStatement" with "technosoft"
		 * 
		 * @param args
		 * 
		 */

		/*
		 * 1. String myString = "I am a student in Technosoft";
		 * 
		 * use charAt method to print 9th index from myString.
		 */

		//

		// String myString = "I am a student in Technosoft";

		//

		// char findIndex = myString.charAt(8); //An index ranges from 0 to
		// length() - 1

		//

		// System.out.println("1.The 9th index of 'I am a student in Technosoft'
		// is: " + findIndex);

		//

		/*
		 * 
		 * 2. String Str = "   Welcome to Tutorialspoint.com   ";
		 * 
		 * use trim method to remove spaces when you print above string
		 * 
		 */

		// String Str = " Welcome to Technosoft.com ";

		//

		// String spaceRemove = Str.toUpperCase(); //Removes the starting spaces

		//

		// //System.out.println("Before trim:" +Str);

		//

		// System.out.println("2.After trim: " +spaceRemove);

		//

		/*
		 * 
		 * 3. String name = "Put your name here";
		 * 
		 * Find the length of your name.
		 * 
		 */

		// String name = "Jack Yoon";

		//

		// int Length = name.length(); //Simply counts the length of given
		// string

		//

		// System.out.println("3.The length of my name is: " + Length);

		// /*

		// * 4. String companyName = "Technosoft is a good place to learn Java";

		// use contain method to make sure above string has the word "learn".

		// */

		//

		// String companyName = "Technosoft is a good place to learn Java";

		//

		// String searchWord = "learn"; //word to be searched

		//

		// boolean findWord = companyName.contains(searchWord); //returning as
		// true or false

		//

		// System.out.println("4.Does 'learn' exist in above string?:
		// "+findWord);

		//

		//

		// /*

		// * 5. String emptyString = "";

		// use isEmpty method to find out if above string is empty or not.

		// */

		//

		//

		// String emptyString = "";

		//

		// boolean findEmpty = emptyString.isEmpty();

		//

		// System.out.println("5.Is above string empty?: " + findEmpty);

		//

		// /*

		// * 6. String String companyName = "Technosoft is a good place to learn
		// Java";

		// Use startsWith method to make sure above string starts with
		// Technosoft

		// Use endsWith method to make sure above string ends with Java

		// */

		//

		String companyName1 = "Technosoft is a good place to learn Java";

		String startWord = "Technosoft";

		String endWord = "Java";

		boolean startString = companyName1.startsWith(startWord);

		System.out.println("6.'Technosoft is a good place to learn Java' starts with 'Technosoft'?: " + startString);

		boolean endString = companyName1.endsWith(endWord);

		System.out.println("6.'Technosoft is a good place to learn Java' ends with 'Java'?: " + endString);

		//

		//

	}

}
