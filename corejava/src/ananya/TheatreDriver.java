package ananya;

public class TheatreDriver {
public static void main(String[] args) {
	Theatre t =new Theatre();
	t.details();
	System.out.println("-----------------------");
	Theatre t1 =new Theatre("PVR","Mysore",500.0);
	t1.details();
	
	System.out.println("-----------------------");
	
	Theatre t2 =new Theatre("Inox","Yelahanka");
	t2.details();
	
	System.out.println("-----------------------");
	
	Theatre t3 =new Theatre("Cinepolis");
	t3.details();
	
	System.out.println("-----------------------");
}
}
