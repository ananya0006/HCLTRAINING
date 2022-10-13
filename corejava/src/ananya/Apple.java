package ananya;

public class Apple extends Fruit {

	Apple(String name,String origin)
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
