package ananya;
import java.util.Scanner;
public class MobileDriver {
public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	Mobile m=new Mobile("Iphone",12000);
	boolean exit=true;
	while(exit) {
		System.out.println("Enter your choice:\n 1.Insert earphone\n 2.Remove Earphone\n 3.Details\n 4.Exit\n");
		int choice=sc.nextInt();
		switch(choice) {
		case 1:
		{
			System.out.println("Enter the brand");
			String brand=sc.next();
			System.out.println("Enter the color");
			String color=sc.next();
			System.out.println("Enter the price:");
			double price=sc.nextDouble();
			m.insertEarphone(new EarPhone(brand,color,price));
			System.out.println("Earphone is created");
			
		}
		break;
		case 2:{
			m.removeEarphone();
			
		}
		break;
		case 3:{
			m.details();
			
		}
		break;
		case 4:{
			exit=false;
		}
		break;
		default:
		{
			System.out.println("Invalid choice");
		}
	}
		
	}
}
}
