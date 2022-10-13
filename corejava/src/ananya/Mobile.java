package ananya;

public class Mobile {
	String brand;
	double price;
	EarPhone e;
	
	Mobile(String brand,double price)
	{
		this.brand=brand;
		this.price=price;
	}
	public void insertEarphone(EarPhone e) {
		if(this.e==null)
		{
			this.e=e;
			System.out.println("Earphone is inserted successfully");
		}
		else
		{
			System.out.println("Earphone already exists");
		}
	}
	public void removeEarphone()
	{
		if(this.e==null)
		{
			System.out.println("No earphone found to remove");
		}
		else
		{
			this.e=null;
			System.out.println("Earphone is removed successfully");
		}
		}
	public void details() {
		if(this.e==null)
		{
			System.out.println("no earphone is found to show details!");
		}
		else
		{
			System.out.println(e.brand);
			System.out.println(e.color);
			System.out.println(brand);
			System.out.println(price);
		}
	}
}
	


