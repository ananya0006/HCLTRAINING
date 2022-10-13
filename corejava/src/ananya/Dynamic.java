package ananya;

import java.util.Scanner;
public class Dynamic {
public static void main(String[] args) {
	
	Scanner sc=new Scanner(System.in);
		
	System.out.println("Enter your name ");
	
	String name=sc.next();
	System.out.println("Enter your usn ");
	
	int usn=sc.nextInt();
	
	System.out.println("Enter your phonenumber ");
	
	double phno=sc.nextDouble();
	System.out.println(name+"\n"+usn+"\n"+phno);
	
}
}
