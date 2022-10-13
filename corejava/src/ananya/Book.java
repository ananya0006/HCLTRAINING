package ananya;

public class Book {

	String brand;
	int noOfPages;
	double price;
	
	public Book(String brand, int noOfPages, double price) {
		super();
		this.brand = brand;
		this.noOfPages = noOfPages;
		this.price = price;
	}
	public Book(String brand, int noOfPages) {
		super();
		this.brand = brand;
		this.noOfPages = noOfPages;
	}
	public Book(String brand) {
		super();
		this.brand = brand;
	}
	public Book() {
		super();
	}
	public void details()
	{
		System.out.println("The brand is:"+brand);
		System.out.println("The brand is:"+noOfPages);
		System.out.println("The brand is:"+price);
	}
	 
}
