package ananya;

public class FruitDriver {
public static void main(String[] args) {
	System.out.println("apple details:");
	Apple a=new Apple("appple","kashmir");
	a.details();
	
	System.out.println();
	
	System.out.println("Mango details:");
	Mango m=new Mango("Mango","Badami");
	m.details();
}
}
