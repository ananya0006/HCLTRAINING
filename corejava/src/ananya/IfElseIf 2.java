import java.util.Scanner;
class IfElseIf
{
public static void m1(int a,int b,int c)

	{
		if(a>b && a>c)
		{
			System.out.println("A is greater");
		}
		else if(b>c)
		{
			System.out.println("B is greater than all");
		}
		else
		{
			System.out.println("C is greater than all");
		}
		
	}
public static void main(String[] args)
	{ 
		m1(30,10,0);
	}
}