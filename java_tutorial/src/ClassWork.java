public class ClassWork {

	public static void main(String[] args) {

		String myStatement = "I am a good programmer";
		int lengthOfmyStatement = myStatement.length();
		System.out.println("2.Length of My Statement is:" + lengthOfmyStatement);

		String convertToLowerCase = myStatement.toLowerCase();
		System.out.println("3.Converting all My Statement to LowerCase:" + " " + convertToLowerCase);

		boolean checkName = myStatement.contains("mohammed");
		System.out.println("4.Does Mohammed Contain in My Statement: " + checkName);

		char findIndex = myStatement.charAt(4);
		System.out.println("5.The 5th Index of My Statement is: " + findIndex);

		boolean statementIsEmpty = myStatement.isEmpty();
		System.out.println("6.Finding if My Statement is empty: " + statementIsEmpty);

		String name = "technosoft";
		boolean compairWithAnotherStatement = myStatement.equals(name);
		System.out.println("7.Compairing My Statement with Technosoft: " + compairWithAnotherStatement);
	}

}
