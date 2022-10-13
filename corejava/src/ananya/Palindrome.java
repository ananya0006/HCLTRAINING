package ananya;
import java.util.Scanner;
public class Palindrome {
public static void main(String[] args) {
	
	int n,sum=0,rem;
	
	Scanner sc=new Scanner(System.in);
	System.out.println("Enter a number to check:");
	int num=sc.nextInt();
	int temp=num;
	while(num!=0)
	{
		rem=num%10;
		sum=sum*10+rem;
		num=num/10;
	}
	if(sum==temp)
		System.out.println("Given number is palindrome");
	else
		System.out.println("Given number is not a palindrome");
		
}
}
