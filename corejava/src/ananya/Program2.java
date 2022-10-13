package ananya;
import java.util.Scanner;
public class Program2 {
public static void main(String[] args) {
	
	
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a character\n");
		char ch=sc.next().charAt(0);
		if(ch>='A' &&  ch<='Z')
		{
			System.out.println("lucky");
		}
}
}
