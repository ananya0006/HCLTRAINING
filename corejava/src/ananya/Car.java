package ananya;

public class Car {
	
	String colour;
	double price;
	String brand;
	Engine e;
	
	Car(String colour,double price,String brand,Engine e)
	{
		
		this.colour=colour;
		this.price=price;
		this.brand=brand;
		this.e=e;
	}
	public void details()
	{
		System.out.println(colour);
		System.out.println(price);
		System.out.println(brand);
		System.out.println(e.cc);
		System.out.println(e.engineNo);
	}
	
	
}
