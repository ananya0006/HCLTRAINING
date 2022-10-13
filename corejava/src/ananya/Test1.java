package ananya;

public class Test1 {
public static void main(String[] args) {
	int  a=10;
	int b=15;
	int c=20;
	int d=5;
	boolean bo=(a>d || b<c) && ( b>d || c<a);
	System.out.println(bo);
}
}
