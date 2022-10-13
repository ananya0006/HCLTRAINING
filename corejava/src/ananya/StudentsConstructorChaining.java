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
			this(name);
			this.id=id;	
		}
	StudentsConstructorChaining(String name,long id,String place)
		{
			this(name,id);
			this.place=place;
		}
	StudentsConstructorChaining(String name,long id,String place,double fees)
		{
			this(name,id,place);
			this.fees=fees;
		}
	public  void StudentDetails()
	{
		
		System.out.println("The name of the student is:"+name);
		System.out.println("The id of the student is:"+id);
		System.out.println("The place of the student is:"+place);
		System.out.println("The fees of the student is:"+fees);	
	}
	//MAIN IS IN STUDDETAILS.JAVA
	
}