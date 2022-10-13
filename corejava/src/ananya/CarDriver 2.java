class CarDriver
{
	public static void main(String[] args)
	{	
		Car c=new Car("Black",10000.00,"BMW",new Engine(125,233));
		System.out.println(c.colour);
		System.out.println(c.brand);
		System.out.println(c.price);
		System.out.println(c.e.eng_no);
		System.out.println(c.e.cc);
	}		
}