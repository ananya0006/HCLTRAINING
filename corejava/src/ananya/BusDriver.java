import java.util.Scanner;
class BusDriver
{
	public static void main(String args[])
	{
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the bus name:\t");
		String bus_name=sc.next();

		System.out.println("Enter the bus_no:\t");
		int bus_no=sc.nextInt();

		
		RedBus b=new RedBus(bus_name,bus_no);
		boolean exit=true;
		while(exit)
		{
			System.out.println("===========================");
			System.out.println("1)BOOK TICKET \n 2)SHOW TICKET DETAILS\n 3) SHOW BUS SHOW DETAILS\n 4) UPDATE_ARRIVAL_PLACE\n 5)UPDATE_DEPARTURE_PLACE\n 6)CANCEL TICKET\n 7)EXIT\n");
			System.out.println("Enter your choice");
			int choice=sc.nextInt();
			switch(choice)
			{
				case 1:b.book_ticket();
					break;
				case 2:b.show_ticket_details();
					break;
				case 3:b.show_RedBus_Details();
					break;
				case 4:b.updatearrival_place();
					break;
				case 5:b.updatedeparture_place();
					break;
				case 6:b.cancel_ticket();
					break;
				case 7:exit=false;
					break;
				default:System.out.println("Invalid input");
			}
		}
	}
}

class RedBus
{
	String bus_name;
	int bus_no;
	Ticket t;

	RedBus()
	{
		
		
	}
	RedBus(String bus_name)
	{
		this.bus_name=bus_name;
		
	}
	RedBus(String bus_name, int bus_no)
	{
		this(bus_name);
		this.bus_no=bus_no;
		
	}
	public void book_ticket()
	{
		if(this.t==null)
		{
			Scanner s=new Scanner(System.in);
			System.out.println("Enter the ticket no:\n");
			int ticket_no=s.nextInt();
			System.out.println("Enter the arrival place:\n");
			String arrival_place=s.next();
			System.out.println("Enter the departure place:\n");
			String departure_place=s.next();
			System.out.println("Enter the no of tickets to be booked:\n");
			int no_of_tickets=s.nextInt();
			this.t=new Ticket( ticket_no, arrival_place, departure_place, no_of_tickets);
			System.out.println("TICKET BOOKED  SUCCESSFULLY");
		}
		else
		{
			System.out.println("TICKET IS ALREADY BOOKED");
		}
	}
	public void show_ticket_details()
	{
		if(this.t!=null)
		{
			System.out.println(t.getticket_no());
			System.out.println(t.getarrival_place());
			System.out.println(t.getdeparture_place());
			System.out.println(t.getno_of_tickets());
		}
		else
		{
			System.out.println("DETAILS NOT EXISTS");
		}
	}
	public void show_RedBus_Details()
	{
		if(this.t!=null)
		{
			System.out.println(bus_name);
			System.out.println(bus_no);
			
		}
		else
		{
			System.out.println("DETAILS NOT EXISTS");
		}
	}
	public void updatearrival_place()
	{
		Scanner scc=new Scanner(System.in);
		System.out.println("Enter the changed arrival place:\n");
		String arrival_place=scc.next();
		t.setarrival_place(arrival_place);
	}
	public void updatedeparture_place()
	{
		
		Scanner sd=new Scanner(System.in);
		System.out.println("Enter the changed departure place:\n");
		String departure_place=sd.next();
		t.setdeparture_place(departure_place);
	}
	public void cancel_ticket()
	{
		if(this.t!=null)
		{
			this.t=null;
			System.out.println("TICKET CANCELED SUCCESSFULLY");
		}
		else
		{
			System.out.println("TICKET ALREADY CANCELED");
		}
	}
}
class Ticket
{
	private int ticket_no;
	private String arrival_place;
	private String departure_place;
	private int no_of_tickets;
	
	Ticket()
	{

	}
	Ticket(int ticket_no)
	{
		this.ticket_no=ticket_no;
	}
	
	Ticket(int ticket_no,String arrival_place)
	{
		this(ticket_no);
		this.arrival_place=arrival_place;
	}
	Ticket(int ticket_no,String arrival_place,String departure_place)
	{
		this(ticket_no,arrival_place);
		this.departure_place=departure_place;
	}
	Ticket(int ticket_no,String arrival_place,String departure_place,int no_of_tickets)
	{
		this(ticket_no,arrival_place,departure_place);
		this.no_of_tickets=no_of_tickets;
	}
	public int getticket_no()
	{
		return ticket_no;
	}
	public String getarrival_place()
	{
		return arrival_place;
	}
	public String getdeparture_place()
	{
		return departure_place;
	}
	public int getno_of_tickets()
	{
		return no_of_tickets;
	}
	public void setticket_no(int ticket_no)
	{
		this.ticket_no=ticket_no;
	}
	public void setarrival_place(String arrival_place)
	{
		this.arrival_place=arrival_place;
	}
	public void setdeparture_place(String departure_place)
	{
		this.departure_place=departure_place;
	}
	public void setno_of_tickets(int no_of_tickets)
	{
		this.no_of_tickets=no_of_tickets;
	}
}		
