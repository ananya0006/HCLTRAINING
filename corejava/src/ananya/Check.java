package ananya;

import java.util.Scanner;
public class Check {
public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	System.out.println("enter an alph/dig/spc char");
	char ch=sc.next().charAt(0);
	
	if(ch>='a' && ch<='z')
	{
		System.out.println(ch+"   is a character");
	}
	else if(ch>='A' && ch<='Z')
	{
		System.out.println(ch+"    is a character");
	}
	else if(ch>='0' && ch<='9')
	{ 
		System.out.println(ch+"     is a Digit");
	}
	else
	{
		System.out.println(ch+"     is a special character");
	}
}
}
