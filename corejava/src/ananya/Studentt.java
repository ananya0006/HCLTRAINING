class Studentt
{
	String name;	
	String ID ;
	String branch;
	int sem;
		Studentt()
			{
	
			}
		Studentt(String name)
		{
			this.name=name;
		}
		Studentt(String name,String ID)
			{
				this.name=name;
				this.ID=ID;
			}
		Studentt(String name,String ID,String branch)
			{
				this.name=name;
				this.ID=ID;
				this.branch=branch;
			}
		Studentt(String name,String ID,String branch,int sem)
			{
				this.name=name;
				this.ID=ID;
				this.branch=branch;
				this.sem=sem;
			}
	public  void StudentDetails()
			{
				System.out.println("The NAME of the student is:"+name);
				System.out.println("The ID of the student is:"+ID);
				System.out.println("The BRANCH of the student is:"+branch);
				System.out.println("The  student is studying in:"+sem);
			}
	public static void main(String[] args)
			{
				Studentt s=new Studentt();
				s.StudentDetails();
				System.out.println("=============================================");

				Studentt s1=new Studentt("Ananya");
				s1.StudentDetails();
				System.out.println("=============================================");

				Studentt s2=new Studentt("Ananya","4AL19IS006");
				s2.StudentDetails();
				System.out.println("=============================================");

				Studentt s3=new Studentt("Ananya","4AL19IS006","ISE");
				s3.StudentDetails();
				System.out.println("=============================================");

				Studentt s4=new Studentt("Ananya","4AL19IS006","ISE",6);
				s4.StudentDetails();
				System.out.println("=============================================");
			}
}	

		


