class Driver
{
	public static void main(String[] args)
	{
	Parent p=new Child();
	Child c=(Child)p;
	System.out.println(c.a);
	c.m1();
	System.out.println(c.b);
	c.m2();
	}

}










