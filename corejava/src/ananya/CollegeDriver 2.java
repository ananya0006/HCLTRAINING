import java.util.Scanner;
class CollegeDriver
{
	public static void main(String[] args)
	{
		Scanner s=new Scanner(System.in);
		System.out.println("Enter the clg name");
		String college_name=s.next();
		System.out.println("Enter the Location");
		String location =s.next();
		System.out.println("Enter the capacity");
		int capacity =s.nextInt();
		College c= new College(college_name,location,capacity,principal_name);
		boolean exit=true;
		while(exit)
		{
			
		System.out.println("Enter the operation to be performed");
		System.out.println("1.AddStudent \n 2.Student Details\n 3.College Details\n 4.Remove Student\n");
		int choice=s.nextInt();
		switch(choice)
		{
			case 1: c.AddStudent();
			break;
			case 2: c.ShowStudentDetails();
			break;
			case 3: c.ShowCollegeDetails();
			break;
			case 4:c.RemoveStudent();
			break;
			case 5:exit=false;
			break;
			default:System.out.println("Enter the numbers shown above");
                                 }
                     }
          }

}
class College
{
	String college_name;
	String location;
	int capacity;
	String principal_name;
	Student s;
	College(String college_name,String location,int capacity,String principal_name)
	{
		this.college_name=college_name;
		this. location= location;
		this.capacity=capacity;
		this.principal_name=principal_name;
	}
	public void AddStudent()
	{
		this.s=new Student("ananya",21,"female");
		System.out.println("student added successfully");
	}
	
	public void ShowStudentDetails()
	{
		System.out.println(s.name);
		System.out.println(s.age);
		System.out.println(s.gender);
	}
	public void ShowCollegeDetails()
	{
		System.out.println(college_name);
		System.out.println(location);
		System.out.println(capacity);
		System.out.println(principal_name);
	}
	public void RemoveStudent()
	{	
		this.s=null;
		System.out.println("the student removed successfully");
	}
}

class Student
{
	String name;
	int age;
	String gender;
	Student(String name,int age,String gender)
	{
		this.name=name;
		this.age=age;
		this.gender=gender;
	}
}