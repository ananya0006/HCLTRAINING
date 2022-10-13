package ananya;
import java.util.Scanner;
public class Program1 {
public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	System.out.println("Enter a number:\n");
	int num=sc.nextInt();
	if(num%5==0)
	{
		System.out.println("lucky");
	}
}
}
