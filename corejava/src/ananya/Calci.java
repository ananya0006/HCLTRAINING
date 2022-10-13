import java.util.Scanner;
class Calci
{
public static void Add()
	{
	Scanner s=new Scanner(System.in);
	System.out.println("Enter the first value:");
	int num1=s.nextInt();
	System.out.println("Enter the second value:");
	int num2=s.nextInt();
	
System.out.println("The sum is:"+(num1+num2));
	}

public static void Sub()
	{
	Scanner s=new Scanner(System.in);
	System.out.println("Enter the first value:");
	int num1=s.nextInt();
	System.out.println("Enter the second value:");
	int num2=s.nextInt();
	System.out.println("The sub is:"+(num1-num2));
	}	
	
public static void Mul()
	{
	Scanner s=new Scanner(System.in);
	System.out.println("Enter the first value:");
	int num1=s.nextInt();
	System.out.println("Enter the second value:");
	int num2=s.nextInt();
	
	System.out.println("The mul is:"+(num1*num2));
	}	

public static void Div()
	{
	Scanner s=new Scanner(System.in);
	System.out.println("Enter the first value:");
	int num1=s.nextInt();
	System.out.println("Enter the second value:");
	int num2=s.nextInt();
	System.out.println("The div is:"+(num1/num2));
	}	

public static void main(String[] args)
	{
Add();
Sub();
Mul();
Div();
	}
}