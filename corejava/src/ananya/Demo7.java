package ananya;

public class Demo7 {

	public static void main(String[] args) {
		System.out.println("Counting the no of digits in a given no.");
		int a=1234569897;
		int count=0;
		while(a!=0)
		{
			count++;
			a=a/10;
		}
		
		System.out.println(count);
		
		
	}
}
