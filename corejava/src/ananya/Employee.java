class Zoo
{
	String name="Lion";
	String animalID="4AL19IS006";
	int animalAge=08;
	String animalType="Carnivorous";

		static
		{
			System.out.println("Welcome to Zoo Details");
		}
		static
		{
			System.out.println("Lion is a ferrocious animal");
		}

			
	
	public void Play()
	{
		System.out.println("Employee is working");
	}
	public void Play1()
	{
		System.out.println("Employee is working");
	}
	
	public static void Play2()
	{
		System.out.println("Employee is not working");
	}

	public static void main(String[] args)
	{
		Employee x=new Employee();
		System.out.println(x.name);
		System.out.println(x.animalAge);
		System.out.println(x.animalId);
		System.out.println(x.animalType);
		x.Play1();
		x.play();
		Play2();
	}
}