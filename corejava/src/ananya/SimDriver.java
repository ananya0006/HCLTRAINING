package ananya;

public class SimDriver {
	
public static void main(String[] args) {
	Sim s=new Sim("Airtel",121312423,233.0,"4G");
	System.out.println(s.getServiceProvider());
	System.out.println(s.getSimNo());
	System.out.println(s.getBalance());
	System.out.println(s.getType());
	System.out.println("setting ...");
	s.setBalance(590);
	System.out.println(s.getBalance());
	System.out.println();
	System.out.println("print updated");
	s.details();
}
}
