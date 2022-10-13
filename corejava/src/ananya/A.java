class A
{
public static void main(String[] args)
	{
	System.out.println("Main Starts");
	m1();
	m2();
	System.out.println("Main Ends");
	}
	public static void m1()
	{
	System.out.println("m1 is executing");
	m2();
	}
	public static void m2()
	{
		System.out.println("m2 is executing");
	}
}
	