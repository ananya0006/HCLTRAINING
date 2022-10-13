package ananya;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
 
/**
 * This class is used to show the ArrayList functionality.
 * @author w3spoint
 */
public class ArrayListTest {
	public static void main(String args[]){
		//Create ArrayList object.
		List<String> arrayList = new ArrayList<String>();
 
		//Add objects to the List.
		arrayList.add("Amani");
		arrayList.add("Prabhjot");
		arrayList.add("Nidhi");
		arrayList.add("Vandana");
		arrayList.add("Poonam");
 
		//Size of the ArrayList object.
		System.out.println("Size: " 
				+ arrayList.size());
 
		//Print the ArrayList object.
		System.out.println("ArrayList elements:");
		System.out.println(arrayList);
 
		//Print the ArrayList elements using iterator.
		Iterator<String> iterator1=arrayList.iterator();
		System.out.println("ArrayList elements " +
				"using iterator:");
		while(iterator1.hasNext()){  
		   System.out.println(iterator1.next());  
		} 
 
		//Add an object at a specific position.
		arrayList.add(2,"Jagdeep");
 
		//Remove an element from a specific position.
		arrayList.remove(3);
		arrayList.remove(4);
 
		//Size of the ArrayList object.
		System.out.println("Size after manipulation: "
				+ arrayList.size());
 
		//Print the ArrayList object.
		System.out.println("ArrayList elements" +
				" after manipulation:");
		System.out.println(arrayList);
 
		//Print the ArrayList elements using iterator.
		Iterator<String> iterator2=arrayList.iterator();
		System.out.println("ArrayList elements after" +
				" manipulation using iterator:");
		while(iterator2.hasNext()){  
		   System.out.println(iterator2.next());  
		} 	
	}
}