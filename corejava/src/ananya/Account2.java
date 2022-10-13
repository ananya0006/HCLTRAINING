class ShopDriver
{
	public static void main(String[] args)
	{
	 Shop s=new Shop("Moulya Enterprises",536,"Ananya",87,"Stationary");
	
	System.out.println("--------Details b4 updating");
	System.out.println(s.getName());
	System.out.println(s.getID());
	System.out.println(s.getOwner());
	System.out.println(s.getGSTNumber());
	System.out.println(s.getshopType());
	
	System.out.println("--------Details after updating");
	
	s.setName("Ananya Enterprise");
	s.setID(8);
	s.setOwner("Bindu");
	s.setGSTNumber(4);
	s.setshopType("Wholesale Grocery");
	System.out.println(s.getName());
	System.out.println(s.getID());
	System.out.println(s.getOwner());
	System.out.println(s.getGSTNumber());
	System.out.println(s.getshopType());
	}
}
