package ananya;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;
 
/*
  This class is used to show the HashSet functionality.
 */
public class HashSetTest {
	public static void main(String args[]){
		//Create HashSet object.
		Set<String> hashSet = new HashSet<String>();
 
		//Add objects to the HashSet.
		hashSet.add("Roxy");
		hashSet.add("Sunil");
		hashSet.add("Sandy");
		hashSet.add("Munish");
		hashSet.add("Pardeep");
 
		//Print the HashSet object.
		System.out.println("HashSet elements:");
		System.out.println(hashSet);
 
		//Print the HashSet elements using iterator.
		Iterator<String> iterator=hashSet.iterator();
		System.out.println("HashSet elements using iterator:");
		while(iterator.hasNext()){  
		   System.out.println(iterator.next());  
		}  
	}
}