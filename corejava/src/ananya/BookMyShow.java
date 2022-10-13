
class BookMyShow
{
	String custID;
	String custName;
	String custAge;
	String movTime;

		static
		{
			System.out.println("Welcome to BookMyShow....!");
		}
		static
		{
			System.out.println("How many tickets....!");
		}
		static
		{
			System.out.println("Enjoy your time...!");
		}
		static
		{
			System.out.println("Thanks for coming...!");
		}

			
	
	public void Booking()
	{	
		System.out.println("The customer ID is:"+custID);
		System.out.println("The cust name is :"+custName);
		System.out.println("The cust age is:"+custAge);
		System.out.println("The cust adhaar is:"+movTime);
	}
	
	
	public static void Booking1()
	{
		
		BookMyShow b1=new BookMyShow();
		System.out.println("The customer ID is:"+b1.custID);
		System.out.println("The cust name is :"+b1.custName);
		System.out.println("The cust age is:"+b1.custAge);
		System.out.println("The cust adhaar is:"+b1.movTime);
		
	}

	public static void main(String[] args)
	{
		
		BookMyShow b=new BookMyShow();
		 b.custID="06";
		 b.custName="Ananya H S";
		 b.custAge="21";
		 b.movTime="6:06";
		Booking1();
		System.out.println("==========================");
		b.Booking();
		
		
		
		
	}
}