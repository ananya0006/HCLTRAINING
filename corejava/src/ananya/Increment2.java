package ananya;

public class Increment2 {
	
		public static void main(String[] args) {
			int a=16;
			int b=13;
			int c=19;
			int d=21;
			int e=a++ + --d + c++ - b++ + ++c -d++ - ++a + ++b - d--;
			System.out.println("c is :"+c);
			System.out.println("b is :"+b);
			System.out.println("a is :"+a);
			System.out.println("d is :"+d);
			System.out.println("e is :"+e);
		}
		}

