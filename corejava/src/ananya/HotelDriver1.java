import java.util.Scanner;
class HotelDriver1
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
		if(this.s==null)
		{
			
			this.s=new Swiggy(89,87.00,"Manglore");
			System.out.println("Order created successfully");
		}
		else
		{
			System.out.println("The booking is already done...! ");
		}
	}
	
	public void ShowSwiggyDetails()
	{
		if(this.s!=null)
		{
		System.out.println("Order Details");
		System.out.println(s.order_no);
		System.out.println(s.price);
		System.out.println(s.location);
		}
		else
		{
			System.out.println("There is no booking to show first book to show details..!");
		}
		
	}
	public void ShowHotelDetails()
	{
		System.out.println("Hotel Details");
		System.out.println(capacity);
		System.out.println(name);
		System.out.println(owner_name);
	}
	public void CancelOrder()
	{	
		if(this.s!=null)
		{

		
		this.s=null;
		System.out.println("the order cancelled successfully");
	}
	else
	{
		System.out.println("There is no order to cancel");
	}
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
}