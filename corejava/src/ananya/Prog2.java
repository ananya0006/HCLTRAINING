package ananya;

public class Prog2 {

	public static void areaOfCircle(int r)
	{
		double res=2*3.142*r;
		System.out.println(res);
		
	}
	public static void areaOfRectangle(int a,int  b)
	{
		int res = a*b;
		System.out.println(res);
	}
	public static void main(String[] args) {
		System.out.println("main start");
		System.out.println("area of circle is");
		areaOfCircle(5);
		System.out.println("area of rectangle is");
		areaOfRectangle(10,30);
		System.out.println("main ends");
		
	}
}
