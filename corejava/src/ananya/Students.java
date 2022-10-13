class StudentsConstructorChaining
{
	String name;
	long id;
	String place;
	double fees;
	StudentsConstructorChaining()
		{
			
		}
	 StudentsConstructorChaining(String name)
		{
			this.name=name;
			
		}
	StudentsConstructorChaining(String name,long id)
		{
			this.name=name;
			this.id=id;	
		}
	StudentsConstructorChaining(String name,long id,String place)
		{
			this.name=name;
			this.id=id;	
			this.place=place;
		}
	StudentsConstructorChaining(String name,long id,String place,double fees)
		{
			this.name=name;
			this.id=id;	
			this.place=place;
			this.fees=fees;
		}
	public  void StudentDetails()
	{
		
		System.out.println("The name of the student is:"+name);
		System.out.println("The id of the student is:"+id);
		System.out.println("The place of the student is:"+place);
		System.out.println("The fees of the student is:"+fees);	
	}
	
	public static void main(String args[])
	{
		System.out.println("Program Starts");
		StudentsConstructorChaining s=new StudentsConstructorChaining("ananya",2213423,"Mysore",206765.00);
		s.StudentDetails();
		System.out.println("---------------------------------------------------------------------------------");
		StudentsConstructorChaining s1=new StudentsConstructorChaining("moulya",006,"banglore(yelahanka)");
		s1.StudentDetails();
		System.out.println("---------------------------------------------------------------------------------");
		StudentsConstructorChaining s2=new StudentsConstructorChaining("bindu",06);
		s2.StudentDetails();
		System.out.println("---------------------------------------------------------------------------------");
		StudentsConstructorChaining s3=new StudentsConstructorChaining("Anu");
		s3.StudentDetails();
		System.out.println("---------------------------------------------------------------------------------");
		StudentsConstructorChaining s4=new StudentsConstructorChaining();
		s4.StudentDetails();
		System.out.println("---------------------------------------------------------------------------------");
		System.out.println("Program Ends");
	}
}