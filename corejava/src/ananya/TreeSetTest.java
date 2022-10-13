package ananya;
import java.util.Iterator;
import java.util.Set;
import java.util.TreeSet;
 
/**
 * This class is used to show the TreeSet functionality.
 */
public class TreeSetTest {
	public static void main(String args[]){
		//Create TreeSet object.
		Set<String> treeSet = new TreeSet<String>();
 
		//Add objects to the HashSet.
		treeSet.add("Roxy");
		treeSet.add("Sunil");
		treeSet.add("Sandy");
		treeSet.add("Munish");
		treeSet.add("Pardeep");
 
		//Print the TreeSet object.
		System.out.println("TreeSet elements:");
		System.out.println(treeSet);
 
		//Print the TreeSet elements using iterator.
		Iterator<String> iterator=treeSet.iterator();
		System.out.println("TreeSet elements using iterator:");
		while(iterator.hasNext()){  
		   System.out.println(iterator.next());  
		}  
	}
}