package ananya;

public class Mango extends Fruit{
	
	Mango(String name,String origin)
	{
		this.name=name;
		this.origin=origin;
	}
	public void details()
	{
		System.out.println(name);
		System.out.println(origin);
	}
}
