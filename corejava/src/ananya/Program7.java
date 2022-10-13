package ananya;

import java.util.Scanner;
public class Program7 {
public static void main(String[] args) {
	Scanner sc =new Scanner(System.in);

	
	System.out.println("MENU :\n *IDLY \n *DOSA\n *VADA\n *TEA");
	int ch=sc.nextInt();
	switch(ch)
	{
	case 1:
		System.out.println("IDLY IS ON THE WAY");
		break;
	case 2:
		System.out.println("DOSA IS ON THE WAY");
		break;

	case 3:
		System.out.println("VADA IS ON THE WAY");
		break;

	case 4:
		System.out.println("TEA IS ON THE WAY");
		break;
	default :
		System.out.println("not  a valid input");
		break;


	}
	
  }
}
