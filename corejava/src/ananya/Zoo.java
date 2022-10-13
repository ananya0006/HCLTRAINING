import java.util.Scanner;
class Zoo
{
	String animalName="Lion";
	String animalID="4AL19IS006";
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
		System.out.println("This is all about lion");
	}
	
	
	public static void Play1()
	{
		System.out.println("Thanks for coming...!");
	}

	public static void main(String[] args)
	{
		Zoo x=new Zoo();
		System.out.println(x.animalName);
		System.out.println(x.animalID);
		System.out.println(x.animalType);
		
		x.Play();
		Play1();
	}
}