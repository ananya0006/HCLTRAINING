package ananya;

public class Theatre {
	
String name;
String address;
double ticketPrice;
public Theatre(String name, String address, double ticketPrice) {
	super();
	this.name = name;
	this.address = address;
	this.ticketPrice = ticketPrice;
}
public Theatre(String name, String address) {
	super();
	this.name = name;
	this.address = address;
}
public Theatre(String name) {
	super();
	this.name = name;
}
public Theatre() {
	super();
}
public  void details()
{
	System.out.println("The name is"+name);
	System.out.println("The address is"+address);
	System.out.println("The ticket price is"+ticketPrice);
	
	
}

}
