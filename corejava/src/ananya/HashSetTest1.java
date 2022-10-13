package ananya;

import java.util.TreeSet;
public class HashSetTest1 {
public static void main(String[] args) {
	TreeSet<Character> obj1 = new TreeSet<Character>();
	obj1.add('m');
	obj1.add('b');
	obj1.add('n');
	System.out.println(obj1);
	System.out.println(obj1.size());
	System.out.println(obj1.isEmpty());
	System.out.println(obj1.contains('m'));
	System.out.println(obj1);
	obj1.removeAll(obj1);
	System.out.println(obj1);
}
}
