package ananya;

import java.util.Scanner;
public class SimpleCalculator {
public static void main(String[] args) {
	Scanner sc =new Scanner(System.in);
	
	System.out.println("Enter a number:");
	int a=sc.nextInt();
	System.out.println("Enter another number:");
	int b=sc.nextInt();
	System.out.println("Enter the operation to perform:\n *Addition\n *Substraction\n *Multiplication\n *Division");
	int ch=sc.nextInt();
	switch(ch)
	{
	case 1:
		System.out.println("Addition of 2 numbers is"+(a+b));
		break;
	case 2:
		System.out.println("Substractio of 2 numbers is"+(a-b));
		break;

	case 3:
		System.out.println("Multiplication of 2 numbers is"+(a*b));
		break;

	case 4:
		System.out.println("Division of 2 numbers is"+(a/b));
		break;
	default :
		System.out.println("not  a valid input");
		break;


	}
	
	
	
}
}
