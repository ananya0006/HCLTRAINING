package ananya;
import java.util.Scanner;

public class SmallestOfThreeNumbers {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
				System.out.println("Enter an Integer value");
				int a=sc.nextInt();
				System.out.println("Enter an Integer value");
				int b=sc.nextInt();
				System.out.println("Enter an Integer value");
				int c=sc.nextInt();
				int d= (a < b) ? ( a < c ? a : c) : (b < c ? b : c) ;
				System.out.println("Smallest of 3 numbers is:"+d);
	}
}
				
