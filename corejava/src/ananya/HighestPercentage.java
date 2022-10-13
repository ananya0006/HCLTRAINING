package ananya;
import java.util.Scanner;
public class HighestPercentage {
	
	public static void display()
	{
	Scanner sc=new Scanner(System.in);
	System.out.println("Enter the name of 1st studnt:");
	String name1=sc.next();
	System.out.println("Enter the perc of 1st studnt:");
	int perc1=sc.nextInt();
	System.out.println("Enter the name of 2nd studnt:");
	String name2=sc.next();
	System.out.println("Enter the perc of 1st studnt:");
	int perc2=sc.nextInt();
	
	if(perc1>perc2)
	{
		System.out.println(" name of highest  studnt is:"+name1);
		System.out.println("the perc of highst  studntis :"+perc1);
	}
	else
	{

		System.out.println(" name of highest  studnt is:"+name2);
		System.out.println("the perc of highst  studntis :"+perc2);
	}

	}
	public static void main(String[] args) {
		System.out.println("Welcome");
		display();
		System.out.println("bye..!!");
	}
}
