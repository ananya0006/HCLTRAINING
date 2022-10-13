import java.util.Scanner;
class HotelDriver
{
	public static void main(String[] args)
	{
		Scanner s=new Scanner(System.in);
		System.out.println("Enter the capacity");
		int capacity=s.nextInt();
		System.out.println("Enter the Hotel name");
		String name =s.next();
		System.out.println("Enter the owner name");
		String owner_name =s.next();
		Hotel h= new Hotel(capacity,name,owner_name);
		boolean exit=true;
		while(exit)
		{
			
		System.out.println("Enter the operation to be performed");
		System.out.println("1.BookOrder\n 2.Swiggy Details\n 3.Hotel Details\n 4.CancelOrder\n 5.Exit\n");
		int choice=s.nextInt();
		switch(choice)
		{
			case 1: h.BookOrder();
			break;
			case 2: h.ShowSwiggyDetails();
			break;
			case 3: h.ShowHotelDetails();
			break;
			case 4:h.CancelOrder();
			break;
			case 5:exit=false;
			break;
			default:System.out.println("Enter the numbers shown above");
                                 }
                     }
          }

}
class Hotel
{
	int capacity;
	String name;
	String owner_name;
	Swiggy s;
	Hotel(int capacity,String name,String owner_name)
	{
		this.capacity=capacity;
		this.name=name;
		this.owner_name=owner_name;
	}
	public void BookOrder()
	{
		
			this.s=new Swiggy(06,150,"Mysore");
			System.out.println("Order created successfully");
		
	}
	
	public void ShowSwiggyDetails()
	{
		
		System.out.println(s);
		//System.out.println(s.order_no);
		//System.out.println(s.price);
		//System.out.println(s.location);
		
		
	}
	public void ShowHotelDetails()
	{
		System.out.println(capacity);
		System.out.println(name);
		System.out.println(owner_name);
	}
	public void CancelOrder()
	{	
		this.s=null;
		System.out.println("the order cancelled successfully");
	}
}

class Swiggy
{
	int order_no;
	double price;
	String location;
	
	Swiggy(int order_no,double price,String location)
	{
		this.order_no=order_no;
		this.price=price;
		this.location=location;
	}
	public String toString()
	{
		return "ord no"+order_no+"Price"+price+"Location"+location;
	}
}