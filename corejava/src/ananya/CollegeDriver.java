package ananya;

public class CollegeDriver {
public static void main(String[] args) {
	
	College c1=new College("alvas","mangalore");
	College c2=c1;
	College c3=c2;
	System.out.println("printing from obj refernces:");
	System.out.println();
	System.out.println(c2.name);
	System.out.println(c3.name);
	System.out.println(c1.name);
	System.out.println();
	System.out.println("printing from the method - details:");
	System.out.println();
	c1.details();
	}
}
