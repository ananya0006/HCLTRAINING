	
import java.util.Scanner;
class Account11
{
	String accHolderName;
	String accHolderID;
	String accHolderAge;
	String accType;

		static
		{
			System.out.println("Welcome to Bank Details");
		}
		static
		{
			System.out.println("We are here to double your money in dreams");
		}

			
	Account11(String accHolderName,String accHolderID,String accHolderAge,String accType)
	{
		this.accHolderName=accHolderName;
		this.accHolderID=accHolderID;
		this.accHolderAge=accHolderAge;
		this.accType= accType;
	}
		
	public void Play()
	{
		System.out.println("Employee is working");
	}
	
	
	public static void Play1()
	{
		System.out.println("Employee is not working");
	}
	
	public String toString()
		{

			return "the accholder name is:"+accHolderName+"\nthe accholder id is:"+accHolderID+"\nthe accholder age is:"+accHolderAge+"\nthe acc type name is:"+accType;
		}
	public static void main(String[] args)
	{
		Account11  x = new Account11("Ananya","06","21","Savings bank");
		System.out.println(x);

		//System.out.println(x.accHolderName);
		//System.out.println(x.accHolderID);
		//System.out.println(x.accHolderAge);
		//System.out.println(x.accType);
		
		x.Play();
		Play1();
	}
}
























