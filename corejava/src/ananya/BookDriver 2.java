class BookDriver
{
public static void main(String[] args)
	{

	Book1 b=new Book1();
	b.BookDetails();
	System.out.println("-----------------------------");
	Book1 b1=new Book1(06);
	b1.BookDetails();
	System.out.println("-----------------------------");
	Book1 b2=new Book1(06,"Ananya");
	b2.BookDetails();
	System.out.println("-----------------------------");
	Book1 b3=new Book1(06,"Ananya","Qsbt");
	b3.BookDetails();
	System.out.println("-----------------------------");
	Book1 b4=new Book1(06,"Ananya","Qsbt","06/08/2001");
	b4.BookDetails();
	System.out.println("-----------------------------");
	
	System.out.println(b2.getName());
	}
}

	