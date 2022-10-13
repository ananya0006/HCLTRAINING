package ananya;
import java.util.Scanner;

public class Swap1 {
public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	System.out.println("ENter two numbers to swap:");
	int a= sc.nextInt();
	int b=sc.nextInt();
	System.out.println("Before swapping: a="+a+"b="+b);
	int c;
	c=a;
	a=b;
	b=c;
	System.out.println("After swapping: a="+a+"b="+b);
}
}
