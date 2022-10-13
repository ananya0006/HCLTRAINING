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