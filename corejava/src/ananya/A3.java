class A4
{
public static void main(String[] args)
	{
	System.out.println("Program started");
	
	Ram();
	System.out.println("Program Ended");
	}

	public static void Ram()
	{
	System.out.println("Program started");
	System.out.println("m1() is executing");
	Lakshman();
	System.out.println("Program Ended");
	}

	public static void Sita()
	{
		System.out.println("Program started");
		System.out.println("Sita is executing");
		
		System.out.println("Program Ended");
	}
	public static void Lakshman()
	{
		System.out.println("Program started");
		Sita();
		System.out.println("Program Ended");
	}
}
	