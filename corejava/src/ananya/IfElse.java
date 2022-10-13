package ananya;

import java.util.Scanner;
public class IfElse {
public static void main(String[] args) {
	
	Scanner sc =new Scanner(System.in);
	System.out.println("Enter your age");
	int age=sc.nextInt();
	if(age>=18) {
		System.out.println("You are Eligible to vote");
	}
	else
	{
		System.out.println("You are not Eligible to vote");
	}
	}
}

