import java.util.Scanner;
class Loop
{
public static void OneToTen()
{

	Scanner s=new Scanner(System.in);
	System.out.println("Enter the m value:");
	int m=s.nextInt();
	System.out.println("Enter the n value:");
	int n=s.nextInt();
	
	for(int i=m;i<=n;i++)
		{
			System.out.println(i);
		}
}
public static void main(String[] args)
{
OneToTen();
}
}