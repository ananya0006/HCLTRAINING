package ananya;

public class Increment1 {
public static void main(String[] args) {
	int a=10;
	int b=10;
	int c=a++ + b++ +  ++b + ++a -a++;
	System.out.println("c is :"+c);
	System.out.println("b is :"+b);
	System.out.println("a is :"+a);
}
}
