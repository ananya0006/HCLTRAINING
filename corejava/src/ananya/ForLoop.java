package ananya;
import java.util.Scanner;
public class ForLoop {
public static void main(String[] args) {
	Scanner sc =new Scanner(System.in);
	System.out.println("Enter the value of n:");
	int n=sc.nextInt();
	int i;
	for(i=1;i<=n;i++)
	{
		System.out.println(i);
	}
}
}
