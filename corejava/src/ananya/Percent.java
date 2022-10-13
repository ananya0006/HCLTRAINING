package ananya;

import java.util.Scanner;

public class Percent {
	public static void main(String[] args) {
		Scanner sc =new Scanner(System.in);
		System.out.println("Enter percentage:");
		int percentage=sc.nextInt();
		
		if(percentage>=80)
		{
			System.out.println("topper");
		}
		else if(percentage>=60)
		{
			System.out.println("average");
		}
		else if(percentage<60)
		{
			System.out.println("all rounder");
			
		}
		
	}
}
