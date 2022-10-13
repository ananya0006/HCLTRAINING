package ananya;
import java.util.Scanner;
public class Swap {
public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	System.out.println("Enter 2 numbers to swap:");
	int a=sc.nextInt();
	int b=sc.nextInt();
	System.out.println("Swapped numbers are:");
	a=a+b;
	b=a-b;
    a=a-b;
    System.out.println(a+":"+b);
}
}
