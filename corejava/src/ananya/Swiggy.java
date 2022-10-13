package ananya;

public class Swiggy {
	private String hotelName;
	private String GSTNo;
	private String address;
	private double bill;
	
	Swiggy()
	{
		
	}
	Swiggy(String hotelName)
	{
		this.hotelName=hotelName;
		
	}
	Swiggy(String hotelName,String GSTNo)
	{
		this(hotelName);
		this.GSTNo=GSTNo;
		
	}
	Swiggy(String hotelName,String GSTNo,String address)
	{
		this(hotelName,GSTNo);
		this.address=address;
		
	}

	Swiggy(String hotelName,String GSTNo,String address,double bill)
	{
	this(hotelName,GSTNo,address);
	this.bill=bill;
	
	}
	
	public String getHotelName()
	{
		return hotelName;
	}
	public String getGSTNo()
	{
		return GSTNo;
	}
	public String getAddress()
	{
		return address;
	}
	public double getBill()
	{
		return bill;
	}
	public void setBill(double bill)
	{
		this.bill=bill;
	}
	
	public void details()
	{
		System.out.println(hotelName);
		System.out.println(GSTNo);
		System.out.println(address);
		System.out.println(bill);
	}
	
	
}
