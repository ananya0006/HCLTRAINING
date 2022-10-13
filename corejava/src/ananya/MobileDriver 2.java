import java.util.Scanner;
class MobileDriver
{
	public static void main(String[] args)
	{	
		Scanner s=new Scanner(System.in);
		System.out.println("Enter the brand name");
		String brand=s.next();
		System.out.println("Enter the colour of mobile ");
		String colour=s.next();
		System.out.println("Enter the price of mobile");
		Double price=s.nextDouble();
		System.out.println("Enter the Ram size");
		int ram=s.nextInt();
		System.out.println("Enter the talk_time name");
		int talk_time=s.nextInt();
		System.out.println("Enter the ServiceProvider name");
		String service_provider=s.next();
		System.out.println("Enter the sim_no ");
		Long sim_no=s.nextLong();

		Mobile m=new Mobile(brand,colour,price,ram, new Sim(talk_time,service_provider,sim_no));
		m.PrintMobileDetails();
		System.out.println("-----------------------------------------------------");
		m.PrintSimDetails();	
	}
}