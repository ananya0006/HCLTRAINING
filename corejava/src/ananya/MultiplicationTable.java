package ananya;
import java.util.Scanner;
public class MultiplicationTable {
public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	System.out.println("Enter the value of n:");
	int n=sc.nextInt();
	System.out.println("The multiplication table is:");
	
	for(int i=1;i<=10;i++)
	{
		System.out.println(n+ "*" +i+ "=" + (n*i));
		
	}
	
}
}
