class Students
{
	String name;
	long id;
	String place;
	double fees;
	Students()
		{
			
		}
	 Students(String name)
		{
			this.name=name;
			
		}
	Students(String name,long id)
		{
			this.name=name;
			this.id=id;	
		}
	Students(String name,long id,String place)
		{
			this.name=name;
			this.id=id;	
			this.place=place;
		}
	Students(String name,long id,String place,double fees)
		{
			this.name=name;
			this.id=id;	
			this.place=place;
			this.fees=fees;
		}
	
	
	public static void main(String args[])
	{
		System.out.println("Program Starts");
		Students s=new Student("ananya",2213423,"Mysore",206765.00);
		Students s=new Student("ananya",2213423,"Mysore");
		System.out.println("Program Ends");
	}
}