package ananya;

public class SchoolDriver {
public static void main(String[] args) {
	School s=new School("GSSS","Vindhya",600,"mysore");
	System.out.println("the details are...!");
	System.out.println(s.getName());
	System.out.println(s.getPrincipal());
	System.out.println(s.getNoOfStudents());
	System.out.println(s.getAddress());
	
	System.out.println("Setting methods..!");
	s.setNoOfStudents(90);
	s.setPrincipal("Ananya");
	System.out.println(s.getNoOfStudents());
	System.out.println(s.getPrincipal());
	
	System.out.println("printing though method-details:updated results will come:");
	s.details();
	
	
	System.out.println("From another obj reference:");
	School s1=new School("Vidhyashram","Kushi",900,"mysore jayalaksmipuram");
	s1.details();
}
}
