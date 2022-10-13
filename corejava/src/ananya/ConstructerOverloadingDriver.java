package ananya;

public class ConstructerOverloadingDriver {
public static void main(String[] args) {
	ConstructerOverloading c = new ConstructerOverloading(06,"ananya","alvas");
	System.out.println(c.usn);
	System.out.println(c.name);
	System.out.println(c.clgName);
	ConstructerOverloading c1=new ConstructerOverloading();// (empty constructer)runs perfectly since it has a empty constructer in ConstructerOverloading class
	
}
}
