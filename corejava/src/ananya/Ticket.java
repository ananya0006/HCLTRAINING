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