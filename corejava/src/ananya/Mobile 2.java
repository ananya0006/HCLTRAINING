class Mobile
{
	String brand;
	String colour ;
	double  price;
	int ram;
	Sim s;
	
	Mobile(String brand,String colour ,double price,int ram,Sim s)
	{
		this.brand =brand ;
		this.colour =colour ;
		this.price =price ;
		this.ram=ram;
		this.s=s;
	}
	public void PrintMobileDetails()
	{
		System.out.println(brand);
		System.out.println(colour);
		System.out.println(price);
		System.out.println(ram);
	}
	
	public void PrintSimDetails()
	{
		System.out.println(s.talk_time);
		System.out.println(s.service_provider);
		System.out.println(s.sim_no);
		
	}
	
	
}