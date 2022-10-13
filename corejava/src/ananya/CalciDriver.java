package ananya;
import java.util.Scanner;
public class CalciDriver {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		
		
		
		
		
		boolean exit=true;
		while(exit)
		{

			System.out.println("Enter which operation to perform");
			System.out.println("1.Addition\n2.Sustraction\n3.Multiplication\n4.Division\n5.Exit\n");
			int ch=sc.nextInt();
	
		switch(ch)
		{
			
			
			case 1:
			{
			System.out.println("Enter the first value:");
			int a=sc.nextInt();
			

			System.out.println("Enter the second value:");
			int b=sc.nextInt();
			int res= MethodCalculator.add(a, b);
			
			System.out.println(res);
			
			}
			break;
			
			case 2:
				{
					System.out.println("Enter the first value:");
					float a=sc.nextFloat();
					

					System.out.println("Enter the second value:");
					float b=sc.nextFloat();
					float res= MethodCalculator.sub(a, b);
					
					System.out.println(res);
				}
			
			break;
			
			case 3: 
				{
					System.out.println("Enter the first value:");
					long a=sc.nextLong();
					

					System.out.println("Enter the second value:");
					long b=sc.nextLong();
					long res= MethodCalculator.mul(a, b);
					
					System.out.println(res);
			
				}
			break;
			
			case 4: 
				{

					System.out.println("Enter the first value:");
					double a=sc.nextDouble();
					

					System.out.println("Enter the second value:");
					double b=sc.nextDouble();
					double res= MethodCalculator.div(a, b);
					
					System.out.println(res);
				}
				break;
			case 5:
			{
				return;
				
			}
				
				
			
			}
			
			
		}
		}


}
