package ananya;

public class SwiggyDriver {
	public static void main(String[] args) {
	System.out.println("printing all through getters:");
	Swiggy s=new Swiggy("Brahmin's Tifffin Centre","BR19867","Mysore",400);
	System.out.println(s.getHotelName());
	System.out.println(s.getGSTNo());
	System.out.println(s.getAddress());
	System.out.println(s.getBill());
	System.out.println();
	System.out.println("setting bill..");
	s.setBill(799);
	System.out.println(s.getBill());
	System.out.println();
	System.out.println("printing all updated details:");
	s.details();
	
}
}
