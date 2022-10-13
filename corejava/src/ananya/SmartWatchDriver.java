package ananya;
import java.util.Scanner;

public class SmartWatchDriver {
	
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		Mobile1 m=new Mobile1("4G",3555231);
		boolean exit=true;
		while(exit) {
			System.out.println("Enter your choice:\n 1.connect watch\n 2.disconnect watch\n 3.Details\n 4.Exit\n");
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
				m.connectWatch(new SmartWatch(brand,color,price));
				System.out.println("Smartwatch is connected successfully");
				
			}
			break;
			case 2:{
				m.disconnectWatch();
				
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


