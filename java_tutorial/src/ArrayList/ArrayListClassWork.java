package ArrayList;

import java.util.ArrayList;

public class ArrayListClassWork {
	
	public static void main(String[] args) {
		ArrayList<String> list = new  ArrayList<String>();
		
		list.add("Mamun");
		list.add("Hussain");
		list.add("Rajib");
		list.add("Raihan");
		list.add("Mohammed");
		System.out.println("The list of the array : " + list);
		
		int pos = list.indexOf("Raihan");
		System.out.println("What is the position of index for Raihan : " + pos);
		
		boolean check = list.isEmpty();
		System.out.println("Checking if the arraylist is empty : " + check);
		
		boolean element = list.contains("Raju");
		System.out.println("Checking if the arraylist contains the object Raju : " + element);
		
		String item = list.get(3);
		System.out.println("The item is the index 3 is : " + item);
		
		int size = list.size();
		System.out.println("The size of the list is : " + size);
		
		
		
		
		
	}

}
