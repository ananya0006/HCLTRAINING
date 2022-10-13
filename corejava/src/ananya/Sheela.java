package ananya;

public class Sheela extends Ram{
	int b=20;
	
public static void main(String[] args) {
	
	//child 
	Sheela s=new Sheela();
	System.out.println(s.b);
	System.out.println(s.a);
	
	Ram r=new Ram();
	System.out.println(r.a);
	//System.out.println(r.b); CTE (b is in child class)
	
	Ram r1= new Sheela();//upcasting(storing sheela in ram
	System.out.println(r1.a);
	//System.out.println(r1.b); cte ( since class sheela is upcasted it cant access its members
	Sheela s1=(Sheela) r1;//downcasting
	System.out.println(s1.b);//now can print ok
	
	}
}
