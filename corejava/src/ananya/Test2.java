package ananya;

public class Test2 {
	public static void main(String[] args) {
		int a=16;
		int b=13;
		
		int e=a-- + --b + --a - b-- + --a - b--;
		
		System.out.println("b is :"+b);
		System.out.println("a is :"+a);
		System.out.println("e is :"+e);
	}
}
