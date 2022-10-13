package ananya;

public class BookDriver {
public static void main(String[] args) {
	
	Book b =new Book("classmate",100,200);
	b.details();
	System.out.println("------------------------");
	
	Book b1 =new Book("ganesha",200,300.0);
	b1.details();
}
}
