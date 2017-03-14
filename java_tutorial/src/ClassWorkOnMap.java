import java.util.HashMap;
import java.util.Map;

public class ClassWorkOnMap {
	public static void main(String[] args){
		Map<String , Integer > friendNameAndNum = new HashMap<String, Integer>();
		
		
		friendNameAndNum.put("Mamun", 123);
		friendNameAndNum.put("Rahat", 234);
		friendNameAndNum.put("Nurul", 567);
		
		System.out.println("Printing all the names and numbers : "+ friendNameAndNum);
		System.out.println("Printing Mamun's  Number : "+ friendNameAndNum.get("Mamun"));
		
		boolean namAndNum = friendNameAndNum.containsValue("Raihan");
		System.out.println("Does it contain name Raihan : " +namAndNum);
		
		friendNameAndNum.remove("Mamun");
		System.out.println("After Removing Mamun from Map");
		for(String nam:friendNameAndNum.keySet()){
			System.out.println(nam +" :: "+friendNameAndNum.get(nam));
		}
		
		
		
	}
}
