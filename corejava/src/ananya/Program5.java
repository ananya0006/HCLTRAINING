package ananya;
import java.util.Scanner;

public class Program5 {

public static void main(String[] args) {
	Scanner sc =new Scanner(System.in);
	System.out.println("Enter a:");
	int first =sc.nextInt();
	System.out.println("Enter b:");
	int second=sc.nextInt();
	System.out.println("Enter c:");
	int third=sc.nextInt();
	
	System.out.println("Enter d:");
	int fourth=sc.nextInt();
	
	 if((first<second) && (first<third) && (first<fourth))
	 	{
		 System.out.println("\nFirst number is smallest");
	 	}
	 
	    else if((second<first) && (second<third) && (second<fourth))
	    {
	    	
	    	System.out.println("\nSecond number is smallest");
	    }
	    else if((third<second) && (third<first) && (third<fourth))
	    {
	    	System.out.println("\nThird number is smallest");
	    }
	    else if((fourth<second) && (fourth<third) && (fourth<first))
	    {
	    	System.out.println("\nFourth number is smallest");
	    }
}
}