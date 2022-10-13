import java.util.Scanner;
class Account
{
	String accHolderName="Annaya H S";
	String accHolderID="4AL19IS006";
	String accHolderAge="21";
	String accType="Savings Account";

		static
		{
			System.out.println("Welcome to Bank Details");
		}
		static
		{
			System.out.println("Lion is a ferrocious animal");
		}

			
	
	public void Play()
	{
		System.out.println("Employee is working");
	}
	
	
	public static void Play1()
	{
		System.out.println("Employee is not working");
	}

	public static void main(String[] args)
	{
		Account x=new Account();
		System.out.println(x);

		System.out.println(x.accHolderName);
		System.out.println(x.accHolderID);
		System.out.println(x.accHolderAge);
		System.out.println(x.accType);
		
		x.Play();
		Play1();
	}
}