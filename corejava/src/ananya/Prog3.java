package ananya;
import java.util.Scanner;

public class Prog3 {
	public static void main(String[] args) {
	

	Scanner sc=new Scanner(System.in);
	
	System.out.println("enter the name  of stud1:");
	String name1=sc.next();
	
	System.out.println("enter the  percentage of stud1:");
	int perc1=sc.nextInt();
	
	System.out.println("enter the name  stud2:");
	String name2=sc.next();
	
	System.out.println("enter the  percentage of stud2:");
	int perc2=sc.nextInt();
	
	highestPercentage(perc1,perc2);
	
	}
	public static void highestPercentage(int perc1,int perc2)
	{
		if(perc1>perc2)
		{
			
			System.out.println(perc1+" is the highest ");
		}
		else
		{
			System.out.println(perc2+" is the highest ");
		}
	}
}